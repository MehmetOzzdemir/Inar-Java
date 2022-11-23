package chapters.chapter_03;

public class Checkpoint_03_06 {

	public static void main(String[] args) {
		int x = 1, a = 3;
		/*if (a == 1)
			x += 5;
		else if (a == 2)
			x += 10;
		else if (a == 3)
			x += 16;
		else if (a == 4)
			x += 34;
*/
		switch (a = 3) {
		case 1: {
			x += 5;
			System.out.println(x);
			break;
		}
		case 2: {
			x += 10;
			System.out.println(x);
			break;
		}
		case 3: {
			x += 16;
			System.out.println(x);break;
		}
		case 4: {
			x += 34;
			System.out.println(x);break;
		}

		}
	}

}
