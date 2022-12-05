/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class AdministraProveedor extends Admin{
    public ArrayList<Proveedor> listaCliente;
    public String telefono
    
    //metodo
    public AdministraProveedor(String nombre, String direccion, String telefono){
        super(nombre, direccion);
        this.telefono = telefono;
    }
}
