package com;

import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.api.services.translate.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // Set the HTTP referrer to your website address.
    // GoogleAPI.setHttpReferrer("https://www.googleapis.com/language/translate/v2?");

    // Set the Google Translate API key
    // See: http://code.google.com/apis/language/translate/v2/getting_started.html
    // GoogleAPI.setKey(AIzaSyBGtYX8w2IyY8NQUh9DQx9ZMUW4fxn3KH0);
	// GET https://www.googleapis.com/language/translate/v2?key=INSERT-YOUR-KEY&source=en&target=de&q=Hello%20world;
    
	  HttpClient client = new DefaultHttpClient();
      HttpGet request = new HttpGet();
      request.setURI(new URI("https://www.googleapis.com/language/translate/v2?key=AIzaSyBGtYX8w2IyY8NQUh9DQx9ZMUW4fxn3KH0&source=en&target=fr&q=Hello%20world"));
      HttpResponse response = client.execute(request);
      System.out.println(response.toString());
	  
    // String translatedText = Translate.DEFAULT.execute("Bonjour le monde", Language.FRENCH, Language.ENGLISH);

    //System.out.println(translatedText);
  }
}
