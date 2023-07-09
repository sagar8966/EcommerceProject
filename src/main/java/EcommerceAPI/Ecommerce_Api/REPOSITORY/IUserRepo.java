package EcommerceAPI.Ecommerce_Api.REPOSITORY;

import EcommerceAPI.Ecommerce_Api.MODEL.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<UserModel,Long> {
}
