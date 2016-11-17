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
 import java.io.File;
import java.io.FileWriter;
import com.csvreader.CsvWriter;
import java.util.*;
import java.io.*;
public class Generadordatos {
    static ArrayList<String> nombres= new ArrayList<String>();
    static ArrayList<String> apellidos= new ArrayList<String>();
    static ArrayList<Datos>p= new ArrayList<Datos>();
    
    //Metodo para crear los nombres
   public void Generadornombres(String archivo){
       
     try{
       FileReader fr= new FileReader(archivo);
       BufferedReader bw= new BufferedReader(fr);
       String linea;
       while((linea=bw.readLine())!=null){
        nombres.add(linea);
       }
     }
     catch(Exception e){
       System.out.println("Marco de error");
     }
   }
  
   //Metodo para generar apellidos
 public void Generadorapellidos(String archivo){
   try{
       FileReader fr= new FileReader(archivo);
       BufferedReader bw= new BufferedReader(fr);
       String linea;
       while((linea=bw.readLine())!=null){
        apellidos.add(linea);
       }
     }
     catch(Exception e){
       System.out.println("Marco de error");
     }
   }
   public void generardorarchivo(){
     int nom=(int)(Math.random()*199+1);
     int ap=(int)(Math.random()*85+1);
     String nombre=nombres.get(nom);
     String apellido=apellidos.get(ap);
     
     //paso para generar los numeros de telefonos
     int a,b,c;
      a=(int)(Math.random()*999+1);
      b=(int)(Math.random()*999+1);
      c=(int)(Math.random()*99+1);
      String telefono;
      telefono=Integer.toString(a)+"-"+Integer.toString(b)+"-"+Integer.toString(c);
      
      //Paso para crear las edades
      int edad=(int)(Math.random()*80+12);
      
      String dominio[]={"@hotmail.com","@gmail.com","@outlook.com"};
      String td1=nombre;
      String td2=apellido;
      String [] d1=td1.split("");
      String [] d2=td2.split("");
      int d3=2016-edad;
      String d4=Integer.toString(d3);
       int dom=(int)(Math.random()*3+0);
      String domin=dominio[dom];
      String correoelectronico=d1[0]+d1[1]+d1[2]+"_"+d2[0]+d2[1]+"-"+d4+domin;
      Datos p1= new Datos(nombre,apellido,edad,telefono,correoelectronico);
      p.add(p1);
      System.out.println("Nombre: "+nombre+" "+apellido+"      Edad:"+edad+" años"+"      Telefono:"+telefono+"     Correo:"+correoelectronico);
       
  
}
   //Metodo para guardar archivo en .csv
 public void guardaArchivo(){
    String outputFile="DatosGenerados.csv";
     boolean alreadyExists= new File(outputFile).exists();
     if(alreadyExists){
      File Archivos= new File(outputFile);
      Archivos.delete();
     }
      try{
          CsvWriter csvOutput =new CsvWriter(new FileWriter(outputFile,true),',');
          csvOutput.write("Nombre");
          csvOutput.write("Apellido");
          csvOutput.write("Edad");
          csvOutput.write("Correo");
          csvOutput.endRecord();
          for(Datos edadp:p){
             csvOutput.write(edadp.getNombre());
             csvOutput.write(edadp.getApellido());
             csvOutput.write(Integer.toString(edadp.getEdad()));
             csvOutput.write(edadp.getCorreo());
             csvOutput.endRecord();
          }
        csvOutput.close();          
      }
      catch(Exception e){
       System.out.println("Error al guardar");
      }
   }
}

