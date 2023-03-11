import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nomer1 = scanner.nextInt();
        if (nomer1==1){
            hello();
        } else if (nomer1==0) {
            bay();
        }else
            System.out.println("tura san beriniz");

    }

  public static void hello(){
      System.out.println("salam");
  }
  public static void bay(){
      System.out.println("baybay");
  }

    }
