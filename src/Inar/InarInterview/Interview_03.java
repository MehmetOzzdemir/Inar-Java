package Inar.InarInterview;

import java.util.Scanner;

public class Interview_03 {

	public static void main(String[] args) {
		//MehmetOzdemir--->MehOzdemirmet true
		//ahmet--->metah true
		//
		
		Scanner input= new Scanner(System.in);
		System.out.print("Enter First String : ");
		String s1 = input.nextLine().replaceAll(" ","");
		System.out.print("Enter Second String : ");
		String s2 = input.nextLine().replaceAll(" ","");;
		
		if(Decision(s1,s2)) {
			System.out.println("Yes "+s1+" and "+s2+" Strings Rotations");
		}else {
			System.out.println("No "+s1+" and "+s2+" Strings Not Rotations");
		}
		
		
	}
	public static boolean Decision(String s1,String s2) {
		
	    return (s1.length() == s2.length()) && ((s1 + s1).contains(s2));
	}

}
