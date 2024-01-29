package com.forStudy.OnlineShopping.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
public class Address extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("주소ID")
    private Long addressId;

    @Column
    @Comment("주소")
    private String address;

    @ManyToOne
    @JoinColumn(name="userId")
    @ToString.Exclude
    private User user;
}
