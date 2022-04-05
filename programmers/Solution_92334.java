import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 문제 번호 : Solution_92334
 * 문제명 : 신고 결과 받기
 * URL : https://programmers.co.kr/learn/courses/30/lessons/92334?language=java
 */
public class Solution_92334 {
    
    /**
     * 
     */
    public int[] question(String[] id_list, String[] report, int k) {
        int[] answer = {};

        // 배열 변수인 report의 중복을 제거한다.
        report = Arrays.stream(report).distinct().toArray(String[]::new);
        
        // 신고자와 메일 횟수를 표현하는 변수
        Map<String, Integer> result = new LinkedHashMap<>();

        // 신고당한자, 신고한자 리스트
        Map<String, ArrayList<String>> reportMap = new HashMap<>();

        // 신고자들이 받은 메일횟수 초기화
        for (int i = 0; i < id_list.length; i++) {
            result.put(id_list[i], 0);
        }

        // 신고한 자, 신고당한자
        for (int i = 0;i < report.length; i++) {
            
            // 신고한자, 신고당한자
            String[] arrReport = report[i].split(" ");
            // 신고한 자
            String reporter = arrReport[0];
            // 신고당한 자
            String target = arrReport[1];

            // 만약 reportMap의 key에 target이 포함되어 있다면
            if (reportMap.containsKey(target)) { 
                // target의 list value에 reporter를 추가한다.
				reportMap.get(target).add(reporter);
            // key에 타겟이 포함되어 있지 않다면
			} else { 
                // 리스트를 만들어서
				ArrayList<String> list = new ArrayList<String>();
                // 리스트에 신고자를 추가한 후
				list.add(reporter);
                // reportMap에 타겟과 신고자 리스트를 추가한다.
				reportMap.put(target, list);
			}

        }

        // reportMap을 반복문으로 돌리면서
        for (String key : reportMap.keySet()) {
            // 만약 value list의 길이가 k이상이면
            if (reportMap.get(key).size() >= k) {
                // value list를 돌리면서
				for (String i : reportMap.get(key)) {
                    // result 변수에 신고자랑 , 신고 횟수를 넣는다.
					result.put(i, result.getOrDefault(i, 0) + 1);
				}
			}
        }

        
        return result.values().stream().mapToInt(Integer::intValue).toArray();
    }
}