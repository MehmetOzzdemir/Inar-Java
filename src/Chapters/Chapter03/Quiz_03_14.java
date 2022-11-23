package chapters.chapter_03;

import java.util.Scanner;

public class Quiz_03_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Tahmininiz nedir ? (----0:Yazı  ----1:Tura) :");
		int tahmin = input.nextInt();

		int sonuc = (int) (Math.random() * 2);

		switch (sonuc) {
		case 0:
			System.out.println("Sonuç: Yazı");
			break;
		case 1:
			System.out.println("Sonuç: Tura");
			break;
		}
		if (tahmin == sonuc) {
			System.out.println("Tebrikler.Bildiniz.");
		} else
			System.out.println("Üzgünüz.Yanıldınız");

	}
}
