@Configuration
public class SecurityHeaderConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .headers(headers -> headers
                .xssProtection()
                .and()
                .frameOptions().deny()
                .and()
                .contentSecurityPolicy(
                  "default-src 'self'"
                )
            );

        return http.build();
    }
}
