import java.util.Scanner;

public class Parat {

    
    
    Scanner scanner = new Scanner(System.in);
    public void solution() {
        System.out.print("Szám: ");
        String szamStr = scanner.nextLine();
        Integer szam = Integer.parseInt(szamStr);

        scanner.close();

            

        if(szam%2 == 0) {
            System.out.println("A szám páros!");
        }
        else {
            System.out.println("A szám páratlan!");
        }

    }
    
}
