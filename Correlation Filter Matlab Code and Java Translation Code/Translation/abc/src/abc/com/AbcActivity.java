package abc.com;

import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class AbcActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet();
		HttpResponse response =null;
		try{
		request.setURI(new URI("https://www.googleapis.com/language/translate/v2?key=AIzaSyBGtYX8w2IyY8NQUh9DQx9ZMUW4fxn3KH0&source=en&target=fr&q=Hello%20world"));
		response = client.execute(request);
		
		}catch (Exception e) {
			Log.d("Exception called", e.toString());
			
		}
		Log.d("----------", "Reached end of code");
		
    }
}