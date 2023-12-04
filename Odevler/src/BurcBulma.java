import java.util.Scanner;

class BurcBulma{
  public static void main(String[]args){
    int month, day;
    String burc;
    Scanner input = new Scanner(System.in);
    System.out.print("Doğduğunuz Ay: "); month = input.nextInt();
    System.out.print("Doğduğunuz Gün: "); day = input.nextInt();
    if((0<day && day<=31) && (0<month  && month <=12)){
      if(month == 1){
        burc = day<=21?"Oğlak":"Kova";
      }else if(month == 2){
        burc = day<=19?"Kova":"Balık";
      }else if(month == 3){
        burc = day<=20?"Balık":"Koç";
      }else if(month == 4){
        burc = day<=20?"Koç":"Boğa";
      }else if(month == 5){
        burc = day<=21?"Boğa":"Ikizler";
      }else if(month == 6){
        burc = day<=22?"Ikizler":"Yengeç";
      }else if(month == 7){
        burc = day<=22?"Yengeç":"Aslan";
      }else if(month == 8){
        burc = day<=22?"Aslan":"Başak";
      }else if(month == 9){
        burc = day<=23?"Başak":"Terazi";
      }else if(month == 10){
        burc = day<=23?"Terazi":"Akrep";
      }else if(month == 11){
        burc = day<=21?"Akrep":"Yay";
      }else{
        burc = day<=22?"Yay":"Oğlak";
      }
      System.out.println(burc + " burcusunuz");
    }else{
      System.out.println("Hata: Geçersiz bir gün veya ay girdiniz");
    }
  }
}