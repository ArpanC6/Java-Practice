@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login() {
        return "JWT_TOKEN_GENERATED";
    }
}
