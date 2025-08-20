package com.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String street;

    private String state;
    private String city;

    private  Integer pincode;


}
