import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class uzd3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Intervalas prasideda");
		int a = input.nextInt();

		System.out.println("Intervalas pasibaigia");
		int b = input.nextInt();

		int[] array = IntStream.range(a * -1, b * -1).toArray();

		System.out.println(Arrays.toString(array));

	};

}
