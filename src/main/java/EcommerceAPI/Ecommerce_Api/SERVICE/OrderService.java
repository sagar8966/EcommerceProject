package EcommerceAPI.Ecommerce_Api.SERVICE;

import EcommerceAPI.Ecommerce_Api.MODEL.OrderModel;
import EcommerceAPI.Ecommerce_Api.REPOSITORY.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderrepo;

    public void AddOrder(OrderModel orders) {
        orderrepo.save(orders);
    }

    public Iterable<OrderModel> getorders() {
        return orderrepo.findAll();
    }

    public void getorderbyid(Long id) {
        orderrepo.findById(id);
    }
}
