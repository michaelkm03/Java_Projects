import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Car v = new Car("Volvo");
        ArrayList<JSONObject> j = v.getJSONData();
        v.parseJSONs(j);

    }
}

