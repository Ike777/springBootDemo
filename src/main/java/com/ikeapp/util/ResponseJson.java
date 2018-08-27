package com.ikeapp.util;

import java.util.HashMap;

public class ResponseJson  {


    public ResponseJson(){
        this.data=data;
        this.succ=true;
    }
    private Boolean succ;

    public Boolean getSucc() {
        return succ;
    }

    public void setSucc(Boolean succ) {
        this.succ = succ;
    }




    private HashMap<String,Object> data;

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
}
