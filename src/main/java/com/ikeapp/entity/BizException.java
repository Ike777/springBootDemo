package com.ikeapp.entity;

/**
 * created by wei.shen
 * 2018/5/2
 */
public class BizException extends Exception{

    private String mes;

    private String code;

    private BizException(){

    }

    public BizException(String mes,String code){
        this.mes = mes;
        this.code = code;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
