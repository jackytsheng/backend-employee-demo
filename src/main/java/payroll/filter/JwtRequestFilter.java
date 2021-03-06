//package payroll.filter;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.stereotype.Component;
//import payroll.services.MyUserDetailsService;
//import payroll.services.util.JwtUtil;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//public class JwtRequestFilter extends UsernamePasswordAuthenticationFilter {
//
//  @Autowired
//  private MyUserDetailsService userDetailsService;
//  @Autowired
//  private JwtUtil jwtUtil;
//
//  @Override
//  public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws
//      AuthenticationException {
//    super.attemptAuthentication(request,response);
//  }
//
//  @Override
//  protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
//                                          Authentication authResult) throws IOException, ServletException {
//    super.successfulAuthentication(request,response,chain,authResult);
//  }
//
//}
