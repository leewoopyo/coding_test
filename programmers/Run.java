import java.util.*;
public class Run {
    public static void main(String[] args) {

        int solution_no = 12943;

        switch (solution_no) {
            case 92334:     // 신고 결과 받기
                String[] id_list = {"muzi", "frodo", "apeach", "neo"};
                String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
                int k = 2;
                int[] answer_92334 = new Solution_92334().solution(id_list, report, k);
                System.out.println(Arrays.toString(answer_92334));
                break;
            case 1845:      // 폰켓몬
                int[] nums = {3,1,2,3};
                int answer_1845 = new Solution_1845().solution(nums);
                System.out.println(answer_1845);
                break;
            case 12922:      // 수박수박수박수박수박수?
                int n = 9;
                String answer_12922 = new Solution_12922().solution(n);
                System.out.println(answer_12922);
                break;
            case 12969:      // 직사각형 별찍기
                new Solution_12969().solution();
                break;
            case 12954:      // x만큼 간격이 있는 n개의 숫자
                int x = 2;
                int y = 5;
                long[] answer_12954 = new Solution_12954().solution(x, y);
                System.out.println(Arrays.toString(answer_12954));
                break;
            case 12950:      // x만큼 간격이 있는 n개의 숫자
                int[][] arr1 = {{1,2},{2,3}};
                int[][] arr2 = {{3,4},{5,6}};
                int[][] answer_12950 = new Solution_12950().solution(arr1, arr2);
                System.out.println(Arrays.toString(answer_12950));
                break;
            case 12948:      // 핸드폰 번호 가리기
                String phone_number = "01033334444";
                String answer_12948 = new Solution_12948().solution(phone_number);
                System.out.println(answer_12948);
                break;
            case 12947:      // 하샤드 수
                int x_12947 = 18;
                Boolean answer_12947 = new Solution_12947().solution(x_12947);
                System.out.println(answer_12947);
                break;
            case 12943:      // 콜라츠 추측
                int num = 18;
                int answer_12943 = new Solution_12943().solution(num);
                System.out.println(answer_12943);
                break;
        }
    }
}
