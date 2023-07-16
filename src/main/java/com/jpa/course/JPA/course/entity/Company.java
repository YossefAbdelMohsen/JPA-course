package com.jpa.course.JPA.course.entity;


import jakarta.persistence.*;




@Entity
@Table(name = "companies")
public class Company {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "company_id")
        private Long id;


        private  String name;

        private String city;

        private String state;


        private String zipcode;


    private String country;

    public Company(Long id, String name, String city, String state, String zipcode, String country) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
