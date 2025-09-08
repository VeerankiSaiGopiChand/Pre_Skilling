
public class Jagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] employeeProjects = new int[4][];
        employeeProjects[0] = new int[] {101, 102};
        employeeProjects[1] = new int[] {201, 202, 203, 204};
        employeeProjects[2] = new int[] {301};
        employeeProjects[3] = new int[] {401, 402, 403};

        for (int i = 0; i < employeeProjects.length; i++) {
            System.out.print("Employee " + (i + 1) + " projects: ");
            for (int j = 0; j < employeeProjects[i].length; j++) {
                System.out.print(employeeProjects[i][j] + " ");
            }
            System.out.println();
        }
	}

}
