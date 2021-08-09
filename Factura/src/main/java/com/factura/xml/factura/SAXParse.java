/*Change Log
 * Creation: August, 07 2021
 * 
 * 
 */

/**
 *
 * @author Alvaro Gamez Chavez
 */
package com.factura.xml.factura;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParse {
    static ArrayList comprobante            = new ArrayList();
    static ArrayList emisor                 = new ArrayList();
    static ArrayList receptor               = new ArrayList();
    static ArrayList impuestos              = new ArrayList();
    static ArrayList retenciones            = new ArrayList();
    static ArrayList timbreFiscalDigital    = new ArrayList();
    
    public static void main(String[] args){
        try{
            File archivo = new File("NV139010.XML");
            SAXParserFactory factory = SAXParserFactory.newDefaultInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandlerCopia userhandler = new UserHandlerCopia();
            saxParser.parse(archivo, userhandler);
            
            comprobante = userhandler.getComprobante();
            emisor = userhandler.getEmisor();
            receptor = userhandler.getReceptor();
            impuestos = userhandler.getImpuestos();
            retenciones = userhandler.getRetenciones();
            timbreFiscalDigital = userhandler.GetTimbreFiscalDigital();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Comprobante");
        for(int i =0; i < comprobante.size(); i++){
            System.out.println(comprobante.get(i));
        }
        System.out.println("\nEmisor");
        for(int i = 0; i < emisor.size(); i++){
            System.out .println(emisor.get(i));
        }
        System.out.println("\nReceptor");
        for(int i = 0; i < receptor.size(); i++){
            System.out.println(receptor.get(i));
        }
        System.out.println("\nImpuestos");
        for(int i = 0; i < impuestos.size(); i++){
            System.out.println(impuestos.get(i));
        }
        System.out.println("\nRetenciones");
        for(int i = 0; i < retenciones.size(); i++){
            System.out.println(retenciones.get(i));
        }
        System.out.println("\nTimbre Fiscal Digital");
        for(int i = 0; i < timbreFiscalDigital.size(); i++){
            System.out.println(timbreFiscalDigital.get(i));
        }
    }
}
