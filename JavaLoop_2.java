import java.util.Scanner;

/**
 * JavaLoop_2
 */
public class JavaLoop_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numOfSereis = scanner.nextInt();
        for (int j = 0; j < numOfSereis; j++) {
            Integer a = scanner.nextInt();
            Integer b = scanner.nextInt();
            Integer n = scanner.nextInt();
            Double seriesValue = a.doubleValue();
            for (int i = 0; i < n; i++) {
                seriesValue = seriesValue + Math.pow(2, i) * b;
                Integer intSeriesValue = seriesValue.intValue();
                System.out.print(intSeriesValue + " ");
            }
            System.out.println();
        scanner.close();
        }
    }
}