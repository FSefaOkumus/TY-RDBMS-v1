package com.tybootcamp.ecomm.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tybootcamp.ecomm.enums.Gender;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Profile
{
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(nullable = false)
    @MapsId
    @JsonIgnore
    private Seller seller;


    @OneToOne
    @JoinColumn(nullable = false)
    @MapsId
    @JsonIgnore
    private Customer customer;

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String website;
    @Temporal(TemporalType.DATE)
    private Date birthday;
    private String address;

    private String emailAddress;

    @Enumerated(EnumType.STRING)
    private Gender gender;


    public Profile(Customer customer, String firstName, String lastName, Date birthday, String address, String emailAddress, Gender gender) {
        this.customer = customer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.emailAddress = emailAddress;
        this.gender = gender;
    }

    public Profile(Seller seller, String firstName, String lastName, Gender gender)
    {
        this.seller = seller;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }



    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public Seller getSeller()
    {
        return seller;
    }

    public void setSeller(Seller seller)
    {
        this.seller = seller;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }
}
