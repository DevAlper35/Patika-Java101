import java.util.Scanner;

class HesapMakinasi{

	public static void main(String []args){

		Scanner input = new Scanner(System.in);

		System.out.print("İlk sayıyı gir: ");
		int sayi1 = input.nextInt();
		
		System.out.print("İkinci sayıyı gir: ");
		int sayi2 = input.nextInt();
		
		System.out.println("\n**********\nToplama -> 1\nÇıkartma -> 2\nÇarpma -> 3\nBölme -> 4\n");
		System.out.print("Yapmak istediğiniz işlemi girin: ");
		int secim = input.nextInt();
		System.out.println("\n**********\n");
		switch(secim){

			case 1:
				System.out.print("Toplama sonucu " + (sayi1  + sayi2));
				break;
			case 2:
				System.out.print("Çıkartma sonucu " + (sayi1 - sayi2));
				break;
			case 3:
				System.out.print("Çarpma sonucu " + (sayi1 * sayi2));
				break;
			case 4:
				if (sayi1 != 0 && sayi2 != 0){
					System.out.print("Bölme sonucu " + (sayi1 / sayi2));
				}
				break;
			default:
				System.out.print("Yanlış seçim yapıldı");
			

		}
		System.out.print("\n\n**********\n");

	}
}