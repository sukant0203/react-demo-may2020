package com.example.springbootbackendapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
//Allow React JS application host to consume this Spring boot APIs
@CrossOrigin(origins = {"http://localhost:3000"})
public class InventoryController {
	
	@GetMapping(path = "/stocks", produces = "application/json")
    public List<Stock> getStocks() {
		List<Stock> stocks = new ArrayList();
		
		//Prepare back-end/DB call here to get data
		stocks.add(new Stock("11", "Chairs", "209"));
		stocks.add(new Stock("32", "Hangers", "1010"));
		stocks.add(new Stock("56", "Wooden boxes", "566"));
		stocks.add(new Stock("08", "Tables", "660"));
		
        return stocks;
    }

}
