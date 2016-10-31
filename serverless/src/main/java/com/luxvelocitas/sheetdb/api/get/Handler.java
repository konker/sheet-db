package com.luxvelocitas.sheetdb.api.get;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * https://spreadsheets.google.com/feeds/list/<ID>/od6/public/values?alt=json
 */
public class Handler implements RequestHandler<Request, Response> {
    private static final Logger sLogger = LoggerFactory.getLogger(Handler.class);

    @Override
    public Response handleRequest(Request input, Context context) {
        sLogger.info("KONKER: {}", input.getId());
        return new Response("200 Go Serverless v2.0! Your function executed successfully!", input);
    }
}
