import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main2_If {

    private static Logger logger = Logger.getLogger("Mylogger");

    public static void main(String[] args) {

        // BufferedReader로 입력 처리
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String input = br.readLine();

        // 백준 단계별로 풀어보기

        // 2. if문
        // 2-1
        // logger.info("2-1 : 시스탬 입력, if문, 값 비교");
        // Scanner sc1 = new Scanner(System.in);
        // int value1 = sc1.nextInt();
        // int value2 = sc1.nextInt();
        // if (value1 > value2) {
        //     System.out.println(">");
        // } else if (value1 < value2) {
        //     System.out.println("<");
        // } else if (value1 == value2) {
        //     System.out.println("==");
        // }
        // 2-2
        // logger.info("2-2 : 시스탬 입력, if문, 시험성적");
        // Scanner sc1 = new Scanner(System.in);
        // int value1 = sc1.nextInt();
        // if (value1 >= 90) {
        //     System.out.println("A");
        // } else if (value1 >= 80) {
        //     System.out.println("B");
        // } else if (value1 >= 70) {
        //     System.out.println("C");
        // } else if (value1 >= 60) {
        //     System.out.println("D");
        // } else {
        //     System.out.println("F");
        // }
        // 2-3
        // logger.info("2-3 : 시스탬 입력, if문, 윤년");
        // Scanner sc1 = new Scanner(System.in);
        // int value1 = sc1.nextInt();
        // if (value1 % 4 == 0 && value1 % 100 != 0) {
        //     System.out.println("1");
        // } else if (value1 % 400 == 0) {
        //     System.out.println("1");
        // } else {
        //     System.out.println("0");
        // }
        // 2-4
        // logger.info("2-4 : 시스탬 입력, if문, 사분면");
        // Scanner sc1 = new Scanner(System.in);
        // int value1 = sc1.nextInt();
        // int value2 = sc1.nextInt();
        // if (value1 > 0 && value2 > 0) {
        //     System.out.println("1");
        // } else if (value1 < 0 && value2 > 0) {
        //     System.out.println("2");
        // } else if (value1 < 0 && value2 < 0) {
        //     System.out.println("3");
        // } else if (value1 > 0 && value2 < 0) {
        //     System.out.println("4");
        // }
        // 2-5
        // logger.info("2-5 : 시스탬 입력, if문, 알람");
        // Scanner sc1 = new Scanner(System.in);
        // int value1 = sc1.nextInt();
        // int value2 = sc1.nextInt();
        // if (value2 < 45) {
        //     if (value1 == 0) {
        //         value1 = 23;
        //     } else {
        //         value1 = value1-1;
        //     }
        //     value2 = (value2+60)-45;
        // } else {
        //     value2 = value2-45;
        // }
        // System.out.println(value1 + " " + value2);
        // 2-6
        // logger.info("2-6 : 시스탬 입력, if문, 오븐 시계");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String input1 = br.readLine();
        // String input2 = br.readLine();
        // int startHour = Integer.parseInt(input1.split(" ")[0]); 
        // int startMinute = Integer.parseInt(input1.split(" ")[1]);
        // int cookingTime = Integer.parseInt(input2);
        // int endHour = 0;
        // int endMinute = 0;
        // if (startMinute + cookingTime >= 60) {
        //     endMinute = (startMinute + cookingTime) % 60;
        // } else {
        //     endMinute = startMinute + cookingTime;
        // }
        // if (startHour + ((startMinute + cookingTime)/60) > 23) {
        //     endHour = (startHour + ((startMinute + cookingTime)/60)) % 24;
        // } else {
        //     endHour = startHour + (startMinute + cookingTime)/60;
        // }
        // System.out.println(Integer.toString(endHour) + " " + Integer.toString(endMinute));
        // 2-7
        // logger.info("2-7 : 시스탬 입력, if문, 주사위 세개");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String input = br.readLine();
        // int dice1 = Integer.parseInt(input.split(" ")[0]);
        // int dice2 = Integer.parseInt(input.split(" ")[1]);
        // int dice3 = Integer.parseInt(input.split(" ")[2]);
        // int reward = 0;
        // if (dice1 == dice2) reward = 1000 + (dice1*100);
        // if (dice2 == dice3) reward = 1000 + (dice2*100);
        // if (dice3 == dice1) reward = 1000 + (dice3*100);

        // if (dice1 == dice2 && dice2 == dice3) {
        //     reward = 10000 + (dice1*1000);
        // }
        // if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
        //     int max = dice1;
        //     if (max <= dice2) max = dice2;
        //     if (max <= dice3) max = dice3;
        //     reward = max * 100;
        // }
        // System.out.println(reward);
    }
}




 