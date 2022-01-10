package seosuwan.UserService.product.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import seosuwan.UserService.product.repository.ProductRepository;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
}
