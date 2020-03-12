//George Koutsogiannakis

package Client.Services;
import Client.Services.Enums.*;
public class Engineer extends Worker 
{
	private double weeklyBenefits=0.0;
	

	public Engineer()
	{
		super();
	}

	public Engineer(String nm, int ssn, int ye, Jobs emty, double ws)
	{

		super(nm,ssn,ye,emty);
		setWeeklyBenefits(ws);
		
	}

	public double getWeeklySalary()
	{
		return weeklyBenefits;
	}

	

	public void setWeeklyBenefits(double wsa)
	{
		weeklyBenefits=wsa;
	}

	

	public double benefitsCalculation(Jobs ety)
	{
		

		double salary;
		if(ety.equals(Jobs.ELECTRICAL_ENGINEER))
			salary=weeklyBenefits+getYearsExperience()*80.00;
		else if(ety.equals(Jobs.MECHANICAL_ENGINEER))
			salary=weeklyBenefits/2+getYearsExperience()*120.00;
		else
			salary=0.0;
		return salary;

	}
	 public String toString()
	 {
	   String output;
	   output=super.toString()+"The weekly benefit is:"+" "+weeklyBenefits;
	   return output;
	 }
}
