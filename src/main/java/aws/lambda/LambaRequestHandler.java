package aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambaRequestHandler implements RequestHandler<String, String> {

    public String handleRequest(String s, Context context) {
        return "Input: " + s + " Context: " + context;
    }
}
