package com.coderscamp.teslasalesreports;

import java.util.List;

public class TeslaSalesReportApplication {
	
	public static void main(String[] args) {
		
		ReportReader reportReader = new ReportReader();
		List<TeslaData> mod3 = reportReader.readReport("model3.csv");
		List<TeslaData> modS = reportReader.readReport("modelS.csv");
		List<TeslaData> modX = reportReader.readReport("modelX.csv");
		
		System.out.println("Model 3 Yearly Sales Report");
		System.out.println("---------------------------");
		ReportCalculations.yearlySalesCreateReport("model3.csv", mod3);
		ReportCalculations.bestMonth("model3", mod3);
		ReportCalculations.worstMonth("model3", mod3);
		System.out.println("---------------------------");
		System.out.println("Model S Yearly Sales Report");
		System.out.println("---------------------------");
		ReportCalculations.yearlySalesCreateReport("modelS.csv", modS);
		ReportCalculations.bestMonth("modelS", modS);		
		ReportCalculations.worstMonth("modelS", modS);		
		System.out.println("---------------------------");
		System.out.println("Model X Yearly Sales Report");
		System.out.println("---------------------------");
		ReportCalculations.yearlySalesCreateReport("modelX.csv", modX);
		ReportCalculations.bestMonth("modelX", modX);
		ReportCalculations.worstMonth("modelX", modX);
		
		
	}
	
	
}
