package com.luxvelocitas.sheetdb.api.get;

import java.util.HashMap;
import java.util.Map;

public class Response {
    private int mStatusCode;
    private String mBody;
    private Map<String,String> mHeaders;

	public Response(int statusCode, String body) {
        mStatusCode = statusCode;
		mBody = body;
        mHeaders = new HashMap<String, String>();
	}

    public Response(int statusCode) {
        mStatusCode = 200;
        mBody = "\"\"";
        mHeaders = new HashMap<String, String>();
    }

    public Response(String body) {
        mStatusCode = 200;
        mBody = body;
        mHeaders = new HashMap<String, String>();
    }

    public Response() {
        mStatusCode = 200;
        mBody = "\"\"";
        mHeaders = new HashMap<String, String>();
    }

    public int getStatusCode() {
        return mStatusCode;
    }

    public void setStatusCode(int statusCode) {
        mStatusCode = statusCode;
    }

    public String getBody() {
        return mBody;
    }

    public void setBody(String body) {
        mBody = body;
    }

    public Map<String,String> getHeaders() {
        return mHeaders;
    }

    public void setHeaders(Map<String,String> headers) {
        mHeaders = headers;
    }

    public void setHeader(String name, String value) {
        mHeaders.put(name, value);
    }
}
