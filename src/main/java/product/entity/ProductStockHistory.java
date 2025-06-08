package product.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="product_stock_history")
public class ProductStockHistory {

  @Id
  private Long prdStockHistoryNo;

  private Long prdNo;

  private Long prdStockNo;

  private int changeAmount;

  private int beforeStock;
  private int afterStock;

  @Enumerated(EnumType.STRING)
  private ProductStockHistory.changeType changeType;

  public enum changeType {
    INCREASE, DECREASE
  }


}
