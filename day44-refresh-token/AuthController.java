@PostMapping("/login")
public Map<String, String> login(@RequestParam String username,
                                 @RequestParam String role) {

    String accessToken = jwtUtil.generateAccessToken(username, role);
    String refreshToken = jwtUtil.generateRefreshToken(username);

    Map<String, String> tokens = new HashMap<>();
    tokens.put("accessToken", accessToken);
    tokens.put("refreshToken", refreshToken);

    return tokens;
}
