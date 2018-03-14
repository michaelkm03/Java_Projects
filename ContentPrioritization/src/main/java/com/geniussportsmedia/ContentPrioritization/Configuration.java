package com.geniussportsmedia.ContentPrioritization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Configuration {

    // Base URLs and Commands
    String baseURL_OPAP = "https://prod.pamestoixima.gr/betstream-view/page/opapgeniusbet/desktop";
    String baseJSON = "https://prod.pamestoixima.gr/betstream-view/customer/betgenius/product/opapgeniusbet/component";
    String baseSpecific = "https://prod.pamestoixima.gr/betstream-view/marketlist/opapgeniusbet/json";
    String eventQuery = "?eventId=";
    String competitionQuery = "?competitionId=";
    String defaultLocale = "?culture=en-GB";

    // Map of Endpoints
    Map<String, String> endpoints = new HashMap<String, String>();

    public Configuration() {

        // Pages
        this.endpoints.put("Home", "/home");
        this.endpoints.put("In-Play", "/in-play");

        // Sports Specific Pages
        this.endpoints.put("BASKETBALL", "/sport?sportId=BASKETBALL&culture=el-GR");
        this.endpoints.put("FOOTBALL", "/sport?sportId=FOOTBALL&culture=el-GR");
        this.endpoints.put("TENNIS", "/sport?sportId=TENNIS&culture=el-GR");
        this.endpoints.put("CRICKET", "/sport?sportId=CRICKET&culture=el-GR");
        this.endpoints.put("VOLLEYBALL", "/sport?sportId=VOLLEYBALL&culture=el-GR");

        // Trees (JSON)
        this.endpoints.put("FEATURED_TREE", "/featuredtree/json?componentId=featuredtree&culture=el-GR");
        this.endpoints.put("PREMATCH_TREE", "/prematchupnexttree/json?componentId=prematchupnexttree&culture=el-GR");
        this.endpoints.put("INPLAY_TREE", "/inplayfixtures/json?componentId=inplayfixtures&culture=el-GR");
        this.endpoints.put("AZ_TREE", "/azsporttree/json?componentId=azsporttree&culture=el-GR");
        this.endpoints.put("OUTRIGHTS_TREE", "/outrightscompetitionspecifictree/json?componentId=outrightscompetitionspecifictree&culture=el-GR");

    }

    public String requestEndpoint(String Endpoint) throws IOException {
        URL url = new URL(Endpoint);
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

}
