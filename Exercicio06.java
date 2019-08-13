import java.util.Scanner;

//Lista 01, Exercício 08
class Exercicio06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nDigite o numero a ser checado:");
    int num = input.nextInt();

    boolean isPrimo = checkPrimo(num);
    if(isPrimo){
      System.out.println("\nO Numero é Primo");
    }else{
      System.out.println("\nO Numero não é Primo");
    }

  }

  private static boolean checkPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}