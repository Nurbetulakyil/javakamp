public class VeriableArguments {

	public static void main(String[] args) {

		int toplam = topla(2,4,6,8,7);
		System.out.println(toplam);


	}
	
	public static int topla(int...sayilar) {
		int toplam =0;
		for (int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	

}
