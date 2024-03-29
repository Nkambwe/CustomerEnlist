package com.enlist.customer.models;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper=true)
public class Person extends Customer {
    @Column(length = 40, nullable=false)
    private String first_name;

    @Column(length = 40, nullable=false)
    private String middle_name;

    @Column(length = 40, nullable=false)
    private String last_name;

}
