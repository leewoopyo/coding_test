import java.util.*;

/**
 * 문제 번호 : Solution_12943
 * 문제명 : 콜라츠 추측
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12943?language=java
 */
public class Solution_12943 {
    
    public int solution(int num) {

        /**
         * int형을 변수를 계산하다보면 int의 최대값을 넘기를 오버플로우가 발생하는 경우가 있다.
         * 그럴 땐 long형으로 변환해서 계산한다.
         */ 
        long l_num = num;
        int count = 0;

        // count가 500을 넘기지는 않도록 한다.
        while(l_num != 1) {
            
            // count 1증가
            count++;

            // 짝수면 2로 나누고, 홀수면 3곱한 후 1을 더함
            l_num = (l_num % 2) == 0 ? l_num / 2 : l_num * 3 + 1;

            //System.out.printf("count : %d, num : %d \n", count, l_num);
            
            // num가 1일 떄 count를 반환
            if (count == 500) return -1;
        }

        return count;
    }
}