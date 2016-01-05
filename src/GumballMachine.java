import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends  UnicastRemoteObject implements GumballMachineRemote  {
	@Override
	public int getCount() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String getRemoteLocaation() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	private State noQuarter,hasQuarter,soldState,soldOutState,state;
	private int quarterCount;
	private int gumballCount;
	private String location;
	
	public void releaseBall(){
		if (gumballCount>0) {
			gumballCount--;								
		}			
	}
	

	@Override
	public String toString() {
		return " gumballs :" + gumballCount + " quarters "+quarterCount +"state :"+state;

	}


	public int getQuarterCount() {
		return quarterCount;
	}

	public void setQuarterCount(int quarterCount) {
		this.quarterCount = quarterCount;
	}

	public int getGumballCount() {
		return gumballCount;
	}

	public void setGumballCount(int gumballCount) {
		this.gumballCount = gumballCount;
	}
	


	public GumballMachine(String location,int gumballCount,int quarterCount) throws RemoteException {
		noQuarter = new NoQuarterState(this); 
		hasQuarter = new HasQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		state =noQuarter;
		
		this.quarterCount = quarterCount;
		this.gumballCount = gumballCount;
		this.location = location;
		
	}
	

	

	public State getNoQuarter() {
		return noQuarter;
	}

	public void setNoQuarter(State noQuarter) {
		this.noQuarter = noQuarter;
	}

	public State getHasQuarter() {
		return hasQuarter;
	}

	public void setHasQuarter(State hasQuarter) {
		this.hasQuarter = hasQuarter;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	public void insertQuarter() {
		state.insertQuarter();
				
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();		
	}	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();		
	}
	
	 

}
