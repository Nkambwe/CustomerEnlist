package com.enlist.customer.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
public abstract class DomainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@JdbcTypeCode(SqlTypes.BIGINT)
    private long id;

    @Column
    private boolean is_deleted;

    @Override
    public String toString() {
        return id != 0 ? String.format("Entity ID: %s", id): super.toString();
    }

}
