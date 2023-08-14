package ECommerce.backend.Controller;

import ECommerce.backend.Model.User;
import ECommerce.backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/user-register")
    public ResponseEntity<?> createUser(@RequestBody User user){
      try{
          if (user.getEmail().length() >0 && user.getPassword().length()>0 && user.getName().length()>0){
              this.userService.createUser(user);
              System.out.println("test "+user.toString().length());
              return ResponseEntity.ok("User Created Successfully");
          }else{
            return  ResponseEntity.badRequest().body("Incomplete data");
          }
      }catch (Exception ex){
          System.out.println("Internal Server Error  "+ex);
          return ResponseEntity.internalServerError().body("Internal Server Error");
      }
    }
}
