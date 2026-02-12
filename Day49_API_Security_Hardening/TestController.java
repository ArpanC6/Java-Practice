@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping
    public String testApi() {
        return "API is secured & rate limited";
    }
}
