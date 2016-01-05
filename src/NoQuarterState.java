
public class NoQuarterState extends State {

	@Override
	public void insertQuarter() {
		System.out.println("you inserdet a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarter());
		gumballMachine.setQuarterCount(gumballMachine.getQuarterCount()+1);		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("There is no quarter");
		
	}

	

	@Override
	public void turnCrank() {
		System.out.println("There is no quarter");
		
	}

	@Override
	public void dispense() {
		System.out.println("There is nothing to dispense");
		
	}
	
	public NoQuarterState(GumballMachine gumballMachine) {
		super(gumballMachine);
	}
	public String toString() {		// 
		return "no quarter state";
	}
	

}
