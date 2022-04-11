import java.util.*;

/**
 * 문제 번호 : Solution_12954
 * 문제명 : x만큼 간격이 있는 n개의 숫자
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12954?language=java
 */
public class Solution_12954 {
    
    public long[] solution(int x, int n) {

        long[] result = new long[n];
        // 반복 증가 값을 담을 변수 추가
        long value = 0;

        // 반복문을 통해서 반복 값을 증가시키고, 배열에 값 할당
        for (int i = 0; i < n; i++) {
            value += x;
            result[i] = value;
        }

        return result;
    }
}