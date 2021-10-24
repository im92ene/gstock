package app.gstock.demo.model;



public enum ERole {
	   ROLE_AGENT,
	   ROLE_ADMIN;

	public ERole getName() {
        return ERole.valueOf(name());
    
  }
}

