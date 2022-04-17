import java.util.*;

/**
 * 문제 번호 : Solution_12948
 * 문제명 : 핸드폰 번호 가리기
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12948?language=java
 */
public class Solution_12948 {
    
    public String solution(String phone_number) {

        // 받은 인자를 char[]로 수정
        char[] phone_number_chars = phone_number.toCharArray();

        // StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();

        // 전화번호 길이 - 4 만큼 반복하며 Stringbuilder에 '*'를 붙임
        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append("*");
        }

        // 마지막 4자리의 char[]를 StringBuilder에 붙임
        for (int i = phone_number.length() - 4; i < phone_number.length(); i++) {
            sb.append(phone_number_chars[i]);
        }

        return sb.toString();
    }
}