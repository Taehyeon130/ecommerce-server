package product.service;

import org.springframework.stereotype.Service;
import product.entity.Product;
import product.entity.ProductStock;
import product.entity.ProductStockHistory;
import product.repository.ProductRepository;
import product.repository.ProductStockHistoryRepository;
import product.repository.ProductStockRepository;
import java.util.List;

@Service
public class ProductService {
  private final ProductRepository productRepository;
  private final ProductStockRepository productStockRepository;
  private final ProductStockHistoryRepository productStockHistoryRepository;


  public ProductService(ProductRepository productRepository, ProductStockRepository productStockRepository, ProductStockHistoryRepository productStockHistoryRepository) {
    this.productRepository = productRepository;
    this.productStockRepository = productStockRepository;
    this.productStockHistoryRepository = productStockHistoryRepository;
  }

  //판매가능 상태 상품 조회
  public List<Product> getAvailableProducts(){
    List<Product> resultList = productRepository.selectProductList(Product.prdStatus.AVAILABLE);
    return resultList;
  }
  //상품 재고 조회
  public ProductStock getProductStockHistory(int productNo){
    return productStockRepository.findByProductId(productNo);
  }

  //상품 재고 이력 등록
  public int createProductStockHistory(ProductStockHistory productStockHistory){
    return productStockHistoryRepository.insertProductStockHistory(productStockHistory);
  }

}
