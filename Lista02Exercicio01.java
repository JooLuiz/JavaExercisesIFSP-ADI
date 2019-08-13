import java.util.Scanner;

class Aluno{
  public Aluno(String matricula, String nome, Integer n1, Integer n2, Integer t) {
    this.matricula = matricula;
    this.nome = nome;
    this.nota1 = n1;
    this.nota2 = n2;
    this.trabalho = t;
  }
  String matricula = new String();
  String nome = new String();

  int nota1 = 0;
  int nota2 = 0;
  int trabalho = 0;

  public String getMatricula(){
    return this.matricula;
  }

  public void setMatricula(String m){
    this.matricula = m;
    return;
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String n){
    this.nome = n;
    return;
  }

  public Integer getNota1(){
    return this.nota1;
  }

  public void setNota1(Integer n1){
    this.nota1 = n1;
    return;
  }

  public Integer getNota2(){
    return this.nota2;  
  }

  public void setNota2(Integer n2){
    this.nota2 = n2;
    return;
  }

  public Integer getTrabalho(){
    return this.trabalho;  
  }

  public void setTrabalho(Integer t){
    this.trabalho = t;
    return;
  }

  public double CalculaMedia(){
    return ((this.nota1 * 2.5) + (this.nota2 * 2.5) + (this.trabalho * 2)/7);
  }
}

class Lista02Exercicio01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nDigite o nome do aluno:");
    String nome = input.next();

    System.out.println("\nDigite a matricula do aluno:");
    String matricula = input.next();

    System.out.println("\nDigite a nota 1 do aluno:");
    int nota1 = input.nextInt();

    System.out.println("\nDigite a nota 2 do aluno:");
    int nota2 = input.nextInt();

    System.out.println("\nDigite a nota do trabalho do aluno:");
    int trab = input.nextInt();

    Aluno aluno = new Aluno(matricula, nome, nota1, nota2, trab);

    double media = aluno.CalculaMedia();
    if(media > 7){
      System.out.println("\nVocê foi aprovado");
    }else{
      System.out.println("\nVocê não passou, precisa de " + (7-media) + " para passar!");
    }
  }
}