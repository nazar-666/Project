package ua.project.sombraproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import ua.project.sombraproject.authentication.MyDBAuthenticationService;

@Configuration
// @EnableWebSecurity = @EnableWebMVCSecurity + Extra features
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	MyDBAuthenticationService myDBAauthenticationService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// For User in database.
		auth.userDetailsService(myDBAauthenticationService);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// we don't need CSRF because our token is invulnerable
		http.csrf().disable();

		// The pages does not require login
		http.authorizeRequests().antMatchers("/", "/welcome", "/login", "/registration").permitAll();

		// /userInfo page requires login as USER.
		// If no login, it will redirect to /login page.
		http.authorizeRequests().antMatchers("/client**").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");

		// For ADMIN only.
		http.authorizeRequests().antMatchers("/admin**").access("hasRole('ROLE_ADMIN')");

		// When the user has logged in as XX.
		// But access a page that requires role YY,
		// AccessDeniedException will throw.
		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

		// Config for Login Form
		http.authorizeRequests().and().formLogin()//
				// Submit URL of login page.
				.loginProcessingUrl("/j_spring_security_check") // Submit URL
				.loginPage("/login")//
				.defaultSuccessUrl("/temp")//
				.usernameParameter("username")//
				.passwordParameter("password")//
				.and().logout()//
				.logoutUrl("/logout").logoutSuccessUrl("/welcome");
	}
}