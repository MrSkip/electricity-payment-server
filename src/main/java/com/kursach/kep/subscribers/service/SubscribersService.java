package com.kursach.kep.subscribers.service;

import com.kursach.kep.access.jpa.AccessDAO;
import com.kursach.kep.subscribers.entity.Subscribers;
import com.kursach.kep.subscribers.repository.SubscribersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created by kondr on 01.04.2016.
 */

@Service
public class SubscribersService extends AccessDAO<Subscribers> {

    private SubscribersRepo subscribersRepo;

    @Autowired
    public SubscribersService(SubscribersRepo subscribersRepo) {
        super(subscribersRepo);
        this.subscribersRepo = subscribersRepo;
    }
}
