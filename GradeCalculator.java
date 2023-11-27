import java.util.Scanner ;
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int mat, tarih, turkce, muzik, fizik, kimya ;
          
          Scanner inp = new Scanner(System.in);
          
          System.out.print("Matematik Notunuz : ");
          
          mat = inp.nextInt();
          
          System.out.print("Tarih Notunuz : ");
          
          tarih = inp.nextInt();
      
          System.out.print("Türkçe Notunuz : ");
          
          turkce = inp.nextInt();
          
          System.out.print("Fizik Notunuz : ");
          
          fizik = inp.nextInt();
            
          System.out.print("Kimya Notunuz : ");
          
          kimya = inp.nextInt();
          
          System.out.print("Müzik Notunuz : ");
          
          muzik = inp.nextInt();
          
          int toplam = mat + tarih + turkce + fizik + kimya + muzik ;
          
          double sonuc = toplam/6 ;
          
          String result = (sonuc < 60)  ? "Kaldı" : "Geçti";
	
	
          System.out.println(result);
	}

}
