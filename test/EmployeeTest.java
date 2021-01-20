package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

class EmployeeTest {
	
	/*
	 * 1. Calcula el salario de un Employee Worker cuando la moneda 
	 * es USD y el mes es par. *Probado con mes sistema Febrero
	 */
	 @Test
	 public void csWorkerUSDParTest() {
		 Employee e = new Employee(100f, "USD", 1f, EmployeeType.Worker);
		 float salarioactual = e.cs();
		 float salarioEsperado = 164.33334350585938f;
		 assertEquals(salarioactual, salarioEsperado, 0.1);
	 }
	 
	 /*
	 * 2. Calcula el salario de un Employee Manager cuando la moneda 
	 * es USD y el mes es par. *Probado con mes sistema Febrero
	 */
	 @Test
	 public void csManagerUSDParTest() {
		 Employee e = new Employee(100f, "USD", 1f, EmployeeType.Manager);
		 float salarioactual = e.cs();
		 float salarioEsperado = 165.033325f;
		 assertEquals(salarioactual, salarioEsperado, 0.1);
	 }
	 
	 
	 /*
	 * 3. Calcula el salario de un Employee Supevisor cuando la moneda 
	 * es USD y el mes es par. *Probado con mes sistema Febrero
	 */
	 @Test
	 public void csSupervisorUSDParTest() {
		 Employee e = new Employee(100f, "USD", 1f, EmployeeType.Supervisor);
		 float salarioactual = e.cs();
		 float salarioEsperado = 164.6833f;
		 assertEquals(salarioactual, salarioEsperado, 0.1);
		 
	 }
	 
	 
	 /*
	 * 4. Calcula el salario de un Employee Worker cuando la moneda 
	 * NO es USD y el mes es par. *Probado con mes sistema Febrero
	 */
	 @Test
	 public void csWorkerEURParTest() {
		 Employee e = new Employee(100f, "EUR", 1f, EmployeeType.Worker);
		 float salarioactual = e.cs();
		 float salarioEsperado = 159.33334350f;
		 assertEquals(salarioactual, salarioEsperado, 0.1);
		 
	 }
	 
	 
	 /*
	 * 5. Calcula el salario de un Employee Worker cuando la moneda 
	 * NO es USD y el mes es impar. *Probado con mes sistema Enero
	 */
	 @Test
	 public void csWorkerEURImparTest() {
		 Employee e = new Employee(100f, "EUR", 1f, EmployeeType.Worker);
		 float salarioactual = e.cs();
		 float salarioEsperado = 159.33334350f;
		 assertEquals(salarioactual, salarioEsperado, 0.1);
		 
	 }
	 
	 
	 /*
	 * 6. Calcula el bono de fin de anio de un Employee Worker 
	 * cuando la moneda es USD.
	 */
	 @Test
	 public void CalculateYearBonusWorkerUSDTest() {
		 Employee  e = new Employee(100f, "USD", 1f, EmployeeType.Worker);
		 float bonoActual = e.CalculateYearBonus();
		 float bonoEsperado = 386.0f;
		 assertEquals(bonoActual, bonoEsperado, 0.1);
		 

	 }
	 
	 /*
	 * 7. Calcula el bono de fin de anio de un Employee Manager 
	 * cuando la moneda es USD.
	 */
	 @Test
	 public void CalculateYearBonusManagerUSDTest() {
		Employee  e = new Employee(100f, "USD", 1f, EmployeeType.Manager);
		float bonoActual = e.CalculateYearBonus();
		float bonoEsperado = 486.0f;
		assertEquals(bonoActual, bonoEsperado, 0.1);
	 }
	 
	 
	 /*
	 * 8. Calcula el bono de fin de anio de un Employee Supervisor 
	 * cuando la moneda es USD
	 */
	 @Test
	 public void CalculateYearBonusSupevisorUSDTest() {
		  Employee e = new Employee(100f, "USD", 1f, EmployeeType.Supervisor);
		  float bonoEsperado = 293.0f;
		  float bonoActual = e.CalculateYearBonus();
		  assertEquals(bonoActual, bonoEsperado, 0.1);
	 }
	 
	 /*
	 * 9. Calcula el bono de fin de anio de un Employee Worker 
	 * cuando la moneda NO es USD
	 */
	 @Test
	 public void CalculateYearBonusWorkerEURTest() {
		 Employee e = new Employee(100f, "EUR", 1f, EmployeeType.Worker);
		 float bonoEsperado = 386f;
		 float bonoActual = e.CalculateYearBonus();
		 assertEquals(bonoActual,bonoEsperado, 0.1);

	 }
	 
	/*
	* Test que prueba que el metodo CalculateYearBonus calcule de forma
	* correcta el bono de fin de año de un empleado Supervisor que tenga como
	* salario 100 Euros y 1 de bonusPercentaje
	*/
    @Test
    public void CalculateYearBonusTest5() {
    	Employee  e = new Employee(100f, "EUR", 1f, EmployeeType.Supervisor);
    	float bonoEsperado = 288.0f;
		float bonoActual = e.CalculateYearBonus();
		assertEquals( bonoActual, bonoEsperado, 0.1);
    }
	

}
