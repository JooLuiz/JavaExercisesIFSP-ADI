import java.util.Scanner;

//Lista 01, Exercício 06
class Exercicio05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nDigite a palavra a ser checada:");
    String palavra = input.next();
    char[] arrayChar = palavra.toCharArray();
    boolean isPalindromo = true;
    int length = palavra.length() - 1; 

    for(int x = 0; x < length; x++){
      if(arrayChar[x] != arrayChar[length-x]){
        isPalindromo = false;
        break;
      }
    }

    if(isPalindromo){
      System.out.println("É palindromo");
    }else{
      System.out.println("Não É palindromo");
    }

  }
}