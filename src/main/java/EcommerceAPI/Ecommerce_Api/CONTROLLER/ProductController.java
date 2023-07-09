package EcommerceAPI.Ecommerce_Api.CONTROLLER;

import EcommerceAPI.Ecommerce_Api.MODEL.ProductCategory;
import EcommerceAPI.Ecommerce_Api.MODEL.ProductModel;
import EcommerceAPI.Ecommerce_Api.SERVICE.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productservice;

    @PostMapping("Poducts")
    public String addproducts(@RequestBody ProductModel product){
        productservice.addproducts(product);
        return "products added";
    }
    @GetMapping("Products")
    public Iterable<ProductModel> getproducts(){
       return productservice.getproducts();
    }
    @DeleteMapping("Products")
    public String removeproductbyid(@PathVariable Long id){
        productservice.removeproductbyid(id);
        return"removed product by id";
    }
    @GetMapping("Product/Bycategory")
    public String getproductbycategory(@PathVariable ProductCategory category){
        productservice.getproductbycategory(category);
        return "Product By category";
    }
}
