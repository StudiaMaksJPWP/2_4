// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. suma");
    System.out.println("2. roznica");
    System.out.println("3. iloczyn");
    System.out.println("4. iloraz");

    int wybor = scanner.nextInt();

    System.out.println("Podaj pierwsza liczbe");
    double A = scanner.nextInt();
    System.out.println("podaj druga liczbe");
    double B = scanner.nextInt();
    switch (wybor) {


        
      case 1:
        double suma = A+B;
        System.out.println(suma);
        break;

        case 2:
        double roznica = A-B;
        System.out.println(roznica);
        break;
        
        case 3:
        double iloczyn = A*B;
        System.out.println(iloczyn);
        break;

        case 4:
        if (B==0) {
          System.out.println("Nie mozna dzielic przez 0!");
          break;
        } 
          else {
            double iloraz = A/B;
            System.out.println(iloraz);
          }
        break;
    }
    
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}