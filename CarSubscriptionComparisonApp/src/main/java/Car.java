import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Car {

    private Configuration config;
    private Map<String, String> carMap;
    private String name;
    private List<String> list = new ArrayList<String>();


    public Car (String name) {
        this.name = name;
        this.config = new Configuration();
        this.carMap = this.config.generateMap(this.name);
        this.list.add("https://www.volvocars.com/us/build/suv/xc40/momentum-subscription-(-600-month)/t5-awd-momentum/summary?json");
        this.list.add("https://www.volvocars.com/us/build/suv/xc40/r-design-subscription-(-700-month)/t5-awd-r-design/summary?json");
    }

    public ArrayList<JSONObject> getJSONData () throws IOException {
        ArrayList<JSONObject> jsonObjects = new ArrayList<JSONObject>();
        for (int i = 0; i < this.list.size(); i++){
            JSONObject json = new JSONObject(this.config.requestEndpoint(this.list.get(i)));
            jsonObjects.add(json);
            // System.out.println(jsonObjects.get(i));
        }
        return jsonObjects;
    }
    /*
     * Price per month
     * Monthly payment
     * Down Payment
     * Term
     * Annual mileage allowance
     * Car by Volvo Subscription
     * Included Subscription
     */

    public void parseJSONs (ArrayList<JSONObject> jsonObjects) {
        for (int i = 0; i < jsonObjects.size();i++){
            HashMap <String, String> vehicleData = new HashMap();
            vehicleData.put("versionName", jsonObjects.get(i).get("versionName").toString());
            vehicleData.put("modelName", jsonObjects.get(i).get("modelName").toString());
            vehicleData.put("versionDescription", jsonObjects.get(i).get("versionDescription").toString());
            System.out.println("==============================" + (i + 1) + "==============================");
            System.out.println("Name:         " + vehicleData.get("versionName"));
            System.out.println("Model:        " + vehicleData.get("modelName"));
            //System.out.println("Description:  " + vehicleData.get("versionDescription"));
            System.out.println("============================== SUBSCRIPTION ================================");
            JSONObject options = (JSONObject) jsonObjects.get(i).get("leaseOffer");
            JSONArray features = (JSONArray) options.get("features");
            for (int j = 0; j < features.length(); j++) {
                JSONObject json = features.getJSONObject(j);
                Iterator<String> keys = json.keys();

                while (keys.hasNext()) {
                    String key = keys.next();
                    System.out.println(key.toUpperCase() + ":    " + json.get(key));
                }
            }
        }
    }
}
