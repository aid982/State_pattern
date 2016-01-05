
public class HasQuarterState extends State {

	@Override
	public void insertQuarter() {
		System.out.println("You have already insered a quarter");
		
	}

	@Override
	public void ejectQuarter() {
		gumballMachine.setQuarterCount(gumballMachine.getQuarterCount()-1);
		gumballMachine.setState(gumballMachine.getNoQuarter());
		System.out.println("Your quarter is coming out");
		
	}

	

	@Override
	public void turnCrank() {
		gumballMachine.setState(gumballMachine.getSoldState());		
	}

	@Override
	public void dispense() {
		System.out.println("There is nothing to dispense");
		
	}

	public HasQuarterState(GumballMachine gumballMachine) {
		super(gumballMachine);
	}

	@Override
	public String toString() {		// 
		return "has quarter state";
	}
	
	

	

}
