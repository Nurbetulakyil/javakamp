
public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println(" Mukemmel : gectiniz. ");
			break;

		case 'B':
			//System.out.println(" Cok iyi : gectiniz. ");
			//break;

		case 'C':
			System.out.println(" Fena degil : gectiniz. ");
			break;

		case 'D':
			System.out.println(" Maalesef kaldiniz. ");
			break;

		default:

			System.out.println(" Gecersiz not girdiniz. ");

		}

	}

}
