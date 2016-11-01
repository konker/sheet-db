package com.luxvelocitas.sheetdb.api.get;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

/**
 * https://spreadsheets.google.com/feeds/list/<ID>/od6/public/values?alt=json
 */
public class Handler implements RequestHandler<Request, Response> {
    private static final String KEY_SHEET_ID = "sheetId";
    private static final String KEY_COL = "col";
    private static final String KEY_ROW = "row";

    @Override
    public Response handleRequest(Request input, Context context) {
        context.getLogger().log("KONKER: " + input.getPathParameters());

        String sheetId = null;
        String col = null;
        String row = null;

        final Map<String,String> pathParameters = input.getPathParameters();

        if (pathParameters != null) {
            sheetId = pathParameters.get(KEY_SHEET_ID);
            col = pathParameters.get(KEY_COL);
            row = pathParameters.get(KEY_ROW);
        }

        Response response = new Response();
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setBody("[\"sheet\", \""+sheetId+"\", \""+col+"\", \""+row+"\"]");

        return response;
    }
}
