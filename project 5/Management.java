//George Koutsogiannakis

package Client.Services;
import Client.Services.Enums.*;
public class Management extends Worker
{
	private double weeklyBenefits=0.0;
	private double bonus=0.0;
	

	public Management()
	{
		super();
	}
	public Management(String nm, int ssn, int ye, Jobs ety, double ws, double bn) 
	{

		super(nm, ssn,ye,ety);
		setWeeklyBenefits(ws);
		setBonus(bn);
	}

	public double getWeeklyBenefits()
	{
		return weeklyBenefits;
	}

	public double getBonus()
	{
		return bonus;
	}

	public void setWeeklyBenefits(double wsa)
	{
		weeklyBenefits=wsa;
	}

	public void setBonus(double bo)
	{
		bonus=bo;
	}

	public double benefitsCalculation(Jobs et)
	{
		double salary=0.0;
		if(et.equals(Jobs.ENGINEERING_MANAGER))
		   salary=weeklyBenefits+bonus;
		else if(et.equals(Jobs.ADMINISTRATIVE_MANAGER))
			salary=weeklyBenefits+0.5*bonus;
		return salary;

	}
	 public String toString()
	 {
	   String output;
	   output=super.toString()+"The weekly benefit is:"+" "+weeklyBenefits+" "+"The bonus is"+" "+bonus;
	   return output;
	 }
}
