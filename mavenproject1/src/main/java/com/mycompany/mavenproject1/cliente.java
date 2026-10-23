/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectclass;

/**
 *
 * @author JAMPIER SULCA ALATA
 */
public class cliente extends personas{
    private int id;
    private int ruc;
    private String direccion;
    private String razon_social;

    public cliente(int id, int ruc, String direccion, String razon_social, String nombre, String correo, String telefono) {
        super(nombre, correo, telefono);
        this.id = id;
        this.ruc = ruc;
        this.direccion = direccion;
        this.razon_social = razon_social;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }
    
    
    void printCliente() {
         System.out.println( "id cliente:"+ id +
                             "ruc cliente:"+ ruc +
                             "direccion: " + direccion +
                             "razon social" + razon_social+  
                             "nombre:"+ nombre +
                             "correo:"+ correo +
                             "telefono:" + telefono);
    }
}
