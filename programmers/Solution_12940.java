import java.util.*;

/**
 * 문제 번호 : Solution_12940
 * 문제명 : 최대공약수 최소공배수
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12940?language=java
 */
public class Solution_12940 {
    
    public int[] solution(int n, int m) {

        // 둘 중 큰 수, 작은 수 판단

        int bigger = 0;
        int smaller = 0;
        
        if (n >= m) {
            bigger = n;
            smaller = m;
        } else {
            bigger = m;
            smaller = n;
        }

        //최대공약수
        System.out.println("result_1 : " + gcd(bigger, smaller));

        //최소공배수
        System.out.println("result_2 : " + lcm(bigger, smaller));

        // 결과변수 선언
        int[] result = new int[2];
        result[0] = gcd(bigger, smaller);
        result[1] = lcm(bigger, smaller);
        
        return result;
    } 

    //최대 공약수
    public int gcd (int bigger, int smaller) {
        if (bigger % smaller == 0) {
            return smaller;
        } else {
            return gcd(smaller, bigger % smaller);
        }
    }

    //최소 공배수
    public int lcm (int bigger, int smaller) {
        return (bigger * smaller) / gcd(bigger, smaller);
    }
}