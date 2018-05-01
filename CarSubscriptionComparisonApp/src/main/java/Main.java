import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Car v = new Car("Volvo");
        ArrayList list = v.getJSONs();

        for (int i = 0; i < list.size(); i++) {
            JSONObject json = new JSONObject(list.get(i).toString());
            System.out.println(json.get("centerText"));

        }
    }
}

