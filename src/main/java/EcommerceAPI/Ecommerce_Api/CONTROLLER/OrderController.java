package EcommerceAPI.Ecommerce_Api.CONTROLLER;

import EcommerceAPI.Ecommerce_Api.MODEL.OrderModel;
import EcommerceAPI.Ecommerce_Api.SERVICE.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderservice;
    @PostMapping("Orders")
    public String AddOders(@RequestBody OrderModel orders){
        orderservice.AddOrder(orders);
        return "Order Added";
    }

    @GetMapping("Orders")
    public Iterable<OrderModel> getorders(){
        return orderservice.getorders();
    }
    @GetMapping("Order/id")
    public String getorderbyid(@PathVariable Long id){
        orderservice.getorderbyid(id);
        return "Order By Id";
    }
}
