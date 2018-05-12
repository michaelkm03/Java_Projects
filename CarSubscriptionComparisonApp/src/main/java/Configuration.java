import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Configuration {

    public String requestEndpoint(String Endpoint) throws IOException {
        URL url = new URL(Endpoint);
        System.out.println(url);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        return content.toString();

    }

    public Map<String, String> generateMap(String name) {
        Map<String, String> map = new HashMap<String, String>();
        if (name == "Volvo") {
            map.put("momentum-subscription-(-600-month)", "xc40");
            map.put("r-design-subscription-(-700-month)", "xc40");

        }
        else {
            System.out.println("Could not find that car...");
        }
        return map;
    }

}
