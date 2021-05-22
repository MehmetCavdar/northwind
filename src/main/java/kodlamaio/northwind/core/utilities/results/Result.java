package kodlamaio.northwind.core.utilities.results;

public class Result {
	
	private boolean success;
	private String message;
	
	public Result (boolean success) {   // sadece islem sonucu bildiren Mesaj icermeyen constructor
	this.success=success;
	}
	
	public Result (boolean success, String message) {   // sadece islem sonucu bildiren Mesaj icermeyen constructor
		this(success);
		this.message=message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	
}
