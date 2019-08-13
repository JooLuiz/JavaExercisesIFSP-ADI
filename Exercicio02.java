import java.util.Scanner;

//Lista 01, Exercício 03
class Exercicio02 {
  public static void main(String[] args) {
    String x = "";
    System.out.println("\nDigite o numero a ser convertido para binarios:");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    while(num > 0)
        {
            int a = num % 2;
            x = a + x;
            num = num / 2;
        }
        System.out.println(x);    
  }
}