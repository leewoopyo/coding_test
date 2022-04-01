import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main4_While {

    private static Logger logger = Logger.getLogger("Mylogger");

    public static void main(String[] args) {

        //처리 속도를 향상시키기 위해서 BufferedReader를 사용

        //테스트케이스 종료 조건이 명시 되지 않았을 경우
        //Scanner의 경우 hasnext 함수를 사용하고
        //BufferedReader의 경우, ready 함수를 사용한다.

        // 백준 단계별로 풀어보기

        // 4. while문
        // 4-1
        // logger.info("4-1 : 시스탬 입력, while문, 반복 덧셈");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int value1 = 1;
        // int value2 = 1;
        // while ((value1 + value2) != 0) {
        //     String input = br.readLine();
        //     String[] inputArray = input.split(" ");
        //     value1 = Integer.parseInt(inputArray[0]);
        //     value2 = Integer.parseInt(inputArray[1]);
        //     if ((value1 + value2) != 0) {
        //         System.out.println(value1 + value2);
        //     }
        // }
        // 4-2
        // logger.info("4-2 : 시스탬 입력, while문, 단복 덧셈, 종료케이스 없음");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int value1 = 0;
        // int value2 = 0;
        // while (br.ready()) {
        //     String input = br.readLine();
        //     String[] inputArray = input.split(" ");
        //     value1 = Integer.parseInt(inputArray[0]);
        //     value2 = Integer.parseInt(inputArray[1]);
        //     System.out.println(value1 + value2);
        // }
        // 4-3
        // logger.info("4-3 : 시스탬 입력, while문, 더하기 사이클");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String input = br.readLine();
        // int inputValue = Integer.parseInt(input);
        // int value1 = 0;
        // int value2 = 0;
        // int result = -1;
        // int newValue = inputValue;
        // int cycle = 0;
        // while ((newValue != inputValue) || (cycle == 0)) {
        //     value1 = newValue / 10;
        //     value2 = newValue % 10;
        //     result = value1 + value2;
        //     newValue = (value2*10) + (result%10); 
        //     cycle++;
        // }
        // System.out.println(cycle);
    }
}




 