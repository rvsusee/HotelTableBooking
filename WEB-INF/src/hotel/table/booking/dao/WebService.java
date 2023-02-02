package hotel.table.booking.dao;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

public class WebService {

	private SCESession mySession;

	public WebService(SCESession mySession) {
		this.mySession = mySession;
	}

	HttpClient httpClient = HttpClientBuilder.create().build();

	public JSONObject doGet(String url) {
		try {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "doGet Started", mySession);
			String apiUrl = "http://172.16.11.191:8082/" + url;
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API Request : " + url, mySession);
			HttpGet getRequest = new HttpGet(apiUrl);
			getRequest.addHeader("accept", "application/json");
			getRequest.addHeader("content-type", "application/json");
			HttpResponse response = httpClient.execute(getRequest);
			if (response.getStatusLine().getStatusCode() != 200) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_FATAL,
						"Failed : HTTP error code : " + response.getStatusLine().getStatusCode(), mySession);
				return null;
			} else {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API Access - Success", mySession);
				HttpEntity httpEntity = response.getEntity();
				String apiOutput = EntityUtils.toString(httpEntity);
				return new JSONObject(apiOutput);
			}
		} catch (JSONException err) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_FATAL, "JSONException : " + err.getLocalizedMessage(), mySession);
			return null;
		} catch (IOException err) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_FATAL, "IOException : " + err.getLocalizedMessage(), mySession);
			return null;
		} catch (Exception err) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_FATAL, "Exception : " + err.getLocalizedMessage(), mySession);
			return null;
		}
	}

	public JSONObject doPost(String url, String requestBody) {
		try {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "doPost Method Started", mySession);
			String apiUrl = "http://172.16.11.191:8082/" + url;
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API Request : " + url, mySession);
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API RequestBody : " + requestBody, mySession);

			HttpPost httpPost = new HttpPost(apiUrl);
			httpPost.addHeader("accept", "application/json");
			httpPost.addHeader("content-type", "application/json");
			httpPost.setEntity(new StringEntity(requestBody));
			HttpResponse response = httpClient.execute(httpPost);
			if (response.getStatusLine().getStatusCode() != 200) {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_FATAL,
						"Failed : HTTP error code : " + response.getStatusLine().getStatusCode(), mySession);
				return null;
			} else {
				TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "API Access - Success", mySession);
				HttpEntity httpEntity = response.getEntity();
				String apiOutput = EntityUtils.toString(httpEntity);
				System.out.println("Output : " + apiOutput);
				JSONObject jsonObject = null;
				return new JSONObject(apiOutput);
			}

		} catch (ClientProtocolException err) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_FATAL, "ClientProtocolException : " + err.getLocalizedMessage(),
					mySession);
			return null;
		} catch (JSONException err) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_FATAL, "JSONException : " + err.getLocalizedMessage(), mySession);
			return null;
		} catch (IOException err) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_FATAL, "IOException : " + err.getLocalizedMessage(), mySession);
			return null;
		} catch (Exception err) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_FATAL, "Exception : " + err.getLocalizedMessage(), mySession);
			return null;
		}
	}
}