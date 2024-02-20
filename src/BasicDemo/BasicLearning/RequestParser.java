package BasicDemo.BasicLearning;

import java.util.ArrayList;
import java.util.List;

public class RequestParser {

    public static List<String> parseRequests(List<String> validAuthTokens, List<List<String>> requests) {
        List<String> result = new ArrayList<>();

        for (List<String> request : requests) {
            String requestType = request.get(0);
            String url = request.get(1);
            String[] urlParts = url.split("\\?");
            String[] parameters = urlParts[1].split("&");
            String authToken = null;
            String csrfToken = null;

            // Extract tokens and parameters
            for (String parameter : parameters) {
                String[] keyValue = parameter.split("=");
                String key = keyValue[0];
                String value = keyValue[1];
                if (key.equals("token")) {
                    authToken = value;
                } else if (requestType.equals("POST") && key.equals("csrf")) {
                    csrfToken = value;
                }
            }

            // Validate request
            boolean isValid = validAuthTokens.contains(authToken);
            if (requestType.equals("POST")) {
                isValid = isValid && (csrfToken != null && csrfToken.matches("[a-zA-Z0-9]{8,}"));
            }

            // Build result string
            if (isValid) {
                StringBuilder parametersString = new StringBuilder();
                for (String parameter : parameters) {
                    String[] keyValue = parameter.split("=");
                    //System.out.println(parameter);
                    parametersString.append(",").append(keyValue[0].replace("token","id")).append(",").append(keyValue[1]);
                }
                result.add("VALID" + parametersString.toString());
            } else {
                result.add("INVALID");
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> validAuthTokens = List.of("ah37j2ha483u", "safh34ywb0p5", "ba34wyi8t902");
        List<List<String>> requests = new ArrayList<>();
        requests.add(List.of("GET", "https://example.com/?token=347sd6yk8iu2&name=alex"));
        requests.add(List.of("GET", "https://example.com/?token=safh34ywb0p5&name=sam"));
        requests.add(List.of("POST", "https://example.com/?token=safh34ywb0p5&name=alex"));
        requests.add(List.of("POST", "https://example.com/?token=safh34ywb0p5&csrf=ak2sh32dy&name=chris"));

        List<String> result = parseRequests(validAuthTokens, requests);
        for (String res : result) {
            System.out.println(res);
        }
    }
}