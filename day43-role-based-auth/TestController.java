@RestController
public class TestController {

    @GetMapping("/admin/dashboard")
    public String adminApi() {
        return "Admin access granted";
    }

    @GetMapping("/user/profile")
    public String userApi() {
        return "User access granted";
    }
}
