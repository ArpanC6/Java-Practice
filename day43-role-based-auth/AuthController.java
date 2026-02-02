@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String role) {

        return jwtUtil.generateToken(username, role);
    }
}
