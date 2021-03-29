import java.util.Scanner;

public class uzd2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Iveskite deziu skaiciu");
		int d = sc.nextInt();
		System.out.println("Iveskite knygu skaiciu");
		int k = sc.nextInt();
		System.out.println("Iveskite, kelios knygos telpa i deze");
		int t = sc.nextInt();
	
		int nt = k - (d * t); 
		if((d * t) >= k ) {
			System.out.println("Knygos telpa i dezes");
		}else {
			System.out.println("Knygos netelpa i dezes");
			System.out.println("i dezes netilpo " + nt + " knygos");

		}
		
		}
		
		
	}


