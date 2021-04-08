package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable {
    private String nome;
    private Double dailyIncome;
    private int days;

    public Payment() {

    }

    public Payment(String nome, Double dailyIncome, int days) {
        this.nome = nome;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getTotal(){
        return days * dailyIncome;
    }
}
