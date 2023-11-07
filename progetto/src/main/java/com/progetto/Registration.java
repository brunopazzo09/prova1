package main.java.com.progetto;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Registration {

    public static void main(String[] args) {
        try {
            String postUrl = "http://ilari.somamed.cloud/oauth2/default/registration";
            
            Map<String, String> postData = new HashMap<>();
            postData.put("param1", "value1");
            postData.put("param2", "value2");

            URL url = new URL(postUrl);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");

            connection.setDoInput(true);
            connection.setDoOutput(true);

            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            // Create the POST data as a query string
            StringBuilder postDataString = new StringBuilder();
            for (Entry<String, String> param : postData.entrySet()) {
                if (postDataString.length() != 0) {
                    postDataString.append('&');
                }
                postDataString.append(param.getKey());
                postDataString.append('=');
                postDataString.append(param.getValue());
            }

            // Get the output stream and write the POST data
            OutputStream os = connection.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(os, "UTF-8");
            writer.write(postDataString.toString());
            writer.flush();
            writer.close();
            os.close();

            // Get the response from the server
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Process the response here
                String responseBody = response.toString();
                System.out.println("Response: " + responseBody);
            } else {
                System.out.println("HTTP POST request failed with response code: " + responseCode);
            }

            // Close the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
