package com.kursach.kep.entity;

import java.io.Serializable;

/**
 * Created by kondr on 01.04.2016.
 */

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
