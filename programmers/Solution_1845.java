import java.util.*;

/**
 * 문제 번호 : Solution_1845
 * 문제명 : 폰켓몬
 * URL : https://programmers.co.kr/learn/courses/30/lessons/1845
 */
public class Solution_1845 {
    
    public int solution(int[] nums) {

        // List로 Set을 구성함으로서 중복데이터 제거
        HashSet<Integer> set = new HashSet<Integer>();

        // set에 nums의 데이터 삽입 (중복된 데이터가 들어가도 set구조에선 중복데이터가 쌓이지 않음)
        for (int i : nums) {
            set.add(i);
        }

        // 'num의 갯수/2' 와 set의 갯수를 비교 후 작은 수 반환
        return ((nums.length / 2) > set.size()) ? set.size() : (nums.length / 2);
    }
}