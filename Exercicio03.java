import java.util.Scanner;

//Lista 01, Exercício 04
class Exercicio03 {
  public static void main(String[] args) {
    System.out.println("\nDigite o numero a ser checado:");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt(); 
    boolean isFibonacci = false;

    int atual = 1;
    int aux;
    int anterior = atual;

    do{
      aux = atual + anterior;
      anterior = atual;
      atual = aux;

      if(aux == num){
        isFibonacci = true;
        break;
      }

    }while(atual < num);

    if(isFibonacci){
      System.out.println("É Fibonacci");
    }else{
      System.out.println("Não É Fibonacci");
    }
  }
}