/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrucura_de_datos;

/**
 *
 * @author CBR19
 */
public class Arrayt {

    private int[] arreglo;
    private int tamaño;

    public Arrayt() {
    }

    public Arrayt(int tamaño) {
        this.tamaño = tamaño;

    }

    public void init(int tamaño) {
        this.tamaño = tamaño;
        arreglo = new int[tamaño];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 0;
        }

    }

    public void to_string() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ",");
            
        }
        System.out.println("");
    }

    public int getLenght() {
        int x = arreglo.length;
        return x;
        
    }
    public void setItem ( int dato ,int index){
    arreglo[index]=dato;
    
    }
    public void setclear(int entero){
        for (int i = 0; i <arreglo.length; i++) {
           arreglo[i]=5;
            
        }
            }

    public static void main(String[] args) {
        Arrayt arreglo = new Arrayt();
        arreglo.init(5);
        System.out.println(arreglo.getLenght());
        arreglo.to_string();
        arreglo.setclear(5);
         
        arreglo.setItem(3,2);
        arreglo.to_string();
        
        arreglo.setclear(5);
        arreglo.to_string();
        

    }

}

