
public class SoldOutState extends State {

	@Override
	public void insertQuarter() {
		System.out.println("Machine is sold out");
		
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
		 System.out.println("Machine is sold out");
		
	}

	public SoldOutState(GumballMachine gumballMachine) {
		super(gumballMachine);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {		// 
		return "sold out state";
	}

	
	

	

}
