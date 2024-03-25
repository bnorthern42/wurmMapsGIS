package net.northern.wurmmaps.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @SuppressWarnings("removal")
    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
                .oauth2Client()
                .and()
                .oauth2Login()
                .tokenEndpoint()
                .and()
                .userInfoEndpoint();

        http
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.ALWAYS);

        http
                .authorizeHttpRequests()
                .requestMatchers("/unauthenticated", "/oauth2/**", "/login/**").permitAll()
                .anyRequest()
                .fullyAuthenticated()
                .and()
                .logout()
                .logoutSuccessUrl("https://localhost:7077/realms/external/protocol/openid-connect/logout?redirect_uri=http://localhost:7077/");

        return http.build();
    }

//    @Bean
//    InMemoryUserDetailsManager users() {
//        return new InMemoryUserDetailsManager(
//                User.withUsername("dan")
//                        .password("{noop}password")
//                        .roles("ADMIN")
//                        .build()
//        );
//    }


}
