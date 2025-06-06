package product.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import product.entity.Product;
import product.entity.ProductStock;
import product.entity.ProductStockHistory;
import product.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  //판매가능 상태 상품 조회
  @GetMapping
  public ResponseEntity <List<Product>> getAvailableProducts() {
    return ResponseEntity.ok(productService.getAvailableProducts());
  }

  @GetMapping("/stocks")
  public ResponseEntity <ProductStock> getProductStockHistory(@RequestParam int productNo) {
    return ResponseEntity.ok(productService.getProductStockHistory(productNo));
  }

  @PostMapping
  public ResponseEntity <Integer> createProductStockHistory(@RequestBody ProductStockHistory productStockHistory) {
    return ResponseEntity.ok(productService.createProductStockHistory(productStockHistory));
  }


}
