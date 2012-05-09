package f.t.s;

import java.net.URI;
import org.apache.http.HttpResponse;
import org.apache.http.client.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class Main {
	public static void main(String[] args) throws Exception {
		
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet();
		request.setURI(new URI("https://www.googleapis.com/language/translate/v2?key=AIzaSyBGtYX8w2IyY8NQUh9DQx9ZMUW4fxn3KH0&source=en&target=fr&q=Hello%20world"));
		HttpResponse response = client.execute(request);
		System.out.println(response.toString());
		
	}
}