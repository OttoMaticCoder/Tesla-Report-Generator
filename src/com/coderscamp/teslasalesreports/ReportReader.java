package com.coderscamp.teslasalesreports;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReportReader {
	
	public List<TeslaData> readReport(String fileName) {
		
		List<TeslaData> salesData = new ArrayList<>();
		
		try(BufferedReader reportReader = new BufferedReader(new FileReader(fileName))) {
			reportReader.readLine();
			String line;
			while((line = reportReader.readLine()) != null) {
				
				String[] salesInfo = line.split(",");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-yy");	
                YearMonth date = YearMonth.parse(salesInfo[0], formatter);
                Integer sales = Integer.valueOf(salesInfo[1]);

							
					TeslaData teslaData = new TeslaData(date, sales);
					salesData.add(teslaData);
				
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salesData;
		
	}

}
