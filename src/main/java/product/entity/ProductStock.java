package product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "product_stock")
public class ProductStock {
  @Id
  private Long prdStockNo;

  private Long prdNo;

  private int stockAmount;


}
