import java.util.Scanner;

//Lista 01, Exercício 02
class Exercicio01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Boolean breakMe = false;
    int TotalSalario = 0;
    int TotalNewSalario = 0;

    while(breakMe == false){
      System.out.println("Digite o Nome do funcionário (Digite FIM para terminar):");
      String funcionario = input.next();
      if(funcionario.contains("FIM")){
        breakMe = true;
        continue;
      }

      System.out.println("\nDigite o salario de " + funcionario + ":");
      int salario = input.nextInt();
      int newSalario = 0;


      if(salario <= 150){
        newSalario = salario + ((salario*25)/100);
      }else if(salario > 150 && salario <= 300){
        newSalario = salario + ((salario*20)/100);
      }else if(salario > 300 && salario <= 600){
        newSalario = salario + ((salario*15)/100);
      }else if(salario > 600){
        newSalario = salario + ((salario*10)/100);
      }

      TotalSalario = TotalSalario + salario;
      TotalNewSalario = TotalNewSalario + newSalario;

      System.out.println("\nFuncionario: " + funcionario +". \nSalario Atual: " + String.valueOf(salario) + ". \nSalario Reajustado: " + String.valueOf(newSalario) + ".");
    }

    System.out.println("\ntotal dos salarios: " + TotalSalario);
    System.out.println("\ntotal dos salarios reajustados: " + TotalNewSalario);

    String diferenca = String.valueOf(TotalNewSalario - TotalSalario);

    System.out.println("\nO total do aumento foi de " + diferenca);

    System.out.println("\nBye bye");
    
  }
}