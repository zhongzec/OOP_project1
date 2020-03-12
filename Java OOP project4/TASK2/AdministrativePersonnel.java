//George Koutsogiannakis

package Client.Services;
import Client.Services.Enums.*;
public class AdministrativePersonnel extends Worker 
{
	private double rate=0.0;
	private double hours=0.0;
	

	public AdministrativePersonnel()
	{
		super();
	}
	public AdministrativePersonnel(String nm, int ssn,int yexp, Jobs emty,double rt, double hrs) 
	{

		super(nm, ssn, yexp,emty);
		setRate(rt);
		setHours(hrs);
	}

	public double getRate()
	{
		return rate;
	}

	public double getHours()
	{
		return hours;
	}

	public void setRate(double r)
	{
		rate=r;
	}

	public void setHours(double h)
	{
		hours=h;
	}

	public double benefitsCalculation(Jobs emtyp)
	{
		double salary;
		if(emtyp.equals(Jobs.ADMINISTRATIVE_SECRETARY))
		   salary=rate*hours+getYearsExperience()*15;
		else if(emtyp.equals(Jobs.ADMINISTRATIVE_ASSISTANT))
			 salary=rate*hours+getYearsExperience()*25;
		else
			salary=0.0;
		return salary;

	}
	 public String toString()
	 {
	   String output;
	   output=super.toString()+"The rate is:"+" "+rate+" "+"The hours are"+" "+hours;
	   return output;
	 }
}
