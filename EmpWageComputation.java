public class EmpWageComputation {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_WORKING_HRS = 100;

	public static void main(String[] args) {
		int empHrs = 0, empWage = 0, totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;
		while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
		int empCheck = (int)(Math.random() * 10) %3;
		switch (empCheck) {
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
		totalEmpWage += empWage;
		System.out.println("Emp Wage: " + empWage);
		}
		System.out.println("totalwage: " + totalEmpWage);
	}
}

