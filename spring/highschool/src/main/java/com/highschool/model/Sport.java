package com.highschool.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sports")
public class Sport {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sportId")
    private Long sportId;

    @Column(name = "sportName")
    private String sportName;

    @Column(name = "sportCredits")
    private Integer sportCredits;

    public Sport()
    {}

    public Sport(String sportName, Integer sportCredits)
    {
        this.sportName = sportName;
        this.sportCredits = sportCredits;
    }
}
