package product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import product.entity.ProductStock;

@Repository
public interface ProductStockRepository extends JpaRepository<ProductStock, Integer> {

  //상품 재고 조회
  ProductStock findByProductId(int productId);
}
