package com.enlist.customer.models;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper=true)
public class Business extends Customer {
    @Column(length = 220, nullable=false)
    private String business_name;
}
