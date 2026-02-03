@RestController
@RequestMapping("/auth")
public class LogoutController {

    private Set<String> blacklistedTokens = new HashSet<>();

    @PostMapping("/logout")
    public String logout(@RequestParam String refreshToken) {
        blacklistedTokens.add(refreshToken);
        return "Logged out successfully";
    }
}
