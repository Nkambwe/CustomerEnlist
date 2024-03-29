package com.enlist.customer.requests;

public record IndividualRequest(
        String firstName,
        String middleName,
        String lastName,
        String address,
        String email,
        String phone,
        int type,
        int affiliation) {
}
