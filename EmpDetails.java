import java.util.Scanner;

public class EmpDetails {
	int staffID;
	String EmpName;
	String Designation;

	EmpDetails(int id, String n, String ds) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please Enter Staff ID");
			staffID = sc.nextInt();
			System.out.println("Please Enter Employee Name");
			EmpName = sc.next();
			System.out.println("Please Enter Employee Designation");
			Designation = sc.next();
		}

	}

	void showDetails() {
		System.out.println(">>>>Employee Details<<<< ");
		System.out.println("Employee Staff ID is - " + staffID);
		System.out.println("Your Name is - " + EmpName);
		System.out.println("Employee Designation - " + Designation);

	}
}