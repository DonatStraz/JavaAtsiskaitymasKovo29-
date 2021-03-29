import java.util.Scanner;

public class uzd1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("pirmadienio pamoku skaiciu");
		int pir = sc.nextInt();
		System.out.println("antradienio pamoku skaiciu");
		int ant = sc.nextInt();
		System.out.println("treciadienio pamoku skaiciu");
		int tre = sc.nextInt();
		System.out.println("ketvirtadienio pamoku skaiciu");
		int ket = sc.nextInt();
		System.out.println("penktadienio pamoku skaiciu");
		int pen = sc.nextInt();

		int lessons = pir + ant + tre + ket + pen;
		System.out.println("Pamoku skaicius: " + lessons);
		int minutes = (pir + ant + tre + ket + pen) * 45;
		System.out.println("Tai sudaro minuciu: " + minutes);

	}

}
