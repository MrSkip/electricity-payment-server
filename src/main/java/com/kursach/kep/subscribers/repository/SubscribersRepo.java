package com.kursach.kep.subscribers.repository;

import com.kursach.kep.subscribers.entity.Subscribers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kondr on 01.04.2016.
 */

@Repository
public interface SubscribersRepo extends JpaRepository<Subscribers, Long>{
}
