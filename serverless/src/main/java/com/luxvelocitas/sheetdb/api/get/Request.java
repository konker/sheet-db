package com.luxvelocitas.sheetdb.api.get;

import java.util.Map;

public class Request {

    String id;
    String row;
    String col;

    public Request() { }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
