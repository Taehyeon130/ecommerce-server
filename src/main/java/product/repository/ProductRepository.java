package product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import product.entity.Product;
import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

  //상품 상태에 따른 상품조회
  List<Product> selectProductList(Product.prdStatus status);


}
