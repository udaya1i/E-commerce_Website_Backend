package ECommerce.backend.Controller;

import ECommerce.backend.Model.User;
import ECommerce.backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user-singup")
    public ResponseEntity<?> createUser(@RequestBody User user){
        try{
            this.userService.createUser(user);
            return ResponseEntity.ok("User Created Successfully!");
        }catch (Exception ex){
            return ResponseEntity.internalServerError().body("Internal Server Error!!!");
        }
    }
}
