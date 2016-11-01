package com.luxvelocitas.sheetdb.api.get;

import java.util.Map;

public class Request {
    Map<String,String> pathParameters;
    String sheetId;
    String row;
    String col;

    public Request() { }

    public Map<String,String> getPathParameters() {
        return pathParameters;
    }

    public void setPathParameters(Map<String,String> pathParameters) {
        this.pathParameters = pathParameters;
    }

    public String getSheetId() {
        return sheetId;
    }

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }
}
