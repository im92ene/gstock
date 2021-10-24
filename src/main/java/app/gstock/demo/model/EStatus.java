package app.gstock.demo.model;

public enum EStatus {
		   VALIDATED,
		   INSTANCE,
		   ANNULER,
		   RJECT;
	

		    public EStatus getName() {
		        return EStatus.valueOf(name());
	           
	  }
	}
