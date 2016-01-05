
public class main {

	public static void main(String[] args) throws Exception {
		GumballMachine gumballMachine = new GumballMachine("",10, 0);
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		System.out.println(gumballMachine);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		

	}

}
