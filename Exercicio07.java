import java.util.Scanner;

//Lista 01, Exercício 11
class Exercicio07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nDigite o numero de funcionarios da empresa:");
    int num = input.nextInt();
    int salarios[] = new int[num];
    int valorTotalSalario = 0;

    for(int x = 0; x < num; x++){
      System.out.println("\nDigite o salario do funcionario " + String.valueOf(x) + ":");
      int salario = input.nextInt();

      salarios[x] = salario;

      valorTotalSalario = valorTotalSalario + salario;
    }

    float media = valorTotalSalario / num;

    int count = 0;

    for(int y = 0; y < num; y++){
      if(salarios[y] >= media){
        count++;
      }
    }

    System.out.println("\nO numero de funcionarios com salario acima da media é " + count);

  }
}