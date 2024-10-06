package com.kodilla.crud.hibernate.task;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "TASK_FINANCIAL_DETAILS")
public class TaskFinancialDetails {

    private int id;
    private double price;
    private boolean paid;

    public TaskFinancialDetails() {
    }

    public TaskFinancialDetails(double price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "TASK_FINANCIAL_DETAILS_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "PRICE")
    public double getPrice() {
        return price;
    }

    @NotNull
    @Column(name = "PAID")
    public boolean isPaid() {
        return paid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
