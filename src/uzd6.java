import java.util.Scanner;

public class uzd6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("n");
		int n = sc.nextInt();

		int vall = 0;

		int minn = 0;

		// System.out.println(vall + " val" + minn + " min");

		GautiLaikoFormata(n, vall, minn);
		GautiLaikaMinutemis(n, vall, minn);
	}

	public static void GautiLaikoFormata(int n, int vall, int minn) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; n >= i; i++) {

			System.out.println("Aval");
			int Aval = sc.nextInt();

			System.out.println("Amin");
			int Amin = sc.nextInt();

			System.out.println("Bval");
			int Bval = sc.nextInt();

			System.out.println("Bmin");
			int Bmin = sc.nextInt();

			int Val = Bval - Aval;

			int min = Bmin - Amin;

			minn = min + minn;

			vall = Val + vall;
		}

		System.out.println(vall + " val " + minn + " min");
	}

	public static void GautiLaikaMinutemis(int n, int vall, int minn) {
		minn = (vall * 60) + minn;
		System.out.println("Rezultatas minutemis " + minn);
	}

}
