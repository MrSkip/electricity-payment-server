package com.kursach.kep.payment.service;

import com.kursach.kep.access.jpa.AccessDAO;
import com.kursach.kep.payment.entity.Payment;
import com.kursach.kep.payment.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created by kondr on 01.04.2016.
 */

@Service
public class PaymentService extends AccessDAO<Payment> {
    private PaymentRepo paymentRepo;

    @Autowired
    public PaymentService(PaymentRepo paymentRepo) {
        super(paymentRepo);
        this.paymentRepo = paymentRepo;
    }
}
