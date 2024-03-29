package com.enlist.customer.models;

public enum CustomerType {
    UNKNOWN(0),
    PERSON(1),
    BUSINESS(2);

    private final int value;

    CustomerType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public static CustomerType fromValue(int value) {
        for (CustomerType type : CustomerType.values()) {
            if (type.getValue() == value) {
                return type;
            }
        }
        return CustomerType.UNKNOWN;
    }
}
