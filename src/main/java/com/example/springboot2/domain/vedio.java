package com.example.springboot2.domain;

public class vedio {
    private String onekey;
    private String camero;
    private String type;

    public String getOnekey() {
        return onekey;
    }

    public void setOnekey(String onekey) {
        this.onekey = onekey;
    }

    public String getCamero() {
        return camero;
    }

    public void setCamero(String camero) {
        this.camero = camero;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "vedio{" +
                "onekey='" + onekey + '\'' +
                ", camero='" + camero + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
