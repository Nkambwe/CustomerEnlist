package com.enlist.customer.controllers;

import com.enlist.customer.requests.AffiliationRequest;
import com.enlist.customer.requests.BusinessRequest;
import com.enlist.customer.requests.IndividualRequest;
import com.enlist.customer.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("customers")
public record CustomerController(CustomerService service) {

    @PostMapping
    public void onBoardIndividualCustomer(@RequestBody IndividualRequest request){
        log.info("New customer on boarding {}", request);
        service.onBoardIndividual(request);
    }

    @PostMapping
    public void onBoardBusinessCustomer(@RequestBody BusinessRequest request){
        log.info("New customer on boarding {}", request);
        service.onBoardBusiness(request);
    }

    @PostMapping
    public void onBoardAffiliationCustomer(@RequestBody AffiliationRequest request){
        log.info("New customer on boarding {}", request);
        service.addAffiliation(request);
    }
}
