package chapters.chapter_03;

public class Checkpoint_03_05 {

	public static void main(String[] args) {
		int x;
		int y;
		x = 3; y = 3;
		if((x+3) == 6) {
			y=1;
			System.out.println(y);
		}else 
			System.out.println(y+1);
		
		
		switch (x + 3) {
		case 6: y = 1;
		default: y += 1;
		}
	}

}
