// Stone Barrett
// Assignment 4 - Problem 1

public class ElectricCustomer extends UtilityCustomer 
{
	// Initialization
	private int kWattHourUsed;
    private final double PRICE_PER_KWATT = 1;
    private final double DELIVERY_FEE = 30;;
    
    // Constructor
    public ElectricCustomer(int acNo, int kWattHourUsed) 
    {
    	super(acNo);
    	this.kWattHourUsed = kWattHourUsed;
    }

    @Override

    public double calculateBill() 
    {
    	return kWattHourUsed * PRICE_PER_KWATT + DELIVERY_FEE;
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

     public int getkWattHourUsed()
     {
    	 return kWattHourUsed;
     }

     public void setkWattHourUsed(int kWattHourUsed) 
     {
    	 this.kWattHourUsed = kWattHourUsed;
     }

     public String toString() 
     {
    	 return "Electricity " + super.toString() + "\nElectricity Consumption: " + kWattHourUsed + "\nAmount Charged: "
                + calculateBill() + "\n";
     }

	@Override
	protected int getAccountNumber() 
	{
		// TODO Auto-generated method stub
		return 0;
	}
}