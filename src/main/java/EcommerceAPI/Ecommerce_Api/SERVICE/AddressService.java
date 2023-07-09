package EcommerceAPI.Ecommerce_Api.SERVICE;

import EcommerceAPI.Ecommerce_Api.MODEL.AddressModel;
import EcommerceAPI.Ecommerce_Api.REPOSITORY.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addrepo;

    public void Addaddress(AddressModel address) {
        addrepo.save(address);
    }

    public Iterable<AddressModel> getaddress() {
        return addrepo.findAll();
    }
}
