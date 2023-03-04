package edu.fra.uas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CandlestickChart")
public class CandlestickChart {
	@Id
	@GeneratedValue
	private long id;

	// Definition of data fields for the x and y values
	@Column(name = "date")
	private Date Date;

	@Column(name = "opening")
	private Integer Opening;

	@Column(name = "max")
	private Integer Max;

	@Column(name = "min")
	private Integer Min;

	@Column(name = "closing")
	private Integer Closing;

	public CandlestickChart() {

	}

	// Constructor to initialize data fields for x and y values
	public CandlestickChart(java.util.Date date, Integer opening, Integer max, Integer min, Integer closing) {
		super();
		Date = date;
		Opening = opening;
		Max = max;
		Min = min;
		Closing = closing;
	}

	// getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Integer getOpening() {
		return Opening;
	}

	public void setOpening(Integer opening) {
		Opening = opening;
	}

	public Integer getMax() {
		return Max;
	}

	public void setMax(Integer max) {
		Max = max;
	}

	public Integer getMin() {
		return Min;
	}

	public void setMin(Integer min) {
		Min = min;
	}

	public Integer getClosing() {
		return Closing;
	}

	public void setClosing(Integer closing) {
		Closing = closing;
	}

}
