package chapters.chapter_05;

public class Quiz_05_24 {

	public static void main(String[] args) {
		double j=1.0;
		double sum=0.0;
		for(double i=1.0;i<98.0;i+=2.0) {
			j=j+2;
			sum += i/j;
		}
		System.out.println(sum);
		
	}

}
