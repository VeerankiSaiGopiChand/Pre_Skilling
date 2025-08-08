import java.util.Scanner;
public class SBemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        StringBuffer report = new StringBuffer();

	        System.out.print("Enter number of employees: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 1; i <= n; i++) {
	            System.out.println("\nEnter details for Employee " + i + ":");
	            System.out.print("Name: ");
	            String name = sc.nextLine();

	            System.out.print("Employee ID: ");
	            String empId = sc.nextLine();

	            System.out.print("Department: ");
	            String dept = sc.nextLine();

	            System.out.print("Location: ");
	            String location = sc.nextLine();

	            report.append("----- Employee ").append(i).append(" Profile -----\n");
	            report.append("Name      : ").append(name).append("\n");
	            report.append("ID        : ").append(empId).append("\n");
	            report.append("Department: ").append(dept).append("\n");
	            report.append("Location  : ").append(location).append("\n\n");
	        }

	        System.out.println("=== Employee Profile Report ===\n");
	        System.out.println(report);
	        
	        sc.close();
	}

}
