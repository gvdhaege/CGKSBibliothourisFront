package be.cegeka.bibliothouris.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


import javax.inject.Inject;

import static org.springframework.http.HttpMethod.POST;

@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebsecurityConfig extends WebSecurityConfigurerAdapter {

    @Inject
    private UserDetailsService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf()
            .disable();

        http
            .authorizeRequests()
            .antMatchers("/").permitAll()
            .antMatchers(POST, "/user").permitAll()
            .anyRequest().authenticated()
            .and().httpBasic()
            .and()
            .cors().configurationSource(corsConfigSource())
        ;
    }

    private CorsConfigurationSource corsConfigSource() {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return source;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }

}
