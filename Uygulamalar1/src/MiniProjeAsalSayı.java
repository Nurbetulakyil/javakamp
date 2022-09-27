
public class MiniProjeAsalSayı {

	public static void main(String[] args) {
		// asalsayı

		int number = 2;
		int remainder = number % 2;
		// System.out.println(remainder);
		boolean ısPrime = true;

		if (number == 1) {

			System.out.println("sayı asal degıldır.");

			return;
		}

		if (number < 1) {
			System.out.println("gecersız sayı.");
		}

		for (int i = 2; i < number; i++) {
			if (number % 1 == 0) {
				ısPrime = false;
			}
		}
		if (ısPrime) {
			System.out.println("sayı asaldır.");

		} else {
			System.out.println("sayı asal degıldır.");

		}
	}

}
