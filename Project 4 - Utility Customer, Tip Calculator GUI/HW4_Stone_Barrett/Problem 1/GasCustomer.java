// Stone Barrett
// Assignment 4 - Problem 1

public class GasCustomer extends UtilityCustomer 
{
	// Initialization
	private int cubicMetersUsed;
	private final double PRICE_PER_CUBIC_METER = 2.75;

    public GasCustomer(int acNo, int cubicMetersUsed) 
    {
              super(acNo);
              this.setCubicMetersUsed(cubicMetersUsed);
    }

       @Override

       public int compareTo(UtilityCustomer o) 
       {
              if (this.getAccountNumber() < o.getAccountNumber()) 
              {

                      return 1;
              } 
              else if (this.getAccountNumber() == o.getAccountNumber()) 
              {
                      return 0;
              }
              
              return -1;
       }

       protected int getAccountNumber() 
       {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override

       public double calculateBill() 
	{

              return cubicMetersUsed * PRICE_PER_CUBIC_METER;

    }


       public int getCubicMetersUsed() 
       {
    	   return cubicMetersUsed;
       }

       public void setCubicMetersUsed(int cubicMetersUsed) 
       {
              this.cubicMetersUsed = cubicMetersUsed;
       }

       public String toString() 
       {
              return "Gas "+super.toString() + "\nGas Consumption: " + cubicMetersUsed + "\nAmount Charged: " + calculateBill()
              		 + "\n";
       }
}