import java.util.*;
/**
 * 문제 번호 : Solution_12922
 * 문제명 : 수박수박수박수박수박수?
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12922?language=java
 */
public class Solution_12922 {
    
    public String solution(int n) {

        // 문자열을 추가로 붙일 StringBuilder를 선언
        StringBuilder result = new StringBuilder();
        
        // n/2 만큼 반복을 돌리면서 "수박" 을 붙임
        for (int i = 0; i < n/2; i++) {
            result.append("수박");
        }

        // 홀수면 "수" 글자를 붙임
        if (n % 2 == 1) {
            result.append("수");
        }

        return result.toString();
    }
}