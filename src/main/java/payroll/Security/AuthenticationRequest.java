package payroll.Security;

import lombok.Data;

@Data
public class AuthenticationRequest {

  private String username;
  private String password;

  AuthenticationRequest(){}

  AuthenticationRequest(String username, String password){
    this.password = password;
    this.username = username;
  }
}
