package volkanhocaexercises;

import java.util.Scanner;

public class TaxCalculate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Your Gain For Annually : ");
		double gain = input.nextDouble();
		double tax;
		
		if(gain<=32000) {
			tax = gain*0.15;
			System.out.print("Tax Rate %15 and Your Tax : "+(int)(tax*100)/100.0);
			
		}else if(gain>32000 && gain<=70000 ) {
			tax = (32000*0.15)+(gain-32000)*0.2;
			System.out.print("Tax Rate %20 and Your Tax : "+(int)(tax*100)/100.0);
			
		}else if (gain<=250000) {
			tax = (32000*0.15)+(70000-32000)*0.2+(gain-70000)*0.27;
			System.out.print("Tax Rate %27 and Your Tax : "+(int)(tax*100)/100.0);
			
		}else if (gain<= 880000) {
			tax = (32000*0.15)+(70000-32000)*0.2+(250000-70000)*0.27+(gain-250000)*0.27;
			System.out.print("Tax Rate %35 and Your Tax : "+(int)(tax*100)/100.0);
			
		}else if (gain>880000) {
			tax = (32000*0.15)+(70000-32000)*0.2+(250000-70000)*0.27+(880000-250000)*0.27+(gain-880000)*0.4;
			System.out.print("Tax Rate %40 and Your Tax : "+(int)(tax*100)/100.0);
			
			
		}
	}

}
