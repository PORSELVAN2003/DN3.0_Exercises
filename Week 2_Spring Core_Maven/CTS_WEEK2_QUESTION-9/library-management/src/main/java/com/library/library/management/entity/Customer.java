package com.library.library.management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="tbl_customer")
@Setter
@Getter
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private Long age;
    private String location;
    @CreationTimestamp
    @Column(name="created_at",nullable = false,updatable = false)
    private Date createdAt;
    @UpdateTimestamp
    @Column(name="updated_at")

    private Date updateAt;

}
