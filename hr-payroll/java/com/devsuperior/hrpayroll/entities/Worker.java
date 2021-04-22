package com.devsuperior.hrpayroll.entities;



public class Worker  {

	private long id;
	private String name;
	private Double dailyIncome;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDailyIncome() {
		return dailyIncome;
	}
	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", dailyIncome=" + dailyIncome + "]";
	}
	
	
	

	
}
