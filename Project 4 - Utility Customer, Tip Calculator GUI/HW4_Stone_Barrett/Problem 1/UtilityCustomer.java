// Stone Barrett
// Assignment 4 - Problem 1

public abstract class UtilityCustomer
{

		private int acNo;

		public abstract double calculateBill();

		public UtilityCustomer(int acNo) 
		{
		this.acNo = acNo;
		}

		public int getacNo() 
		{
		return acNo;
		}

		public void setacNo(int acNo)
		{
		this.acNo = acNo;
		}

		@Override

		public String toString() 
		{
		return "UtilityCustomer [acNo=" + acNo + "]";
		}

		public int compareTo(UtilityCustomer o) 
		{
			// TODO Auto-generated method stub
			return 0;
		}

		protected abstract int getAccountNumber();
}