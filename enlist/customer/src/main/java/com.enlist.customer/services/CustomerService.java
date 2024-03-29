package com.enlist.customer.services;

import com.enlist.customer.models.Affiliation;
import com.enlist.customer.models.Business;
import com.enlist.customer.models.CustomerType;
import com.enlist.customer.models.Person;
import com.enlist.customer.requests.AffiliationRequest;
import com.enlist.customer.requests.BusinessRequest;
import com.enlist.customer.requests.IndividualRequest;
import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void onBoardIndividual(IndividualRequest request) {
        Person person = Person.builder()
                .first_name(request.firstName())
                .middle_name(request.middleName())
                .last_name(request.lastName())
                .cus_type(CustomerType.fromValue(request.type()))
                .org_id(request.affiliation())
                .email(request.email())
                .phone(request.phone())
                .address(request.address())
                .is_deleted(false)
                .build();
    }

    public void onBoardBusiness(BusinessRequest request) {
        Business person = Business.builder()
                .business_name(request.businessName())
                .cus_type(CustomerType.fromValue(request.type()))
                .org_id(request.affiliation())
                .email(request.email())
                .phone(request.phone())
                .address(request.address())
                .is_deleted(false)
                .build();
    }

    public void addAffiliation(AffiliationRequest request) {
        Affiliation org = Affiliation.builder()
                .org_name(request.name())
                .build();
    }
}
