package product.entity;

import jakarta.persistence.*;
import lombok.Data;

// entity/Product.java
@Entity
@Data
@Table(name = "product")
public class Product {
  @Id
  private Long prdNo;

  private String prdName;

  private int price;

  private int totalSales;

  @Enumerated(EnumType.STRING)
  private prdStatus status;

  public enum prdStatus {
    AVAILABLE, UNAVAILABLE
  }
}
