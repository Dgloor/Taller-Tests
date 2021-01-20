package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	 public EmployeeTest() {
        e1 = new Employee(100f, "USD", 1f, EmployeeType.Manager);
        e2 = new Employee(100f, "USD", 1f, EmployeeType.Supervisor);
        e3 = new Employee(100f, "USD", 1f, EmployeeType.Worker);
        e4 = new Employee(100f, "EUR", 1f, EmployeeType.Manager);
        e5 = new Employee(100f, "EUR", 1f, EmployeeType.Supervisor);
        e6 = new Employee(100f, "EUR", 1f, EmployeeType.Worker);

        numMes = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
    }

	
	// 1. 
	// 2....

}
