/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolineas;

/**
 *
 * @author facu
 */
public class BusquedaVuelos  {

    private String txt1;
    private String txt2;
    private int resu1;
    private int resu2;
    private int resu3;
    private String resu4;

    public BusquedaVuelos() {
    }

    public BusquedaVuelos(String txt1, String txt2, int resu1, int resu2, int resu3, String resu4) {
        this.txt1 = txt1;
        this.txt2 = txt2;
        this.resu1 = resu1;
        this.resu2 = resu2;
        this.resu3 = resu3;
        this.resu4 = resu4;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public int getResu1() {
        return resu1;
    }

    public void setResu1(int resu1) {
        this.resu1 = resu1;
    }

    public int getResu2() {
        return resu2;
    }

    public void setResu2(int resu2) {
        this.resu2 = resu2;
    }

    public int getResu3() {
        return resu3;
    }

    public void setResu3(int resu3) {
        this.resu3 = resu3;
    }

    public String getResu4() {
        return resu4;
    }

    public void setResu4(String resu4) {
        this.resu4 = resu4;
    }
    

}
