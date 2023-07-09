package EcommerceAPI.Ecommerce_Api.CONTROLLER;

import EcommerceAPI.Ecommerce_Api.MODEL.AddressModel;
import EcommerceAPI.Ecommerce_Api.SERVICE.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addservice;
    @PostMapping("Address")
    public String Addaddress(@RequestBody AddressModel address){
        addservice.Addaddress(address);
        return "Address Addded";
    }
    @GetMapping("Address")
    public Iterable<AddressModel> getaddress(){
        return addservice.getaddress();

    }

}
