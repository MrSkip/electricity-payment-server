package com.kursach.kep.payment;

import com.kursach.kep.access.jpa.AccessDAO;
import com.kursach.kep.access.rest.RestBase;
import com.kursach.kep.payment.entity.Payment;
import com.kursach.kep.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kondr on 01.04.2016.
 */

@RestController
@RequestMapping("payment")
public class PaymentController extends RestBase<Payment>{
    private PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        super(paymentService);
        this.paymentService = paymentService;
    }
}
