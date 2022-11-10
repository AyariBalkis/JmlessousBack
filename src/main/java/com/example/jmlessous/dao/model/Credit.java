package com.example.jmlessous.dao.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "CREDIT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCredit;
    @OneToOne(mappedBy = "credit")
    private Insurance insurance;
    @ManyToOne(cascade = CascadeType.ALL)
    private  Account accountFK;
}
