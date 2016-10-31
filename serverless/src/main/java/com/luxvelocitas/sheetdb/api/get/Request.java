package com.luxvelocitas.sheetdb.api.get;

public class Request {

    private String mId;
    private String mRow;
    private String mCol;

    public Request() {
    }

    public String getId() {
        return mId;
    }

    public String getRow() {
        return mRow;
    }

    public String getCol() {
        return mCol;
    }

    public void setId(String id) {
        mId = id;
    }

    public void setRow(String row) {
        mRow = row;
    }

    public void setCol(String col) {
        mCol = col;
    }
}
