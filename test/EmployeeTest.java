package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.ZoneId;
import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

class EmployeeTest {
	Employee e1, e2, e3, e4, e5, e6;
	
	 public EmployeeTest() {
		e1 = new Employee(100f, "USD", 1f, EmployeeType.Worker);
	    e1 = new Employee(100f, "USD", 1f, EmployeeType.Manager);
	    e2 = new Employee(100f, "USD", 1f, EmployeeType.Supervisor);
	    e4 = new Employee(100f, "EUR", 1f, EmployeeType.Manager);
	    e5 = new Employee(100f, "EUR", 1f, EmployeeType.Supervisor);
	
	    int numMes = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
	}
	
	/*
	 * 1. Calcula el salario de un Employee Worker cuando la moneda 
	 * es USD y el mes es par
	 */
	 @Test
	 public void csWorkerUSDParTest() {
		 // Employee e3 = new Employee(100f, "USD", 1f, EmployeeType.Worker);
		 float salarioactual = e1.cs();
		 float salarioEsperado = 164.33334350585938f;
		 assertEquals(salarioactual, salarioEsperado, 0.1);
	 }
	 
	 /*
	 * 2. Calcula el salario de un Employee Manager cuando la moneda 
	 * es USD y el mes es par
	 */
	 @Test
	 public void csManagerUSDParTest() {
		 
	 }
	 
	 
	 /*
	 * 3. Calcula el salario de un Employee Supevisor cuando la moneda 
	 * es USD y el mes es par
	 */
	 @Test
	 public void csSupervisorUSDParTest() {
		 
	 }
	 
	 
	 /*
	 * 4. Calcula el salario de un Employee Worker cuando la moneda 
	 * NO es USD y el mes es par
	 */
	 @Test
	 public void csWorkerEURParTest() {
		 
	 }
	 
	 
	 /*
	 * 5. Calcula el salario de un Employee Worker cuando la moneda 
	 * NO es USD y el mes es impar
	 */
	 @Test
	 public void csWorkerEURImparTest() {
		 
	 }
	 
	 
	 /*
	 * 6. Calcula el bono de fin de a�o de un Employee Worker 
	 * cuando la moneda es USD
	 */
	 @Test
	 public void CalculateYearBonusWorkerUSDTest() {
		 
	 }
	 
	 /*
	 * 7. Calcula el bono de fin de año de un Employee Manager 
	 * cuando la moneda es USD
	 */
	 @Test
	 public void CalculateYearBonusManagerUSDTest() {
		  Assert.assertEquals(293.0f, e2.CalculateYearBonus());
	 }
	 
	 
	 /*
	 * 8. Calcula el bono de fin de a�o de un Employee Supervisor 
	 * cuando la moneda es USD
	 */
	 @Test
	 public void CalculateYearBonusSupevisorUSDTest() {
		 
	 }
	 
	 /*
	 * 9. Calcula el bono de fin de a�o de un Employee Worker 
	 * cuando la moneda NO es USD
	 */
	 @Test
	 public void CalculateYearBonusWorkerEURTest() {
		 
	 }
	

}
