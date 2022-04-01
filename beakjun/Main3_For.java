import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main3_For {

    private static Logger logger = Logger.getLogger("Mylogger");

    public static void main(String[] args) {

        // BufferedReader로 입력 처리
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String input = br.readLine();

        // 백준 단계별로 풀어보기

        // 3. for문
        // 3-1
        // logger.info("3-1 : 시스탬 입력, for문, 구구단");
        // Scanner sc1 = new Scanner(System.in);
        // int value1 = sc1.nextInt();
        // for (int i = 1; i < 10; i ++) {
        //     System.out.println(value1 + " * " + i + " = " + (value1*i));
        // }
        // 3-2
        // logger.info("3-2 : 시스탬 입력, for문, 입력 반복문");
        // Scanner sc1 = new Scanner(System.in);
        // int value1 = sc1.nextInt();
        // for (int i = 0; i < value1; i ++) {
        //     int value2 = sc1.nextInt();
        //     int value3 = sc1.nextInt();
        //     System.out.println(value2 + value3);
        // }
        // 3-3
        // logger.info("3-3 : 시스탬 입력, for문, 반복 합");
        // Scanner sc1 = new Scanner(System.in);
        // int value1 = sc1.nextInt();
        // int result = 0;
        // for (int i = 1; i <= value1; i ++) {
        //     result += i;
        // }
        // System.out.println(result);
        // 3-4
        // logger.info("3-4 : 시스탬 입력, for문, 반복 합, 시간제한");
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        // String input = br.readLine();
        // int count = Integer.parseInt(input);
        // //출력에 시간제한이 있어서 println을 반복하는 것은 시간이 맞지 않는다.
        // //StringBuilder를 사용함으로써 println의 반복을 줄인다.
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < count; i++) {
        //     String innerInput = br.readLine();
        //     int value1 = Integer.parseInt(innerInput.split(" ")[0]);
        //     int value2 = Integer.parseInt(innerInput.split(" ")[1]);
        //     int result = value1 + value2;
        //     sb.append(result + "\n");
        // }
        // System.out.print(sb);
        // 3-5
        // logger.info("3-5 : 시스탬 입력, for문, N 찍기");
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        // String input = br.readLine();
        // int count = Integer.parseInt(input);
        // for (int i = 1; i <= count; i++) {
        //     System.out.println(i);
        // }
        // 3-6
        // logger.info("3-6 : 시스탬 입력, for문, 기찍 N");
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        // String input = br.readLine();
        // int count = Integer.parseInt(input);
        // for (int i = count; i > 0; i--) {
        //     System.out.println(i);
        // }
        // 3-7
        // logger.info("3-7 : 시스탬 입력, for문, A+b - 7");
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        // String input = br.readLine();
        // int count = Integer.parseInt(input);
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < count; i++) {
        //     String innerInput = br.readLine();
        //     int value1 = Integer.parseInt(innerInput.split(" ")[0]);
        //     int value2 = Integer.parseInt(innerInput.split(" ")[1]);
        //     int result = value1 + value2;
        //     sb.append("Case #" + (i + 1) + ": " + result + "\n");
        // }
        // System.out.print(sb);
        // 3-8
        // logger.info("3-8 : 시스탬 입력, for문, A+b - 8");
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        // String input = br.readLine();
        // int count = Integer.parseInt(input);
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < count; i++) {
        //     String innerInput = br.readLine();
        //     int value1 = Integer.parseInt(innerInput.split(" ")[0]);
        //     int value2 = Integer.parseInt(innerInput.split(" ")[1]);
        //     int result = value1 + value2;
        //     sb.append("Case #" + (i + 1) + ": " + value1 + " + " + value2 + " = " + result + "\n");
        // }
        // System.out.print(sb);
        // 3-9
        // logger.info("3-9 : 시스탬 입력, for문, 별찍기 - 1");
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        // String input = br.readLine();
        // int count = Integer.parseInt(input);
        // StringBuilder sb = new StringBuilder("*");
        // for (int i = 0; i < count; i++) {
        //     System.out.println(sb);
        //     sb.append("*");
        // }
        // 3-10
        // logger.info("3-10 : 시스탬 입력, for문, 별찍기 - 1");
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        // String input = br.readLine();
        // int count = Integer.parseInt(input);
        // StringBuilder sb = new StringBuilder("*");
        // for (int i = 0; i < count; i++) {
        //     System.out.println(sb);
        //     sb.append("*");
        // }
        // 3-11
        // logger.info("3-11 : 시스탬 입력, for문, 별찍기 - 2");
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        // String input = br.readLine();
        // int count = Integer.parseInt(input);
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < count-1; i++) {
        //     sb.append(" ");
        // }
        // sb.append("*");
        // for (int i = 0; i < count; i++) {
        //     System.out.println(sb);
        //     sb.deleteCharAt(0);
        //     sb.append("*");
        // }
    }
}




 