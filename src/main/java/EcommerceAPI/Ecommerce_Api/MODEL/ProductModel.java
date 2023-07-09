package EcommerceAPI.Ecommerce_Api.MODEL;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productid;
    private String productname;
    private Integer productprice;
    private String productdiscription;
    @Enumerated(EnumType.STRING)
    private ProductCategory productcateogory;
}
