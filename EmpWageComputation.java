public class EmpWageComputation {
   public static void main(String[] args) {
      System.out.println("Welcome to Employee Wage Computation");
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		int empCheck = (int)(Math.random() * 10) %3;
		switch ( empCheck) {
				case 1:
					System.out.println("Employee is Present");
					empHrs = 8;
					break;
				case 2:
					System.out.println("Employee is Present");
					empHrs = 4;
					break;
				default:
					System.out.println("Employee is Absent");
					empHrs = 0;
					break;
				}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " +empWage);
	}
}

