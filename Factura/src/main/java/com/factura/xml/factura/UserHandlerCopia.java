/*Change Log
 * Creation: August, 07 2021
 * 
 * 
 */

/**
 *
 * @author ALvaro Gamez Chavez
 */
package com.factura.xml.factura;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandlerCopia extends DefaultHandler{
        private ArrayList comprobante = new ArrayList();
        private ArrayList emisor = new ArrayList();
        private ArrayList receptor = new ArrayList();
        private ArrayList impuestos = new ArrayList();
        private ArrayList retenciones = new ArrayList();
        private ArrayList timbreFiscalDigital = new ArrayList();
        
    public void startElement(String uri, String localName, String qName, Attributes attr)throws SAXException{
        String valor = null;
        
        if(qName.equalsIgnoreCase("cfdi:Comprobante")){
            //System.out.println("cfdi:Comprobante");
            for(int i = 0; i < attr.getLength(); i++){
                /*valor = attr.getQName(i);
                System.out.println(i+" "+valor+":"+attr.getValue(i));*/
                setComprobante(attr.getQName(i)+":"+attr.getValue(i));
            }
            System.out.println("\n");
            //valor = null;
        }
        
        if(qName.equalsIgnoreCase("cfdi:Emisor")){
            //System.out.println("cfdi:emisor");
            for(int i = 0; i < attr.getLength(); i++){
                /*valor = attr.getQName(i);
                System.out.println(i+" "+valor+":"+attr.getValue(i));*/
                setEmisor(attr.getQName(i)+":"+attr.getValue(i));
            }
            /*System.out.println("\n");
            valor = null;*/
        }
        
        if(qName.equalsIgnoreCase("cfdi:Receptor")){
            //System.out.println("cfdi:Receptor");
            for(int i = 0; i < attr.getLength(); i++){
                /*valor = attr.getQName(i);
                System.out.println(i+" "+valor+":"+attr.getValue(i));*/
                setReceptor(attr.getQName(i)+":"+attr.getValue(i));
            }
           // System.out.println("\n");
            valor = null;
        }
        
        if(qName.equalsIgnoreCase("cfdi:Concepto")){
            //System.out.println("cfdi:Concepto");
            for(int i = 0; i < attr.getLength(); i++){
                //valor = attr.getQName(i);
                //System.out.println(i+" "+valor+":"+attr.getValue(i));
                setImpuestos(attr.getQName(i)+":"+attr.getValue(i));
            }
            //System.out.println("\n");
            valor = null;
        }
        /*impuestos inicio*/
         if(qName.equalsIgnoreCase("cfdi:Traslado")){
            //System.out.println("cfdi:Traslado");
            for(int i = 0; i < attr.getLength(); i++){
                //valor = attr.getQName(i);
                //System.out.println(i+" "+valor+":"+attr.getValue(i));
                setRetenciones(attr.getQName(i)+":"+attr.getValue(i));
            }
           // System.out.println("\n");
            valor = null;
        }
         
         if(qName.equalsIgnoreCase("cfdi:Impuestos")){
             //System.out.println("cfdi:Impuestos");
             for(int i = 0; i < attr.getLength(); i++){
                // valor = attr.getValue(i);
                // System.out.println(i+""+valor+":"+attr.getValue(i));
             }
            // System.out.println("\n");
            // valor = null;
         }
        /*impuestos fin*/
        if(qName.equalsIgnoreCase("tfd:TimbreFiscalDigital")){
            //System.out.println("tfd:TimbreFiscalDigital");
            for(int i = 0; i < attr.getLength(); i++){
                /*valor = attr.getQName(i);
                System.out.println(i+" "+valor+":"+attr.getValue(i));*/
                setTimbreFiscalDigital(attr.getQName(i)+":"+attr.getValue(i));
            }
            /*System.out.println("\n");
            valor = null;*/
        }
    }
    
    public void setComprobante(String Valor){
        comprobante.add(Valor);
    }
    
    public void setEmisor(String Valor){
        emisor.add(Valor);
    }
    
    public void setReceptor(String Valor){
        receptor.add(Valor);
    }
    
    public void setImpuestos(String Valor){
        impuestos.add(Valor);
    }
    
    public void setRetenciones(String Valor){
        retenciones.add(Valor);
    }
    
    public void setTimbreFiscalDigital(String Valor){
        timbreFiscalDigital.add(Valor);
    }
    
    
    public ArrayList getComprobante(){
        return comprobante;
    }
    
    public ArrayList getEmisor(){
        return emisor;
    }
    
    public ArrayList getReceptor(){
        return receptor;
    }
    
    public ArrayList getImpuestos(){
        return impuestos;
    }
    
    public ArrayList getRetenciones(){
        return retenciones;
    }
    
    public ArrayList GetTimbreFiscalDigital(){
        return timbreFiscalDigital;
    }
}