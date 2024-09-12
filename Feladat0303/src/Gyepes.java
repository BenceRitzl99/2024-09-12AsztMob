import java.util.Scanner;

public class Gyepes {
    private static Scanner sc = new Scanner(System.in);
    public static void solution() {
        System.out.print("Átmérő (méter): ");
        String diameterStr = sc.nextLine();
        Double diameter = Double.parseDouble(diameterStr);
        Double radius = diameter / 2;
        Double area = Math.pow(radius, 2);
        Double price = 2500.0;
        Double halfArea = area / 2;
        Double cost = halfArea * price;
        System.out.printf("Költség: %.1f Ft\n", cost); 
    }


}
