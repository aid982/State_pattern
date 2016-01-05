import java.io.*;
public abstract class State implements Serializable {
	transient GumballMachine gumballMachine;
	abstract public void insertQuarter();
	abstract public void ejectQuarter();
	abstract public void turnCrank();
	abstract public void dispense();
	public State(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}	
	}
