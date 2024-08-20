package com.coderscamp.teslasalesreports;

import java.time.YearMonth;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReportCalculations {
												   
    public static void yearlySalesCreateReport(String models, List<TeslaData> amount) {
		Map<Integer, Integer> createYearlyReport = amount.stream()
				.collect(Collectors.groupingBy(TeslaData -> TeslaData.getDate().getYear(),
						Collectors.summingInt(TeslaData -> TeslaData.getSales())));
		
		for (Map.Entry<Integer, Integer> entry : createYearlyReport.entrySet()) {
			Integer a = entry.getKey();
			Integer z = entry.getValue();
			System.out.println(a + " -> " + z);

		}
		
	}
	
	public static void bestMonth(String model, List <TeslaData> amount) {
		Optional <TeslaData> highSale = amount.stream()
								   .collect(Collectors.maxBy(
										   Comparator.comparingInt(TeslaData -> TeslaData.getSales())));
			if(highSale.isPresent()) {
				TeslaData highestSaleRecord = highSale.get();
				YearMonth highestSaleDate = highestSaleRecord.getDate();
				System.out.println("The Best month for " + model + " was " + highestSaleDate);
				
			} else {
				System.out.println("No sales records for " + model);
			}
		
	}
	
	public static void worstMonth(String model, List <TeslaData> amount) {
		Optional<TeslaData> lowSale = amount.stream()
									.collect(Collectors.minBy(
											Comparator.comparingInt(TeslaData -> TeslaData.getSales())));
			if(lowSale.isPresent()) {
				TeslaData lowestSaleRecord = lowSale.get();
				YearMonth lowestSaleDate = lowestSaleRecord.getDate();
				System.out.println("The Worst month for " + model + " was " + lowestSaleDate);
						
			} else {
				System.out.println("No sales records for " + model);
			}
		
	}

}
