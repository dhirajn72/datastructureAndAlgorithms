package com.java.core;

import java.util.Date;

/**
 * @author Dhiraj
 * @date 08/05/18
 */
public final class Immutable {

    private final StringBuilder name;
    private final Date dob;


    public Immutable(StringBuilder name, Date id) {
        this.name = new StringBuilder(name);
        this.dob = new Date(id.getTime());
    }

    public StringBuilder getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }
}
