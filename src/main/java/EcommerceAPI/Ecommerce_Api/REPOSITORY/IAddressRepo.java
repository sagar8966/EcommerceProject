package EcommerceAPI.Ecommerce_Api.REPOSITORY;

import EcommerceAPI.Ecommerce_Api.MODEL.AddressModel;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<AddressModel,Long> {

}
