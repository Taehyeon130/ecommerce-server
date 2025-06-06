package product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import product.entity.ProductStockHistory;

@Repository
public interface ProductStockHistoryRepository extends JpaRepository<ProductStockHistory, Integer> {
  //상품재고이력 등록
  int insertProductStockHistory(ProductStockHistory productStockHistory);
}
