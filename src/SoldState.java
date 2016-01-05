
public class SoldState extends State {

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You have already turn on crank");

	}

	@Override
	public void turnCrank() {
		System.out.println("You have already turn on crank");

	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getGumballCount() > 1)
			gumballMachine.setState(gumballMachine.getNoQuarter());
		else
			gumballMachine.setState(gumballMachine.getSoldOutState());
	}

	public SoldState(GumballMachine gumballMachine) {
		super(gumballMachine);
		// TODO Auto-generated constructor stub
	}
	public String toString() {		// 
		return "sold state";
	}

}
