
public class LoopDemo {

	public static void main(String[] args) {
		// 1 den 10 a kadar sayılar

				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
				}
				System.out.println("DONGU BITTI");

				// tek sayılar

				for (int i = 1; i <= 10; i+=2) {
					System.out.println(i);
				}
				System.out.println("DONGU BITTI");

				// 10 dan geri sayma

				for (int i = 10; i >= 1; i--) {
					System.out.println(i);
				}
				System.out.println("DONGU BITTI");

				// cift sayılar

				for (int i = 2; i <= 10; i+=2) {
					System.out.println(i);
				}
				System.out.println("DONGU BITTI");
				
				System.out.println("----------------------------------FOR DONGU BITTI---------------------------");
		//while
		       int i =1;
		        while(i<10) {
		        	System.out.println(i);
		        	i++;
		        	
		        }
		        System.out.println("DONGU BITTI");
		        
		        System.out.println("----------------------------------WHILE DONGU BITTI---------------------------");
		        

	}

}
