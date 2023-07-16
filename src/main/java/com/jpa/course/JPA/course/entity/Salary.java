package com.jpa.course.JPA.course.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "salaries")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "salary_id")
    private Long id;


    private  Company company;

    private Integer level;

    private Double bonus;


    private Double starting_salary;

    private Double current_salary;

    private Boolean active_flag;
    private String title;


    public Salary(Long id, Company company, Integer level, Double bonus, Double starting_salary, Double current_salary, Boolean active_flag, String title) {
        this.id = id;
        this.company = company;
        this.level = level;
        this.bonus = bonus;
        this.starting_salary = starting_salary;
        this.current_salary = current_salary;
        this.active_flag = active_flag;
        this.title = title;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Double getStarting_salary() {
        return starting_salary;
    }

    public void setStarting_salary(Double starting_salary) {
        this.starting_salary = starting_salary;
    }

    public Double getCurrent_salary() {
        return current_salary;
    }

    public void setCurrent_salary(Double current_salary) {
        this.current_salary = current_salary;
    }

    public Boolean getActive_flag() {
        return active_flag;
    }

    public void setActive_flag(Boolean active_flag) {
        this.active_flag = active_flag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
