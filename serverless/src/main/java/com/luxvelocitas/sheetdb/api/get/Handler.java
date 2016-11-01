package com.luxvelocitas.sheetdb.api.get;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * https://spreadsheets.google.com/feeds/list/<ID>/od6/public/values?alt=json
 */
public class Handler implements RequestHandler<Request, Response> {
    @Override
    public Response handleRequest(Request input, Context context) {
        context.getLogger().log("KONKER: " + input.getId());

        Response response = new Response();
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setBody("[\"sheet\", \""+input.getId()+"\"]");

        return response;
    }
}
