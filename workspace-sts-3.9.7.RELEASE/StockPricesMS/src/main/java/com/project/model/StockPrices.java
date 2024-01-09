
package com.project.model;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STOCKPRICES")
public class StockPrices {
	
	@EmbeddedId
	private PricesId id;
	private double open, high, low, close;
	
	public PricesId getId() {
		return id;
	}
	public void setId(PricesId id) {
		this.id = id;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	@Override
	public String toString() {
		return "StockPrices [id=" + id + ", open=" + open + ", high=" + high + ", low=" + low + ", close=" + close
				+ "]";
	}
	
	
}
