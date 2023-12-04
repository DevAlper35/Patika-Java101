import java.util.Scanner;
// { }  [ ]
class UcakBiletiHesaplama{
	public static void main(String []args){
		int km, age, opt;
		double totalPrice, discountAge, discountOpt, disPrice, price;
		Scanner input = new Scanner(System.in);
		System.out.print("Gidilecek mesafeyi (KM) girin: "); km = input.nextInt();
		System.out.print("Yaşınızı girin: "); age = input.nextInt();
		System.out.print("Yolculuk Tercihi(1 -> Gidiş /  2 -> Gidiş-Dönüş : "); opt = input.nextInt();
		
		totalPrice = km * 0.10;

		if ((0 <age && age <= 130) && (0 < km ) && (opt == 1 || opt == 2)){
			if(age <= 12){
				discountAge= totalPrice * 0.5;
			}else if(age <= 24){
				discountAge=  totalPrice * 0.1;
			}else if( age >= 65){
				discountAge=  totalPrice * 0.2;
			}else{
				discountAge=  0;
			}
			
			disPrice = totalPrice - discountAge;
			discountOpt = (opt == 2)? disPrice * 0.2 : disPrice  ;
			price = (disPrice * 2) - discountOpt;
		System.out.println("Bilet Fiyatınız: " + price + "TL");
			
		}else{
			System.out.print("Hatalı Veri Girdiniz");
		}
		
	}
}