import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        StringBuffer sb = new StringBuffer();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = Integer.parseInt(st.nextToken());
        int value = Integer.parseInt(st.nextToken());

        int compareValue = 0;

        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {

            compareValue = Integer.parseInt(st.nextToken());

            if (value > compareValue) {
                result.append(compareValue + " ");
            }
        }
        System.out.print(result);

    }
}

