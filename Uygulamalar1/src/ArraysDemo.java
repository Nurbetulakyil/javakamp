
public class ArraysDemo {

	public static void main(String[] args) {
		String ogrenci1 = "nur";
		String ogrenci2 = "aysan";
		String ogrenci3 = "yusuf";
		String ogrenci4 = "nurcan";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		
		System.out.println("-------------------");
		
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "nur";
		ogrenciler[1] = "aysan";
		ogrenciler[2] = "yusuf";
		//ogrenciler[3] = "nurcan";

		
		for(int i=0; i<ogrenciler.length; i++) {
			
			System.out.println(ogrenciler[i]);

		}
		System.out.println("-------------------");

		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);

		}
		
	}

}
