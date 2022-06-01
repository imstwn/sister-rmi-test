import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
public class CalculatorImpl extends UnicastRemoteObject

implements Calculator {
// Implementasi harus memiliki konstruktor eksplisit
	public CalculatorImpl() throws RemoteException {
		super();
	}

	public long tambah(long a, long b) throws RemoteException {
		return a + b;
	}

	public long kurang(long a, long b) throws RemoteException {
		return a - b;
	}

	public long kali(long a, long b) throws RemoteException {
		return a * b;
	}

	public double bagi(double a, double b) throws RemoteException {
		return a / b;
	}

	public double pangkat(double a, double b) throws RemoteException {
		return Math.pow(a, b);
	}
	
	public long hitung(long a, long b) throws RemoteException {
		return (a + b) / 2;
	}
}