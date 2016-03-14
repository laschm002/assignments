
public class HrRep extends Human
{
	public HrRep (String Name, String Title, double Wage, String Status, int Hours)
	{
		name = Name;
		title = Title;
		wage = Wage;
		status = Status;
		hours = Hours;
		
	}
	
	double weekly;
	public double pay ()
	{
		weekly =wage *= hours;
		return weekly;
	}
	
}

