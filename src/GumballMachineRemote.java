import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
	int getCount() throws RemoteException;
	String getRemoteLocaation() throws RemoteException;
	

}
