package com.enlist.customer.models;

import jakarta.persistence.Column;
import lombok.*;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class Affiliation extends DomainEntity {
    @Column(length = 200, nullable=false)
    private String org_name;

    @Override
    public String toString() {
        return (org_name != null && !org_name.isEmpty()) ?
                String.format("%s", org_name):
                super.toString();
    }
}
