//George Koutsogiannakis
//Copying of this is not allowed!!

package Client.Services.Classes;

import Client.Services.BillsType;
public class MyBills 
{
	
	String month=" ";
	BillsType typeOfExpenses=null;
	double [] amount=null;
	int daysNum;
	static int id=0;
	int currentID=0;

	public MyBills()
	{
		month="any month";
		typeOfExpenses=null;
		amount=null;
		daysNum=0;
	    id++;
		currentID=id;
	}
	public MyBills(String mo, BillsType exp, double [] am, int dn)
	{
		month=mo;
		typeOfExpenses=exp;
		amount=am;
		daysNum=dn;
	    id++;
		currentID=id;
	}

	public String getMonth()
	{
		return month;
	}
	
	public BillsType getTypeOfExpenses()
	{
		 return typeOfExpenses;
	}

	public double [] getAmount()
	{
		 return amount;
	}
	public int getDaysNum()
	{
		return daysNum;
	}

	public int getCurrentID()
	{
		return currentID;
	}

	public void setMonth(String mth)
	{
		 month=mth;
	}

	public void setTypeOfExpenses(BillsType toe)
	{
		typeOfExpenses=toe;
	}

	public void setAmount(double [] a)
	{
		amount=a;
	}
	public void setDaysNum(int dan)
	{
		daysNum=dan;
	}

	public boolean equals(MyBills es)
	{
		if((this.getTypeOfExpenses().equals(es.getTypeOfExpenses()))&&(this.getDaysNum()==es.getDaysNum()))
			return true;
		else
			return false;
	}

	public String toString()
	{
		String am=" ";
		for(int i=0; i<amount.length; i++)
			am=am+" "+amount[i];
		String str="The month is:"+" "+month+" "+"The type of expenses is "+typeOfExpenses+" "+"The amounts are "+am+" "+"The number of days for data is"+" "+daysNum+" "+
		"The expense object ID is "+" "+currentID+" "+"And the static id value is"+" "+id;
		return str;
	}
}
