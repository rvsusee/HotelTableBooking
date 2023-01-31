package hotel.table.booking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.avaya.sce.runtimecommon.SCESession;

public class WebService {

	private SCESession session;

	public WebService(SCESession session) {
		this.session = session;
	}

	HttpClient httpClient = HttpClientBuilder.create().build();

	void getUsers() {
		try {

			HttpGet getRequest = new HttpGet("http://localhost:8082/customer/login");
			getRequest.addHeader("accept", "application/json");
			getRequest.addHeader("content-type", "application/json");
			String jsonUser = "{mobileNumber : " + new Long("8838930954") + ", pin : " + "gsdfasfasd" + "}";
			HttpResponse response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}