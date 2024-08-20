package com.coderscamp.teslasalesreports;

import java.time.YearMonth;

public class TeslaData {
	
	private YearMonth date;
	private Integer sales;
	
	public TeslaData(YearMonth date, Integer sales) {
		super();
		this.date = date;
		this.sales = sales;
	
	}

	public YearMonth getDate() {
		return date;
	}

	public void setDate(YearMonth date) {
		this.date = date;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "TeslaData [date=" + date + ", sales=" + sales + "]";
	}

	
	
	

}
