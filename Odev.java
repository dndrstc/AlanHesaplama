import java.util.Scanner;

public class Odev {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1.Kenarı Giriniz: ");
		int a = scanner.nextInt();
		System.out.print("2.Kenarı Giriniz: ");
		int b = scanner.nextInt();
		System.out.print("3.Kenarı Giriniz: ");
		int c = scanner.nextInt();
		
		double u = (a+b+c)/2;
		
		double Alan = Math.sqrt(u * (u-a) * (u-b) * (u-c)) ;
		System.out.println("Üçgenin Alanı: " + Alan);
		
	}
}
