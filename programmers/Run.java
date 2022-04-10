import java.util.*;
public class Run {
    public static void main(String[] args) {

        int solution_no = 1845;

        switch (solution_no) {
            case 92334:     // 신고 결과 받기
                String[] id_list = {"muzi", "frodo", "apeach", "neo"};
                String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
                int k = 2;
                Solution_92334 solution_92334 = new Solution_92334();
                int[] answer_92334 = solution_92334.solution(id_list, report, k);
                System.out.println(Arrays.toString(answer_92334));
                break;
            case 1845:      // 폰켓몬
                int[] nums = {3,1,2,3};
                Solution_1845 solution_1845 = new Solution_1845();
                int answer_1845 = solution_1845.solution(nums);
                System.out.println(answer_1845);
                break;
        }

    }
}
