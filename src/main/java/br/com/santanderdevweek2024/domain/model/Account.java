package br.com.santanderdevweek2024.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity(name = "week_account")
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(scale = 13, precision = 2)
    private BigDecimal balance;

    @Column(name = "additional_limit",scale = 13, precision = 2)
    private BigDecimal limit;
}
