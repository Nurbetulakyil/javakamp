public class Methods {

	public static void main(String[] args) {
	      sayiBulmaca();
	      sayiBulmaca();
	      sayiBulmaca();
	      sayiBulmaca();

	}
	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int aranacak = 5;
		boolean varMı = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMı = true;
				break;

			}
		}
			
			String mesaj="";
			if (varMı) {
				mesajVer("sayı mevcuttur:"+ aranacak);
				mesajVer(mesaj);
			} else {
				mesajVer("sayı mevcut degildir:"+ aranacak);
			}
	}
		
         public static void  mesajVer (String mesaj) {
	          System.out.println(mesaj);
         }
         
	



	}


