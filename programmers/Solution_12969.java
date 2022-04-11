import java.util.*;

/**
 * 문제 번호 : Solution_12969
 * 문제명 : 직사각형 별찍기
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12969?language=java
 */
public class Solution_12969 {
    
    public void solution() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 이중 for문
        // 안쪽 for문으로 열을 구성
        // 바깥 for문으로 행을 구성
        for (int i = 0; i < b; i++) {
            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < a; j++) {
                sb.append("*");
            }
            System.out.println(sb);
        } 

    }
}