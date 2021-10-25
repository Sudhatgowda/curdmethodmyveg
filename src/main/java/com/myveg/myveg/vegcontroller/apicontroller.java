package com.myveg.myveg.vegcontroller;

import com.myveg.myveg.vegmodel.vuser;
import com.myveg.myveg.vegrepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class apicontroller {

    @Autowired
    private UserRepo userRepo;

    @GetMapping (value = "/user1")
    public List<vuser> getusers(){
        return userRepo.findAll();
    }

    @PostMapping (value = "/saved")
    public String saveuser(@RequestBody vuser vuser ) {
        userRepo.save(vuser);
        return "Data saved uptodate";
    }

    @PutMapping (value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody vuser vuser ){
        vuser updatedUser=userRepo.findById(id).get();
        updatedUser.setPrice((vuser.getPrice()));
        updatedUser.setQty((vuser.getQty()));
        updatedUser.setShopname((vuser.getShopname()));
        updatedUser.setVeg((vuser.getVeg()));
        userRepo.save(updatedUser);
        return "YOUR DATA IS UPDATED";

    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteuser(@PathVariable long id){
        vuser deleteuser=userRepo.findById(id).get();
        userRepo.delete(deleteuser);
        return "Deleted user with the id : " +id;
    }



}
