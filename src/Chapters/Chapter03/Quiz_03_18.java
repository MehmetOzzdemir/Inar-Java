package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter Your weight of the package : ");
		double weightOfPackage = input.nextDouble();
		if (weightOfPackage > 50) {
			System.out.print("The package cannot be shipped.");
		}else if (weightOfPackage > 0 && weightOfPackage <=1) {
			double cost=3.5;
			System.out.print("Total Shipping Cost:"+(cost*weightOfPackage));
		}else if ( weightOfPackage <=3) {
			double cost=5.5;
			System.out.print("Total Shipping Cost:"+(cost*weightOfPackage));
		}else if ( weightOfPackage <=10) {
			double cost=8.5;
			System.out.print("Total Shipping Cost:"+(cost*weightOfPackage));
		}else if (weightOfPackage <50) {
			double cost=10.5;
			System.out.print("Total Shipping Cost:"+(cost*weightOfPackage)+" TL");
		}
	}

}
