import java.util.*;

/**
 * 문제 번호 : Solution_12947
 * 문제명 : 하샤드 수
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12947?language=java
 */
public class Solution_12947 {
    
    public boolean solution(int x) {
        // 인수값을 String 으로 변환 후 charArray오 변환
        char[] char_array = Integer.toString(x).toCharArray();
        // 각 자리의 숫자 합계 변수 선언
        int sum = 0;

        // charArray를 반복 돌리면서 sum에 더함
        for (char c : char_array) {
            sum += Character.getNumericValue(c);
        }

        // 만약 x를 sum으로 나눈 나머지가 0이면 true반환 아니며 false반환
        return (x % sum == 0) ? true : false;
    }
}