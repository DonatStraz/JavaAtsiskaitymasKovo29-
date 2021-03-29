import java.util.Scanner;

public class uzd5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Pirmas vaziavimas");
		int a = sc.nextInt();

		System.out.println("Antras vaziavimas");
		int b = sc.nextInt();

		System.out.println("Trecias vaziavimas");
		int c = sc.nextInt();

		gautiGeriausiaIvertinima(a, b, c);

	}

	public static void gautiGeriausiaIvertinima(int a, int b, int c) {
		int y = Math.max(a, Math.max(b, c));
		System.out.println("Gersiausias Ivertinimas " + y);
	}

}
