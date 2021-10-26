public class TotalTax extends Salary
{
      double tax, netPay;
      
      public TotalTax(int id, String n, String ds, int h, int rt, float tx)
      {
            super(id,n,ds,h,rt);
            tax=tx;
      }
      
	void showTotalTax()
      {
    	  showsalary();
            tax = TotalPay * 0.15;
            netPay = TotalPay - tax;
            
            
            System.out.println(">>>>Payment Details<<<< ");
            System.out.println("Base Pay is = R" + TotalPay);
            System.out.println("Your tax is = R" + tax);
            System.out.println("Your salary after tax is = R" + netPay);
            
            
      }
}
