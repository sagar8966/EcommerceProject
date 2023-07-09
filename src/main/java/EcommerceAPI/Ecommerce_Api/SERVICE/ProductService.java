package EcommerceAPI.Ecommerce_Api.SERVICE;

import EcommerceAPI.Ecommerce_Api.MODEL.ProductCategory;
import EcommerceAPI.Ecommerce_Api.MODEL.ProductModel;
import EcommerceAPI.Ecommerce_Api.REPOSITORY.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    IProductRepo productrepo;

    public void addproducts(ProductModel product) {
        productrepo.save(product);
    }

    public Iterable<ProductModel> getproducts() {
        return productrepo.findAll();
    }

    public void removeproductbyid(Long id) {
        productrepo.deleteById(id);
    }

    public void getproductbycategory(ProductCategory category) {
        productrepo.findByOrderByproductcateogory(category);
    }
}
