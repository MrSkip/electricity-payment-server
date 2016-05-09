package com.kursach.kep.subscribers;

import com.kursach.kep.access.rest.RestBase;
import com.kursach.kep.subscribers.entity.Subscribers;
import com.kursach.kep.subscribers.service.SubscribersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kondr on 01.04.2016.
 */

@RestController
@RequestMapping("subscribers")
public class SubscribersController extends RestBase<Subscribers>{
    private SubscribersService subscribersService;

    @Autowired
    public SubscribersController(SubscribersService subscribersService) {
        super(subscribersService);
        this.subscribersService = subscribersService;
    }
}
