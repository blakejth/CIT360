import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class test1 {
	
public static void main (String[] args) {
	    Date today = new Date();
		String title = (	"|----------------------------| \n"
				+ 		  	"|   Created by: Theodore H.  | \n"
				+			"|"+today+"| \n"
				+			"|____________________________| \n \n \n");
		System.out.println(title);
		
		String results = getUrlCode("http://radiate-health.blogspot.com/");
		System.out.println(results);
	}
	
	private static String getUrlCode(String selectedURL) {
		StringBuilder results = new StringBuilder();
		
		try {
			URL url = new URL(selectedURL);
			URLConnection urlConnect = url.openConnection();
			BufferedReader urlReader = new BufferedReader(new InputStreamReader(urlConnect.getInputStream()));
			String line;

			while((line = urlReader.readLine()) != null) {			
				results.append(line + "\n");
			}
			urlReader.close();
		} catch(Exception a)
		{
			a.printStackTrace();
		}
		return results.toString();
	}
}

