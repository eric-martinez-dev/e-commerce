package com.backend.ecommerce.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.backend.ecommerce.model.Product;
import com.backend.ecommerce.repository.ProductRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(ProductRepository productRepository) {
        return args -> {

            Product p1 = new Product("Teclado", 25000.0, 15);
            Product p2 = new Product("Mouse", 15000.0, 30);
            Product p3 = new Product("Monitor", 180000.0, 5);

            productRepository.save(p1);
            productRepository.save(p2);
            productRepository.save(p3);

        };
    }
}
