import java.util.Scanner;

public class Salary extends EmpDetails
{
      double TotalPay;
      int Hours, Rate;
      
      Salary(int id, String n, String ds, int h, int rt)
      {
          super(id,n,ds);
          try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please Enter Hours worked");
			  Hours = sc.nextInt();
			  System.out.println("Please Enter Rate Per hour");
			  Rate = sc.nextInt();
		}
      }
      void showsalary()
      {
            showDetails();
            TotalPay = Rate*Hours;
            
      }
}