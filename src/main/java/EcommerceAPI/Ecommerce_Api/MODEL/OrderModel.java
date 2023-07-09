package EcommerceAPI.Ecommerce_Api.MODEL;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderid;
    private Integer productquantity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="FK_Productid")
    private ProductModel productModel;


    @ManyToMany(cascade= CascadeType.ALL)
    @JoinTable(name ="FK_Order_userTable",joinColumns = @JoinColumn(name="FK_OrderModel"),
            inverseJoinColumns = @JoinColumn(name="FK_Userid"))
    private List<UserModel> userModels;

}
