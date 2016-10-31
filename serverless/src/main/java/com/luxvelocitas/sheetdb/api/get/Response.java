package com.luxvelocitas.sheetdb.api.get;

public class Response {
    private String mMessage;
    private Request mRequest;

    public Response(String message, Request request) {
        this.mMessage = message;
        this.mRequest = request;
    }

    public Response() { }

    public String getMessage() {
        return this.mMessage;
    }

    public Request getRequest() {
        return this.mRequest;
    }

    public void setMessage(String message) {
        this.mMessage = message;
    }

    public void setRequest(Request mRequest) {
        this.mRequest = mRequest;
    }

}
