/**
* Practica 
*
*
* @see java.io.*
* @see java.util.*
* 
* @author Anup Jagdish Dialani Dialani
* @mail 
* @date 	 //
*/
package es.ull.etsii.PL.Proyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Cancion {
  
  private ArrayList <Nota> cancion;

  public Cancion() {
    cancion = new ArrayList<Nota> ();
  }
  
  public int codificarNota(String codigo) {
    int cod = 0;
    return cod;
  }
  
  public int codificarSilencio(String silencio) {
    int duracion = 0;
    return duracion;
  }
  
  public static void main(String[] args) {
    Cancion musica = new Cancion();
    String dato = "";
    Nota nota;
    try {
      BufferedReader reader = new BufferedReader(new FileReader(args[0]));
      while (reader.ready())
        dato += reader.readLine();
      reader.close();
    }
    catch (IOException ex) {
      System.out.println ("Error");
    }
    String[] notas = dato.split("[{,\\s}]+");
    nota = new Nota();
    for (int i = 1; i < notas.length;) {
      nota.setCodigo (Integer.parseInt(notas[i]));
      i++;
      nota.setSilencio (Integer.parseInt(notas[i]));
      i++;
      nota.setTonalidad (Integer.parseInt(notas[i]));
      i++;
      musica.cancion.add(nota);
      nota = new Nota();
    }
    for (int i = 0; i < musica.cancion.size (); i++) {
      System.out.print(musica.cancion.get(i).getCodigo() + " ");
      System.out.print(musica.cancion.get(i).getSilencio() + " ");
      System.out.print(musica.cancion.get(i).getTonalidad() + " ");
      System.out.println();
    }
  }
}