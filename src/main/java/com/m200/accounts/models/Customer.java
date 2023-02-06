package com.m200.accounts.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customer_id")
    private int customerId;

    @Column(name="customer_name")
    private String customerName;

    @Column(name="customer_email")
    private String customerEmail;

    @Column(name="customer_mobile")
    private String customerMobile;

    @Column(name="created_date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createdDate;

}
