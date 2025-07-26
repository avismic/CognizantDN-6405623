package com.cognizant.countryservice;

import com.cognizant.countryservice.controller.CountryController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc  // Enable MockMVC :contentReference[oaicite:9]{index=9}
class CountryServiceApplicationTests {

    @Autowired
    private CountryController countryController;

    @Autowired
    private MockMvc mvc;

    @Test
    void contextLoads() {
        assertNotNull(countryController);  // controller is loaded
    }

    @Test
    void testGetCountryIndia() throws Exception {
        mvc.perform(get("/country"))
           .andExpect(status().isOk())
           .andExpect(jsonPath("$.code").value("IN"))
           .andExpect(jsonPath("$.name").value("India"));
    }

    @Test
    void testGetCountryNotFound() throws Exception {
        mvc.perform(get("/country/az"))
           .andExpect(status().isNotFound())
           .andExpect(status().reason("Country not found"));
    }
}
