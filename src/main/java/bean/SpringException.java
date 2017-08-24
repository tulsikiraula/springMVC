package bean;

public class SpringException extends RuntimeException  {

	private static final long serialVersionUID = 1L;
	
	String exceptionMsg;

	public SpringException(String exceptionMsg) {
		super();
		this.exceptionMsg = exceptionMsg;
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

}
