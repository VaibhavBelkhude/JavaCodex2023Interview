
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRegistrationRequest registrationRequest) {
        // Validate the registrationRequest and perform necessary checks
        if (registrationRequest == null || !isValidRegistration(registrationRequest)) {
            return ResponseEntity.badRequest().body("Invalid registration request");
        }

        // Attempt to register the user
        try {
            userService.registerUser(registrationRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
        } catch (UserRegistrationException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to register user");
        }
    }

    private boolean isValidRegistration(UserRegistrationRequest registrationRequest) {
        // Add your validation logic here (e.g., check for required fields, valid email, password strength, etc.)
        // Return true if the registration request is valid; otherwise, return false.
        // Example validation: 
        return registrationRequest.getEmail() != null && registrationRequest.getPassword() != null;
    }
}
