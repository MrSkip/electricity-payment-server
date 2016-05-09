package com.kursach.kep.payment.repository;

import com.kursach.kep.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kondr on 01.04.2016.
 */

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long>{
}
