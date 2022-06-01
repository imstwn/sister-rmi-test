import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
	public long tambah(long a, long b) throws RemoteException;
	public long kurang(long a, long b) throws RemoteException;
	public long kali(long a, long b) throws RemoteException;
	public double bagi(double a, double b) throws RemoteException;
	public double pangkat(double a, double b) throws RemoteException;
	public long hitung(long a, long b) throws RemoteException;
}