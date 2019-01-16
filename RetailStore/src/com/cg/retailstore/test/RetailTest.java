package com.cg.retailstore.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.retailstore.CustomerInformation;
import com.cg.retailstore.FinalPaymentCalc;

public class RetailTest {
	@Test
	public void otherCustomerTypeTest() {
		CustomerInformation cust = new CustomerInformation("Other", "16/12/2016");
		FinalPaymentCalc finalPaymentCalc = new FinalPaymentCalc();
		assertEquals(new Double(95.0), finalPaymentCalc.getPaybleAmount(100.0, cust));
	}

	@Test
	public void employeeCustomerTypeTest() {
		CustomerInformation cust = new CustomerInformation("Employee", "16/12/2016");
		FinalPaymentCalc finalPaymentCalc = new FinalPaymentCalc();
		assertEquals(new Double(70.0), finalPaymentCalc.getPaybleAmount(100.0, cust));
	}

	@Test
	public void employeeCustomerTypeTestUpdate() {
		CustomerInformation cust = new CustomerInformation("Employee", "16/12/2016");
		FinalPaymentCalc finalPaymentCalc = new FinalPaymentCalc();
		assertEquals(new Double(71.0), finalPaymentCalc.getPaybleAmount(101.0, cust));
	}

	@Test
	public void affilatedCustomerTypeTest() {
		CustomerInformation cust = new CustomerInformation("Affilated", "16/12/2016");
		FinalPaymentCalc finalPaymentCalc = new FinalPaymentCalc();
		assertEquals(new Double(90.0), finalPaymentCalc.getPaybleAmount(100.0, cust));
	}

	@Test
	public void affilatedCustomerTypeTestUpdate() {
		CustomerInformation cust = new CustomerInformation("Affilated", "16/12/2016");
		FinalPaymentCalc finalPaymentCalc = new FinalPaymentCalc();
		assertEquals(new Double(91.0), finalPaymentCalc.getPaybleAmount(101.0, cust));
	}
	@Test
	public void affilatedCustomerTypeTestUpdat() {
		CustomerInformation cust = new CustomerInformation("Affilated", "16/12/2016");
		FinalPaymentCalc finalPaymentCalc = new FinalPaymentCalc();
		assertEquals(new Double(10.0), finalPaymentCalc.getPaybleAmount(10.0, cust));
	}
}
