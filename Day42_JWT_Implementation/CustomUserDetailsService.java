@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        return User.builder()
                .username(username)
                .password("password")
                .roles("USER")
                .build();
    }
}
