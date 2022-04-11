import java.util.*;

/**
 * 문제 번호 : Solution_12950
 * 문제명 : 행렬의 덧셈
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12950?language=java
 */
public class Solution_12950 {
    
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] result = new int[arr1.length][arr1[0].length];

        // 2중 for문으로 각 배열 값 더하기
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return result;
    }
}