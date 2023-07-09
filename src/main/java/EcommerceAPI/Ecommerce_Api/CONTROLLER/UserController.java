package EcommerceAPI.Ecommerce_Api.CONTROLLER;

import EcommerceAPI.Ecommerce_Api.MODEL.UserModel;
import EcommerceAPI.Ecommerce_Api.SERVICE.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userservice;
    @PostMapping("Users")
    public String adduser(@RequestBody UserModel user){
        userservice.adduser(user);
        return "User added";
    }
    @GetMapping("Users")
    public Iterable<UserModel> getuser(){
        return userservice.getuser();
    }
    @GetMapping("User?Id")
    public String getuserbyid(@PathVariable Long id){
        userservice.getuserbyid(id);
        return"Usrr By Id";
    }
}
