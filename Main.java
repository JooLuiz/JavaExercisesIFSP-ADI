import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);   
    System.out.print("Digite o numero de pesos:");
    int num = input.nextInt();

    int i,indice = 0,aux = 0;
    int vetor[]= new int [num];
    int maior = 0,menor =0;
    
    
    
    for(i=0;i<= vetor.length-1;i++){
        System.out.print("\nDigite o valor " + (i + 1) + ": ");
        vetor[i]=input.nextInt();
    }
    
    for(i = 0;i<= vetor.length-1;i++){
            if(i == 0){
              menor = vetor[i];
            }

            if(vetor[i] < menor){
               menor=vetor[i];
               indice = i;
            }
        }
    System.out.println("\no Menor valor digitado : " + String.valueOf(menor));
    System.out.println("\na posicao do Menor valor digitado : " + String.valueOf(indice+1));
  }
}