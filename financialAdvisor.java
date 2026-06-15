package com.midas.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String advisorNumber;

    @OneToMany(mappedBy = "financialAdvisor")
    private List<Portfolio> portfolios = new ArrayList<>();

    public FinancialAdvisor() {}

    public FinancialAdvisor(String firstName, String lastName, String advisorNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.advisorNumber = advisorNumber;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getAdvisorNumber() { return advisorNumber; }
    public void setAdvisorNumber(String advisorNumber) { this.advisorNumber = advisorNumber; }

    public List<Portfolio> getPortfolios() { return portfolios; }
    public void setPortfolios(List<Portfolio> portfolios) { this.portfolios = portfolios; }
}
