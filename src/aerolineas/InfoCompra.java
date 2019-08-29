/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolineas;

/**
 *
 * @author salvagibert
 */
public class InfoCompra extends InfoVuelos {

    public InfoCompra(String text1, String text2, String text3, String text4, String text5, String text6, String text7, String text8) {
        super(text1, text2, text3, text4, text5, text6, text7, text8);
    }
    
    @Override
    public String toString(){
        return "Pasaje: "+ super.toString();
    } 
}
    
