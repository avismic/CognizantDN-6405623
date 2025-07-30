package com.cognizant.countryservice.controller;

import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info(">> getCountryIndia start");
        Country c = (Country) countryService.getCountry("IN");  // Load India bean from XML :contentReference[oaicite:5]{index=5}
        LOGGER.info("<< getCountryIndia end");
        return c;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();            // Load full list from XML :contentReference[oaicite:6]{index=6}
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws Exception {
        return countryService.getCountry(code);             // Case-insensitive lookup :contentReference[oaicite:7]{index=7}
    }
}
