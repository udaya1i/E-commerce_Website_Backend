package ECommerce.backend.Controller;

import ECommerce.backend.Model.User;
import ECommerce.backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("login-user/{email}/{password}")
    public User loginUser(@PathVariable String email, @PathVariable String password){
        try{
           return this.userService.loginUser(email, password);
//         return ResponseEntity.ok("Login Successfull");
        }catch (Exception ex){
            System.out.println(ex);
//            return ResponseEntity.internalServerError().body("Internal Server Error");
        return null;
        }
    }
}
