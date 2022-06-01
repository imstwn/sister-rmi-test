import java.net.MalformedURLException;
import java.rmi.Naming;
import java.util.Scanner;

public class CalculatorClient {
	public static void main(String[] args) {
		try {
			Calculator cl = (Calculator)
			Naming.lookup("rmi://localhost/Hitung");
			Scanner a= new Scanner(System.in);
			System.out.print("Masukkan a = ");
			int x = a.nextInt();
			System.out.print("Masukkan b = ");
			int y = a.nextInt();
			System.out.println("a + b ="+cl.tambah(x,y));
			System.out.println("a - b ="+cl.kurang(x,y));
			System.out.println("a x b ="+cl.kali(x,y));
			System.out.println("a / b ="+cl.bagi(x,y));
			System.out.println("a ^ b ="+cl.pangkat(x,y));
			System.out.println("(a + b) / 2 ="+cl.hitung(x,y));
		}
		catch (Exception e) {
			System.out.println("Received Exception:");
			System.out.println(e);
		}
	}
}
