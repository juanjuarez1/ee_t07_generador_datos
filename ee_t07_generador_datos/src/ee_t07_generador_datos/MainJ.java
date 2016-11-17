/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t07_generador_datos;

/**
 *
 * @author Juan Antonio Juarez Olivera
 */
import javax.swing.JOptionPane;
public class MainJ
{
    
     public static void main(String[] args) {
   Generadordatos prueba= new Generadordatos();
   prueba.Generadornombres("nombres.txt");
   prueba.Generadorapellidos("apellidos.txt");
   int numero=Integer.parseInt(JOptionPane.showInputDialog("¿Que cantidad deseas generar?"));
    for(int i=0;i<numero;i++){
     prueba.generardorarchivo();
    }
    prueba.guardaArchivo();
    JOptionPane.showMessageDialog(null,"Archivo generado y  guardado como Datos Guardados");
    JOptionPane.showMessageDialog(null,"Hecho Por Juan Antonio Juarez Olivera");
   }
}

