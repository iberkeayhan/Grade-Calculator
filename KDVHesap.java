import java.util.Scanner ; 

public class KDVHesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		double tutar, kdvoran = 0.18 ;  
		
		Scanner inp = new Scanner(System.in);
		  
		     System.out.print("Tutarı giriniz : ") ;
		     
		        tutar = inp.nextDouble();
		       
		        double kdvtutar = tutar * kdvoran ;
		        
		       double kdvlifiyat = tutar + kdvtutar ;
		       
		       System.out.println("KDV'siz tutar : " + tutar);
		       System.out.println("KDV Oranı : " + kdvoran);
		       System.out.println("KDV tutarı : " + kdvtutar);
		       System.out.println("KDV'li tutarı : " + kdvlifiyat);
		       
		      double kdvorani = tutar > 1000 ? 0.8 : 0.18 ;
		       
		    		   
		       
		      
	}

}
