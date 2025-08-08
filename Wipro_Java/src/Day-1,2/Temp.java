import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int students = 5;
        int days = 7;
        int[][] attendance = new int[students][days];
        String[] studentNames = {"A", "B", "C", "D", "E"};

        System.out.println("Enter attendance for 5 students over 7 days (1=Present, 0=Absent):");

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + studentNames[i] + ":");
            for (int j = 0; j < days; j++) {
                attendance[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nAttendance Summary:");
        for (int i = 0; i < students; i++) {
            int totalPresent = 0;
            System.out.print("Student " + studentNames[i] + ": ");
            for (int j = 0; j < days; j++) {
                System.out.print(attendance[i][j] + " ");
                totalPresent += attendance[i][j];
            }
            System.out.println(" | Present: " + totalPresent + " days");
        }
        sc.close();
	}

}
