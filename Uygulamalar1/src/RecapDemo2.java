
public class RecapDemo2 {

	public static void main(String[] args) {
		double[] myList = { 1.3, 4.5, 8.7, 0.2 };
		double total = 0;
		double max = myList [0] ;

		for(double number:myList)
		{
			if (max < number) {
				max = number;

			}
			total = total + number;
			System.out.println(number);

		}
		 System.out.println("toplam ="+total);
		System.out.println("en buyuk="+max);

	}

}
