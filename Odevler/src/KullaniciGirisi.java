import java.util.Scanner;
class KullaniciGirisi {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String userName = "AlperDev";
		String password = "dev123";
		
		System.out.print("Kullanıcı Adınızı Girin: ");
		String userNameInput = input.nextLine();
		
		System.out.print("Şifrenizi Girin: ");
		String passwordInput = input.nextLine();
		
		if ( userName.equals(userNameInput) && password.equals(passwordInput)){
			System.out.println("Hoşgeldiniz, " + userName );
		}else if(userName.equals(userNameInput) && !password.equals(passwordInput)){
			System.out.print( userName + " şifrenizi hatalı girdiniz. Şifrenizi sıfırlamak ister misiniz? (E/H): ");
			String opt = (input.nextLine()).toUpperCase();
			if( opt.equals("E")){
				System.out.println("Yeni şifreniz eski şifrenizle aynı olmamalıdır.");
				System.out.print("Yeni şifrenizi girin: ");
				String passwordNew = input.nextLine();
				if( !passwordNew.equals(password)){
					password = passwordNew;
					System.out.print("Yeni şifreniz başarılıyla oluşturuldu.");
				}else if(passwordNew.equals(password)){
					System.out.println("Yeni şifreniz eski şifrenizle aynı olmamalıdır.");
					System.out.println("Çıkış yapıldı");
				}
			}else if(opt.equals("H")){
				System.out.println("Çıkış yapıldı");
			}	
		}else if(!userName.equals(userNameInput)){
			System.out.println("Kullanıcı adınızı hatalı girdiniz");
			System.out.println("Çıkış yapıldı");
		}
	}
}