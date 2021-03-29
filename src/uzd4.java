import java.util.Scanner;

public class uzd4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;

		System.out.println("Iveskite intervalo pradzia");
		int a = sc.nextInt();

		System.out.println("Iveskite intervalo pabaiga");
		int b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			if (i % 6 == 0) {
				count = count + 1;
			}

		}

		System.out.println("Reikalingu marskineliu skaicius: " + count);

	}

}
