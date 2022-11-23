package chapters.chapter_04;

public class Quiz_04_16 {

	public static void main(String[] args) {
		int random=(int)((Math.random()*30));
		String alphabet="abcçdefgğhıijklmnoöprsştuüvyz".toUpperCase();
		System.out.print(alphabet.charAt(random));
	}

}
