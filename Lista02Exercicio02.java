import java.util.Scanner;

class Data{
  public Data(String data) {
    String dataPadrao = "01/01/0001";
    char[] dataConst = data.toCharArray();
    if(dataConst.length != 10){
      this.date = dataPadrao;
    }else if(!(dataConst[2] == "/".charAt(0)) || !(dataConst[5] == "/".charAt(0))){
      this.date = dataPadrao;
    }else if(!Character.isDigit(dataConst[0]) || !Character.isDigit(dataConst[1]) || !Character.isDigit(dataConst[3]) || !Character.isDigit(dataConst[4]) || !Character.isDigit(dataConst[6]) || !Character.isDigit(dataConst[7]) || !Character.isDigit(dataConst[8]) || !Character.isDigit(dataConst[9])){
      this.date = dataPadrao;
    }else{
      this.date = data;
    }
  }

  public String date = new String();

  public String getDia(){
    char[] dataChars = this.date.toCharArray();
    
    String dia = new String();
    dia = new StringBuilder().append(dataChars[0]).append(dataChars[1]).toString();
    return dia;
  }

  public String getMes(){
    char[] dataChars = this.date.toCharArray();
    
    String mes = new String();
    mes = new StringBuilder().append(dataChars[3]).append(dataChars[4]).toString();
    return mes;
  }

  public String getMesExtenso(){
    char[] dataChars = this.date.toCharArray();
    
    String mes = new String();
    String mesExtenso = new String();
    mes = new StringBuilder().append(dataChars[3]).append(dataChars[4]).toString();

    switch(mes){
      case "01":
        mesExtenso = "Janeiro";
        break;
      case "02":
        mesExtenso = "Feveireiro";
        break;
      case "03":
        mesExtenso = "Março";
        break;
      case "04":
        mesExtenso = "Abril";
        break;
      case "05":
        mesExtenso = "Maio";
        break;
      case "06":
        mesExtenso = "Junho";
        break;
      case "07":
        mesExtenso = "Julho";
        break;
      case "08":
        mesExtenso = "Agosto";
        break;
      case "09":
        mesExtenso = "Setembro";
        break;
      case "10":
        mesExtenso = "Outubro";
        break;
      case "11":
        mesExtenso = "Novembro";
        break;
      case "12":
        mesExtenso = "Dezembro";
        break;
    }

    return mesExtenso;
  }

  public String getAno(){
    char[] dataChars = this.date.toCharArray();
    
    String ano1 = new String();
    ano1 = new StringBuilder().append(dataChars[6]).append(dataChars[7]).toString();

    String ano2 = new String();
    ano2 = new StringBuilder().append(dataChars[8]).append(dataChars[9]).toString();

    String ano = ano1 + ano2;
    
    return ano;
  }

  public boolean isAnoBissexto() {
    String anoString = this.getAno();
    int ano = Integer.valueOf(anoString);

    if ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) ){ 
      return true; 
    } else { 
      return false; 
    }
  }

  public Data clone(){
    Data data = new Data(this.getDia() + "/" + this.getMes() + "/" + this.getAno());

    return data;
  }
}

class Lista02Exercicio02{
  public static void main(String[] args) {

  }
}