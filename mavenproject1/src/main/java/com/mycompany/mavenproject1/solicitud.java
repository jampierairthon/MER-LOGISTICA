/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectclass;

/**
 *
 * @author JAMPIER SULCA ALATA
 */
public class solicitud {
    
    private int id_sol;
    private int ruc;
    private String correo;
    private String telefono;
    private int id_paquete;
    private String destino;
    private date fecha;

    public solicitud(int id_solP, int rucP, String correoP, String telefonoP, int id_paqueteP, String destinoP, date fechaP) {
        this.id_sol = id_solP;
        this.ruc = rucP;
        this.correo = correoP;
        this.telefono = telefonoP;
        this.id_paquete = id_paqueteP;
        this.destino = destinoP;
        this.fecha = fechaP;
    }
    
    void printSolicitud() {
         System.out.println("id_solicitud:" +
             id_sol + " Ruc:" + 
             ruc + " fecha de entrega:" + fecha.getAnio()+ "/" +  fecha.getMes()+ "/" + fecha.getDia() );
    }
    
}
