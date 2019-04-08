package chris.ivey.discordjava;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class ApiHandler {

    public void process(String api){
        String gw2AccountUrl = "https://api.guildwars2.com/v2/account?access_token=";

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(gw2AccountUrl + api);
        HttpResponse response;
        // add request header
//        request.addHeader("User-Agent", USER_AGENT);

        {
            try {
                response = client.execute(request);
                ObjectMapper objectMapper = new ObjectMapper();
                AccountEntity account = objectMapper.readValue(response.getEntity().getContent(), AccountEntity.class);

                System.out.println(account.getWorld());

                System.out.println(account.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
