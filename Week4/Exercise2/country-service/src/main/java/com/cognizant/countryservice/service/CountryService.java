package com.cognizant.countryservice.service;

import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.service.exception.CountryNotFoundException;
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
            .orElseThrow(() -> new CountryNotFoundException());  // throw if not found :contentReference[oaicite:8]{index=8}
    }
}
