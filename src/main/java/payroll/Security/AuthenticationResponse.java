package payroll.Security;


import lombok.Data;

@Data
public class AuthenticationResponse {
  private final String jwt;

  public AuthenticationResponse(String jwt){
    this.jwt = jwt;
  }
}
