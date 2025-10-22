package proje;
import java.util.Scanner;
public class kdv {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a product name:");
		String a =sc.nextLine();
		System.out.println("Enter the price:");
		double f=sc.nextDouble();
		double tf;
		
		sc.close();
		tf=f*1.20;
		System.out.println("VAT included price is: " +tf);
	}

}
