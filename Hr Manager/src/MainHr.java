import java.util.ArrayList;
public class MainHr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Warehouse jim = new Warehouse("Jim","Warehouse Worker", 15, "Hourly", 40);
		WareHouseSupervisor larry = new WareHouseSupervisor("Larry", "WareHouse Supervisor", 20, "Salary", 40);
		CustomerRep dan = new CustomerRep("Dan", "CustomerRep",20, "Part Time", 25);
		CustomerServSup mike = new CustomerServSup ("Mike", "CustomerServSup", 18, "Salary", 40);
		HrRep megan = new HrRep ("Megan","HrRep", 22, "Salary", 40);
		ExecutiveManagement don = new ExecutiveManagement ("Don", "ExecutiveManagement", 50, "Salary", 35);
		
		System.out.println(jim.wage);
		
		ArrayList<Warehouse> wareHouseWorkers = new ArrayList<Warehouse> ();
		
		wareHouseWorkers.add(jim);
		
		for(Warehouse workers : wareHouseWorkers)
		{
			System.out.println(workers.name);
		}
		
		ArrayList<Human> employees = new ArrayList<Human> ();
		
			employees.add(jim);
			employees.add(larry);
			employees.add(dan);
			employees.add(mike);
			employees.add(megan);
			employees.add(don);
		

		for(Human workers : employees)
		{
			
			System.out.println(workers.name);
			
		}
		
		
		

	}

}
