package com.flamexander.cloud.front.service;

import com.flamexander.cloud.common.ProductDto;
import com.flamexander.cloud.service.product.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
@AllArgsConstructor
public class FrontController {

    private final FrontService service;

    @GetMapping("/products")
    public List<ProductDto> mainPage() {
        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public ProductDto getProductById(@PathVariable Long id) {
        return service.getProductById(id);
    }

    @GetMapping("/test")
    public String testMethod() {
        return "Test OK";
    }


}
