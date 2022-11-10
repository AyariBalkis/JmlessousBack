package com.example.jmlessous.dao.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Insurance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Insurance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInsurance;
    @OneToOne
    private Credit credit;
}
