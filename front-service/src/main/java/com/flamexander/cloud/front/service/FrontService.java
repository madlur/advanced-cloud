package com.flamexander.cloud.front.service;

import com.flamexander.cloud.common.ProductDto;
import com.flamexander.cloud.service.product.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class FrontService {

    private final RestTemplate restTemplate;

    public List<ProductDto> getProducts() {

        return restTemplate.getForObject("http://products-back/api/v1/products", List.class);
    }

    public ProductDto getProductById(Long id) {
        return restTemplate.getForObject("http://products-back/api/v1/products/" + id, ProductDto.class);
    }
}
