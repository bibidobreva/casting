package castingsite.casting.service;

import castingsite.casting.models.entity.UserRoleEntity;
import castingsite.casting.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CastingUserDetailsService  implements UserDetailsService {

    private final UserRepository userRepository;

    public CastingUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .map(CastingUserDetailsService::map)
                .orElseThrow(() -> new UsernameNotFoundException("User " + username + " not found!"));
    }



    private static UserDetails map(castingsite.casting.models.entity.User user) {
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPassword())
                .authorities(user.getRoles().stream().map(CastingUserDetailsService::map).toList())
                .build();

    }

    private static GrantedAuthority map(UserRoleEntity userRoleEntity) {

        return new SimpleGrantedAuthority("ROLE_" + userRoleEntity.getRole().name());
    }
}
