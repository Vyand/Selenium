import java.util.Scanner;

public class VotersInfo {
	private String IdNo;  
    private String name;  
    private String Station;  
    Scanner sc = new Scanner(System.in);  
    //method to register new voters  
    public void RegisterVoter() {  
        System.out.print("Enter voter's ID No: ");  
        IdNo = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter your voting station: ");  
        Station = sc.next();  
    }  
    //method to display voters details  
    public void showAccount() {  
        System.out.println("Name of Registered voter: " + name);  
        System.out.println("Identity no.: " + IdNo);  
        System.out.println("Voting station: " + Station);
    }  
    //method to search an voter by ID number  
    public boolean search(String iD_no) {  
        if (IdNo.equals(iD_no)) {
        	System.out.println("User Registered, See details below:");
        	System.out.println();
            showAccount();  
            
            return (true);  
        } 
        return (false);  
    }  

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			//creating initial voters accounts 
			System.out.print("how many voters do you want to register ");  
			int n = sc.nextInt();  
			VotersInfo C[] = new VotersInfo[n];  
			for (int i = 0; i < C.length; i++) {  
			    C[i] = new VotersInfo();  
			    C[i].RegisterVoter();  
			}  
			// loop runs until number 3 is not pressed to exit  
			int ch;  
			do {  
			    System.out.println("\n **Voting System Application**");  
			    System.out.println("1. Display all voters details \n 2. Search boter by identity number\n 3.Exit ");  
			    System.out.println("Enter your choice: ");  
			    ch = sc.nextInt();  
			        switch (ch) {  
			            case 1:  
			                for (int i = 0; i < C.length; i++) {  
			                    C[i].showAccount();  
			                }  
			                break;  
			            case 2:  
			                System.out.print("Enter identity no. you want to search: ");  
			                String ID_no = sc.next();  
			                boolean found = false;  
			                for (int i = 0; i < C.length; i++) {  
			                    found = C[i].search(ID_no);  
			                    if (found) {  
			                        break;  
			                    }  
			                }  
			                if (!found) {  
			                    System.out.println("Search failed! Voters  doesn't exist..!!");  
			                }  
			                break;  
					case 3:  
			                System.out.println("See you on election day! >>>VOTE SMART<<...");  
			                break;  
			        }  
			    }  
			    while (ch != 3);
		}  
        }  
	}