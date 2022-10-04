
public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "bugü hava çok guzek.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(10, 11);
		System.out.println(sayi);
		// String yeniMesaj = mesaj.substring(0, 2);// 0 dan 2 ye kadar 2 dahil değil
		// //harf
		// System.out.println(yeniMesaj);

	}

	public static void ekle() {
		System.out.println("eklendi");

	}

	public static void sil() {
		System.out.println("eklendi");

	}

	public static void guncelle() {
		System.out.println("eklendi");

	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "Diyarbakir";

	}

}
