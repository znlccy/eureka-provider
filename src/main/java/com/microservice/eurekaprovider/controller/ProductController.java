package com.microservice.eurekaprovider.controller;

import com.microservice.eurekaprovider.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.dc.pr.PRError;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @RequestMapping(value = "getProducts", method = RequestMethod.GET)
    public List<Product> getProducts() {
        List<Product> list = new ArrayList<Product>();
        Product product1 = new Product("苹果", 12.45);
        Product product2 = new Product("香蕉", 25.35);
        list.add(product1);
        list.add(product2);
        return list;
    }
}
