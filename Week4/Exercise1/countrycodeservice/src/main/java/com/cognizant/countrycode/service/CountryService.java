package com.cognizant.countrycode.service;

import com.cognizant.countrycode.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private ApplicationContext ctx;

    @SuppressWarnings("unchecked")
    public List<Country> getAllCountries() {
        return (List<Country>) ctx.getBean("countryList");
    }

    public Country getCountry(String code) {
        return getAllCountries().stream()
            .filter(c -> c.getCode().equalsIgnoreCase(code))
            .findFirst()
            .orElse(null);  // returns null if not found
    }
}
