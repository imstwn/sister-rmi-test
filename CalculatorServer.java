import java.rmi.Naming;

public class CalculatorServer {
	public CalculatorServer() {
		try {
			Calculator cl = new CalculatorImpl();
			Naming.rebind("rmi://localhost:1099/Hitung",cl);
			System.out.println("OK Server Siap...");
		} catch (Exception e) {
			System.out.println("Trouble: " + e);
		}
	}

	public static void main(String args[]) {
		new CalculatorServer();
}
}