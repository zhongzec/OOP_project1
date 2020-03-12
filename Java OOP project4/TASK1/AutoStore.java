//George Koutsogiannakis
package main.service;

// enter import statements for needed classes
import main.service.Auto;
import main.service.enums.Store;
public class AutoStore
{
	//enter enum Store attribute 
	// enter cross references attribute for Auto
	Store deal=null;
	Auto v=null;
	
	double sale=0.0; //THIS IS THE PRICE OF EACH AUTO 
	static int id=0;
	int currentID=0;


	public AutoStore()
	{
		sale=0.0;
		deal=null;
		v=null;
		id++;
		currentID=id;
	}

	public AutoStore(double s)
	{
		sale=s;
		deal=null;
		v=null;
		id++;
		currentID=id;
	}

	public Store getStore()
	{
		return deal;
	}
	public double getSale()
	{
		return sale;
	}

	
	public Auto getAuto()
	{

		return v;
	}


	public int getCurrentID()
	{
		return currentID;
	}

	public void setStore(Store de)
	{
		deal=de;
	}


	public void setSale(double sa)
	{
		sale=sa;
	}

	public void setAuto(Auto veh)
	{
		v=veh;
	}
	public void setCurrentID(int cid)
	{
		currentID=cid;
	}

	public String toString()
	{
		String out="The store is: "+" "+deal+" "+"The sale price of the car is: "+" "+sale+" "+"The car is: "+" "+v.getCarType()+" "+"The auto store object id is: "+currentID+"The auto is"+v.getCurrentID();
		return out;
	}
}
