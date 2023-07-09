package EcommerceAPI.Ecommerce_Api.REPOSITORY;

import EcommerceAPI.Ecommerce_Api.MODEL.OrderModel;
import org.springframework.data.repository.CrudRepository;

public interface IOrderRepo extends CrudRepository<OrderModel,Long> {
}
