package ua.project.sombraproject.authentication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ua.project.sombraproject.dao.ClientDAO;
import ua.project.sombraproject.model.Client;

@Service
public class MyDBAuthenticationService implements UserDetailsService {

	@Autowired
	private ClientDAO userInfoDAO;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Client userInfo = userInfoDAO.checkClient(username);

		if (userInfo == null) {
			throw new UsernameNotFoundException("User " + username + " was not found in the database");
		}

		List<String> roles = userInfoDAO.getClientRole(username);

		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
		if (roles != null) {
			for (String role : roles) {
				// ROLE_USER, ROLE_ADMIN,..
				GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + role);
				grantList.add(authority);
			}
		}

		UserDetails userDetails = (UserDetails) new User(userInfo.getLogin(), //
				userInfo.getPassword(), grantList);

		return userDetails;
	}

}