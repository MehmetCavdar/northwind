package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {   // genel bir veri tipi tanimladik

	private T data;
	public DataResult(T data, boolean success, String message) {
		super(success, message); // this'de farki extend edilen Class yapisini da icermesidir
		this.data=data;
	}
	
	public DataResult(T data, boolean success) {
		super(success); // this'de farki extend edilen Class yapisini da iccermesidir
		this.data=data;
	}

	//Data okumak icin Getter
	 public T getData() {
		return this.data;	
	}
	

}
