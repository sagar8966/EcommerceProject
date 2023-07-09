package EcommerceAPI.Ecommerce_Api.SERVICE;

import EcommerceAPI.Ecommerce_Api.MODEL.UserModel;
import EcommerceAPI.Ecommerce_Api.REPOSITORY.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo userrepo;

    public void adduser(UserModel user) {
        userrepo.save(user);
    }

    public Iterable<UserModel> getuser() {
        return userrepo.findAll();
    }

    public void getuserbyid(Long id) {
        userrepo.findById(id);
    }
}
