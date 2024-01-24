package com.forStudy.OnlineShopping.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @Column
    private String address;

    @Column
    private String status;

    @ManyToOne
    @JoinColumn(name="userId")
    @ToString.Exclude
    private User user;
}
