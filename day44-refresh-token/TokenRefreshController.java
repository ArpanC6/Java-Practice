@RestController
@RequestMapping("/auth")
public class TokenRefreshController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/refresh")
    public Map<String, String> refresh(@RequestParam String refreshToken) {

        Claims claims = jwtUtil.extractClaims(refreshToken);
        String username = claims.getSubject();

        String newAccessToken =
                jwtUtil.generateAccessToken(username, "USER");

        return Map.of("accessToken", newAccessToken);
    }
}
