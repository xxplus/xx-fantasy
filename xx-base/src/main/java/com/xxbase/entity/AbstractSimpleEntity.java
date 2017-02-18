package com.xxbase.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by admin on 17/02/17.
 */
@MappedSuperclass
public class AbstractSimpleEntity extends AbstractBaseEntity {

    @Column(length = 64, nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}