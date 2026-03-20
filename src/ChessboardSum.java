
import java.util.*;

public class ChessboardSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int blackSum = 0;
        int whiteSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = sc.nextInt();
                if ((i + j) % 2 == 0) {
                    blackSum += value;
                } else {
                    whiteSum += value;
                }
            }
        }

        System.out.println(blackSum);
        System.out.println(whiteSum);
    }
}
