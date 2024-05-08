package org.example.Controller;

import org.example.Dto.ProductDao;
import org.example.Entity.Product;
import org.example.Entity.Promotion;
import org.example.Service.ProductService;
import org.example.Service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductDao productDao;
    @Autowired
    private PromotionService promotionRepository;

    @GetMapping("/findAll")
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @GetMapping("/findByProductId/{productId}")
    public Promotion findByProductId(@PathVariable Long productId) {
        return promotionRepository.findByProductId(productId);
    }

    @PostMapping("/insert")
    public void insertProduct(@RequestBody Product product) {
        productService.insert(product);
    }


    @PostMapping("/update")
    public void updateProduct( @RequestBody Product product) {
        productService.update(product);
    }

}
