/*
package com.bookstore.config;


//import com.bookstore.service.impl.UserSecurityService;
//import com.bookstore.utility.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class SecurityConfig extends WebSecurityConfigurationAdapter {
public class SecurityConfig extends WebSecurityConfiguration {
    @Autowired
    @Lazy
    private Environment environment;

    @Autowired
    @Lazy
    private UserSecurityService userSecurityService;

    private BCryptPasswordEncoder passwordEncoder(){
        return SecurityUtility.passwordEncoder();
    }

    private static final String[] PUBLIC_MATCHER = {
            "/css/**",
            "/js/**",
            "/image/**",
            "/",
            "/myAccount",
    };

    @Override
    protected void configure(@Lazy HttpSecurity http) throws Exception{
        http.authorizeRequests().
                               antMatchers("/**").
                        requestMatchers(PUBLIC_MATCHER).
                permitAll().anyRequest().authenticated();

        http.csrf().disable().cors().disable().formLogin().failureUrl("/login?error").defaultSuccessURL("/").loginPage("/login").permitAll().and().logout()
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/?logout").deleteCookies("remember-me")
                        .permitAll().and().rememberMe();
    }

    @Autowired
    public void configureGlobal(@Lazy AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
    }

}
*/
