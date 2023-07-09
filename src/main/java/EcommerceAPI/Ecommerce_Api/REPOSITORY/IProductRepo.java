package EcommerceAPI.Ecommerce_Api.REPOSITORY;

import EcommerceAPI.Ecommerce_Api.MODEL.ProductCategory;
import EcommerceAPI.Ecommerce_Api.MODEL.ProductModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductRepo extends CrudRepository<ProductModel,Long> {
    List<ProductModel>findByOrderByproductcateogory(ProductCategory category);
}
