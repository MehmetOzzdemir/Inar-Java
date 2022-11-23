package volkanhocaexercises;

public class Methods_01 {

	public static void main(String[] args) {
		System.out.println(Topla(5,10));
		System.out.println(Factoriyel(5));
	}
	public static int Topla(int num1,int num2) {
		int sum =num1+num2;
		return sum;
	}
	public static int Factoriyel(int numb1) {
		int Factoriyel=numb1;
		for(int i=Factoriyel-1;i>0;i--) {
			Factoriyel*=i;
		}
		return Factoriyel;
	}
}
