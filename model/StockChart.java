package edu.fra.uas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "StockChart")
public class StockChart {
	@Id
    @GeneratedValue
    private long id;
	
	@Column(name = "date")
    private Date Date;
	
	@Column(name = "wert")
    private Integer Wert;
    
    
    public StockChart() {
    
    }
    
	public StockChart(java.util.Date date, Integer wert) {
		super();
		Date = date;
		Wert = wert;
	}
	

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Integer getWert() {
		return Wert;
	}

	public void setWert(Integer wert) {
		Wert = wert;
	}

	public long getId() {
		return id;
	}
	
}
