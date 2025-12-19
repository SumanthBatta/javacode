package com.sum.techie;

import java.util.Date;

public final class ImmutableUser { //m1. ake class final
    private final String username; //2  make fields private final
    private final Date dateOfBirth;// any mutable fields like date

    public ImmutableUser(String username, Date dateOfBirth) {
        this.username = username;
        // 3. perform a defensive copy for mutable fields
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    //4. no setters

    public String getUsername(){
        return username;
    }
    public Date getDateOfBirth(){

        //5 . return  a copy, not the original reference value.
        return new Date(dateOfBirth.getTime());
    }
}
