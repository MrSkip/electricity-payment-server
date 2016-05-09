package com.kursach.kep.subscribers.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kursach.kep.entity.BaseEntity;
import com.kursach.kep.payment.entity.Payment;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

/**
 * Created by kondr on 01.04.2016.
 */

@Entity
public class Subscribers extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Integer personalAccount;
    private String lastName;
    private String firstName;
    private Date birsday;
    private String sex;
    private String typeOfSettlement;
    private String nameOfSettelement;
    private String addres;
    private Integer phoneNumber;
    private String benefits;

    @OneToMany(mappedBy = "subscribers")
    @JsonIgnore
    private Set<Payment> payments;

    public Subscribers() {
    }

    public Subscribers(
            Long id,
            Integer personalAccount,
            String lastName,
            String firstName,
            Date birsday,
            String sex,
            String typeOfSettlement,
            String nameOfSettelement,
            String addres,
            Integer phoneNumber,
            String benefits
    ) {
        this.id = id;
        this.personalAccount = personalAccount;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birsday = birsday;
        this.sex = sex;
        this.typeOfSettlement = typeOfSettlement;
        this.nameOfSettelement = nameOfSettelement;
        this.addres = addres;
        this.phoneNumber = phoneNumber;
        this.benefits = benefits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "personal_account")
    public Integer getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(Integer personalAccount) {
        this.personalAccount = personalAccount;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "birsday")
    public Date getBirsday() {
        return birsday;
    }

    public void setBirsday(Date birsday) {
        this.birsday = birsday;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "type_of_settlement")
    public String getTypeOfSettlement() {
        return typeOfSettlement;
    }

    public void setTypeOfSettlement(String typeOfSettlement) {
        this.typeOfSettlement = typeOfSettlement;
    }

    @Basic
    @Column(name = "name_of_settelement")
    public String getNameOfSettelement() {
        return nameOfSettelement;
    }

    public void setNameOfSettelement(String nameOfSettelement) {
        this.nameOfSettelement = nameOfSettelement;
    }

    @Basic
    @Column(name = "addres")
    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Basic
    @Column(name = "phone_number")
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "benefits")
    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscribers that = (Subscribers) o;

        if (id != that.id) return false;
        if (personalAccount != null ? !personalAccount.equals(that.personalAccount) : that.personalAccount != null)
            return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (birsday != null ? !birsday.equals(that.birsday) : that.birsday != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (typeOfSettlement != null ? !typeOfSettlement.equals(that.typeOfSettlement) : that.typeOfSettlement != null)
            return false;
        if (nameOfSettelement != null ? !nameOfSettelement.equals(that.nameOfSettelement) : that.nameOfSettelement != null)
            return false;
        if (addres != null ? !addres.equals(that.addres) : that.addres != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (benefits != null ? !benefits.equals(that.benefits) : that.benefits != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Long result = id;
        result = 31 * result + (personalAccount != null ? personalAccount.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (birsday != null ? birsday.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (typeOfSettlement != null ? typeOfSettlement.hashCode() : 0);
        result = 31 * result + (nameOfSettelement != null ? nameOfSettelement.hashCode() : 0);
        result = 31 * result + (addres != null ? addres.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (benefits != null ? benefits.hashCode() : 0);
        return Math.toIntExact(result);
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }
}
