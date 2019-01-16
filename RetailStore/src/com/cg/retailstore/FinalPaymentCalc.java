package com.cg.retailstore;

public class FinalPaymentCalc {
	public Double getPaybleAmount(Double amount, CustomerInformation customerInformation) {
		int percentage = 0;
		switch (customerInformation.getType()) {
		case "Employee":
			percentage = 30;
			break;
		case "Affilated":
			percentage = 10;
			break;
		case "Other":
			float periodOfTime = UtilityClass.totalYear(customerInformation.getFirstVisit());
			if (periodOfTime > 2) {
				percentage = 5;
			} else {
				percentage = 0;
			}
			break;
		}
		return UtilityClass.finalPaybleAmount(amount, percentage);
	}
}
