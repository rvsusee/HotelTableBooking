package hotel.table.booking.model;

import org.apache.http.HttpStatus;
import org.json.JSONObject;

public class Response {

	private int httpStatus;
	private String message;
	private String responseBody;

	public Response() {
	}

	public Response(int httpStatus, String message) {
		this.httpStatus = httpStatus;
		this.message = message;
	}

	public Response(int httpStatus, String message, String responseBody) {
		this.httpStatus = httpStatus;
		this.message = message;
		this.responseBody = responseBody;
	}

	public int getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus.hashCode();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(JSONObject responseBody) {
		this.responseBody = responseBody.toString();
	}

}
