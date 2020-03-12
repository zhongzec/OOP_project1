
//George Koutsogiannakis

package Client.Services;
import Client.Services.Enums.*;
public abstract class Worker 
{
	public String name=" ";
	public int socialSecurity=0;
	private int yearsExperience=0;
	public Jobs et;
	private static int id=0;
	private int currentID=0;

	public Worker()
	{

		id++;
		currentID=id;
		name="AnyName";
		socialSecurity=12345;
		yearsExperience=0;
		et=Jobs.NONE;
		

	}

	public Worker(String nm, int ss, int ye, Jobs ety)
	{
		

		id++;
		currentID=id;
		name=nm;
		socialSecurity=ss;
		yearsExperience=ye;
		et=ety;
	}

	public String getName()
	{
	  return name;
	}

	public int getSS()
	{

		return socialSecurity;
	}

	public int getID()
	{

		return id;
	}

	public int getYearsExperience()
	{
		return yearsExperience;
	}

	public Jobs getJobs()
	{
		return et;
	}

	public int getCurrentID()
	{

		return currentID;
	}

	public void setName(String ne)
	{
		name=ne;
	}
	public void setSS(int ssn)
	{
	  socialSecurity=ssn;
	 
	}

	public void setYearsExperience(int yeex)
	{
		yearsExperience=yeex;
	}

	public void setJobs(Jobs emplty)
	{
		et=emplty;
	}
	
	public void setID(int idd)
	{
		id=idd;
	}

	public void setCurrentID(int cid)
	{
		currentID=cid;
	}

	public String toString()
	{
		String output;
		output="The name is:"+" "+name+" "+"The ss number is:"+" "+socialSecurity+" "+"The id is:"+
		" "+"The years of experience is:"+" "+yearsExperience+" "+"The job type is:"+
		" "+et+" "+"The currentId is:"+currentID;
		return output;
	}

	public abstract double benefitsCalculation(Jobs etype);
	
		

}

 






