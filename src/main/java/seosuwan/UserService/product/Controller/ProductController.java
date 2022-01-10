package seosuwan.UserService.product.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import seosuwan.UserService.product.service.ProductServiceImpl;

@RestController @RequiredArgsConstructor
public class ProductController {
    private final ProductServiceImpl productService;

}
