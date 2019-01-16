package com.cg.retailstore;

import java.time.LocalDate;
import java.time.Period;

public class UtilityClass {
	static float totalYear(String firstVisitDate) {
		String[] firstVisitDateSplitor = firstVisitDate.split("/");
		int date = Integer.parseInt(firstVisitDateSplitor[0]);
		int month = Integer.parseInt(firstVisitDateSplitor[1]);
		int year = Integer.parseInt(firstVisitDateSplitor[2]);
		LocalDate registrationAge = LocalDate.of(year, month, date);
		LocalDate today = LocalDate.now();
		Period age = Period.between(registrationAge, today);
		float totalRegistrationYear = age.getYears();
		int totalRegistrationMonth = age.getMonths();
		int totalRegistrationDate = age.getDays();
		return totalRegistrationYear + totalRegistrationMonth + totalRegistrationDate;
	}
	static Double finalPaybleAmount(Double amount, int precentage) {
		 	return amount - Math.floor(amount / 100) * precentage;
	}

}
