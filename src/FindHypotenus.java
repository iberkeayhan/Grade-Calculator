import java.util.Scanner ;
public class UcgenAlani {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a, b, c ;
		
		
		System.out.println("Birinci kenar değerini giriniz :");
		System.out.println("İkinci kenar değerini giriniz :");
		System.out.println("Üçüncü kenar değerini giriniz :");
		a = input.nextInt();
		b = input.nextInt();
        c = input.nextInt();
        
        double u = (a + b + c )/2 ;
        double cevre = 2 * u ;
        double alan  = Math.sqrt(u * (u - a)* (u - b) * (u - c));
	
        System.out.println(alan);
	}
}
