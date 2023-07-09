package EcommerceAPI.Ecommerce_Api.MODEL;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressid;
    private String Addressname;
    private String Landmark;
    private String PhoneNo;
    private String zipcode;
    private String State;

    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "Fk_userid")
    UserModel userModel;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="FK_Addressid")
    List <OrderModel> orderModel;

}
