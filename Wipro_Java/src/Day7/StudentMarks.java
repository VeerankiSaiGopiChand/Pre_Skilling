package Day7;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentMarks = new ArrayList<>();  

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        

        for (int i = 0; i < n; i++) {
        	sc.nextLine();
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            studentNames.add(name);

            System.out.print("Enter marks for " + name + ": ");
            int marks = sc.nextInt();  
            studentMarks.add(marks);  
        }

        System.out.println("\n Student Marks Report:");
        for (int i = 0; i < studentNames.size(); i++) {
            String name = studentNames.get(i);
            int marks = studentMarks.get(i);  
            System.out.println(name + ": " + marks + " marks");
        }
        
        int total = 0;
        for (Integer mark : studentMarks) {
            total += mark; 
        }
        double average = (double) total / n;
        System.out.println("\nAverage Marks: " + average);

        sc.close();
    }
}

