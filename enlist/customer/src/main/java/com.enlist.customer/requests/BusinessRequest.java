package com.enlist.customer.requests;

public record BusinessRequest(
        String businessName,
        String address,
        String email,
        String phone,
        int type,
        int affiliation) {
}

