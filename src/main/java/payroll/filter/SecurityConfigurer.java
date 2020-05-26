package payroll.filter;


import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import payroll.services.MyUserDetailsService;

public class SecurityConfigurer extends WebSecurityConfigurerAdapter {
  private MyUserDetailsService myUserDetailsService;



}
