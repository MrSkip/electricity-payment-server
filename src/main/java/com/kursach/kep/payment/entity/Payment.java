package com.kursach.kep.payment.entity;

import com.kursach.kep.entity.BaseEntity;
import com.kursach.kep.subscribers.entity.Subscribers;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by kondr on 01.04.2016.
 */

@Entity
public class Payment extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Date dayOfPayment;
    private Date lastPayment;
    private Integer currentMeter;
    private Integer lastMeter;
    private Integer limit;
    private Integer reuseLimit;
    private Double debt;
    private Integer amountForPayment;

    @ManyToOne
    @JoinColumn(name = "id_subscribers")
    private Subscribers subscribers;

    public Payment() {
    }

    public Payment(
            Long id,
            Date dayOfPayment,
            Date lastPayment,
            Integer currentMeter,
            Integer lastMeter,
            Integer limit,
            Integer reuseLimit,
            Double debt,
            Integer amountForPayment,
            Subscribers subscribers
    ) {
        this.id = id;
        this.dayOfPayment = dayOfPayment;
        this.lastPayment = lastPayment;
        this.currentMeter = currentMeter;
        this.lastMeter = lastMeter;
        this.limit = limit;
        this.reuseLimit = reuseLimit;
        this.debt = debt;
        this.amountForPayment = amountForPayment;
        this.subscribers = subscribers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "day_of_payment")
    public Date getDayOfPayment() {
        return dayOfPayment;
    }

    public void setDayOfPayment(Date dayOfPayment) {
        this.dayOfPayment = dayOfPayment;
    }

    @Basic
    @Column(name = "last_payment")
    public Date getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(Date lastPayment) {
        this.lastPayment = lastPayment;
    }

    @Basic
    @Column(name = "current_meter")
    public Integer getCurrentMeter() {
        return currentMeter;
    }

    public void setCurrentMeter(Integer currentMeter) {
        this.currentMeter = currentMeter;
    }

    @Basic
    @Column(name = "last_meter")
    public Integer getLastMeter() {
        return lastMeter;
    }

    public void setLastMeter(Integer lastMeter) {
        this.lastMeter = lastMeter;
    }

    @Basic
    @Column(name = "limit")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Basic
    @Column(name = "reuse_limit")
    public Integer getReuseLimit() {
        return reuseLimit;
    }

    public void setReuseLimit(Integer reuseLimit) {
        this.reuseLimit = reuseLimit;
    }

    @Basic
    @Column(name = "debt")
    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }

    @Basic
    @Column(name = "amount_for_payment")
    public Integer getAmountForPayment() {
        return amountForPayment;
    }

    public void setAmountForPayment(Integer amountForPayment) {
        this.amountForPayment = amountForPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (id != payment.id) return false;
        if (dayOfPayment != null ? !dayOfPayment.equals(payment.dayOfPayment) : payment.dayOfPayment != null)
            return false;
        if (lastPayment != null ? !lastPayment.equals(payment.lastPayment) : payment.lastPayment != null) return false;
        if (currentMeter != null ? !currentMeter.equals(payment.currentMeter) : payment.currentMeter != null)
            return false;
        if (lastMeter != null ? !lastMeter.equals(payment.lastMeter) : payment.lastMeter != null) return false;
        if (limit != null ? !limit.equals(payment.limit) : payment.limit != null) return false;
        if (reuseLimit != null ? !reuseLimit.equals(payment.reuseLimit) : payment.reuseLimit != null) return false;
        if (debt != null ? !debt.equals(payment.debt) : payment.debt != null) return false;
        if (amountForPayment != null ? !amountForPayment.equals(payment.amountForPayment) : payment.amountForPayment != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        Long result = id;
        result = 31 * result + (dayOfPayment != null ? dayOfPayment.hashCode() : 0);
        result = 31 * result + (lastPayment != null ? lastPayment.hashCode() : 0);
        result = 31 * result + (currentMeter != null ? currentMeter.hashCode() : 0);
        result = 31 * result + (lastMeter != null ? lastMeter.hashCode() : 0);
        result = 31 * result + (limit != null ? limit.hashCode() : 0);
        result = 31 * result + (reuseLimit != null ? reuseLimit.hashCode() : 0);
        result = 31 * result + (debt != null ? debt.hashCode() : 0);
        result = 31 * result + (amountForPayment != null ? amountForPayment.hashCode() : 0);
        return Math.toIntExact(result);
    }

    public Subscribers getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Subscribers subscribers) {
        this.subscribers = subscribers;
    }
}
