import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Car {

    private Configuration config;
    private Map<String, String> carMap;
    private String baseURL = "https://www.volvocars.com/us/build/";
    private String name;
    private String company;
    private String type = "suv";


    public Car (String name) {
        this.name = name;
        this.config = new Configuration();
        this.carMap = this.config.generateMap(this.name);
    }


    public ArrayList getJSONs () throws IOException {
        Iterator it = this.carMap.entrySet().iterator();
        ArrayList list = new ArrayList();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            String url = this.baseURL + this.type + "/" + pair.getKey() + "/" + pair.getValue() + "?json";
            String json = this.config.requestEndpoint(url);
            list.add(json);
            it.remove();
        }
        return list;
    }

}
