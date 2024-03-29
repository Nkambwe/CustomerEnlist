package com.enlist.customer.models;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper=true)
public class Customer  extends DomainEntity {
    @Column(nullable=false)
    private long org_id;

    @Column(length = 220, nullable=false)
    private String address;

    @Column
    private CustomerType cus_type;

    @Column(length = 220, nullable=false)
    private String email;

    @Column(length = 25, nullable=false)
    private String phone;

    @Column(length = 40, nullable=false)
    private String account;

}
