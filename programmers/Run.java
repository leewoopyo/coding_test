import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Run {
    public static void main(String[] args) {

        int solution_no = 92334;

        switch (solution_no) {
            case 92334: 
                String[] id_list = {"muzi", "frodo", "apeach", "neo"};
                String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
                int k = 2;
                Solution_92334 solution = new Solution_92334();
                int[] answer = solution.question(id_list, report, k);
                System.out.println(Arrays.toString(answer));
                break;
        }
    }
}
