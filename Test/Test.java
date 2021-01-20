package Test;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		fail("Not yet implemented");
	}

	 public Test() {
        e1 = new Employee(100f, "USD", 1f, EmployeeType.Manager);
        e2 = new Employee(100f, "USD", 1f, EmployeeType.Supervisor);
        e3 = new Employee(100f, "USD", 1f, EmployeeType.Worker);
        e4 = new Employee(100f, "EUR", 1f, EmployeeType.Manager);
        e5 = new Employee(100f, "EUR", 1f, EmployeeType.Supervisor);
        e6 = new Employee(100f, "EUR", 1f, EmployeeType.Worker);

        numMes = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
    }

}
