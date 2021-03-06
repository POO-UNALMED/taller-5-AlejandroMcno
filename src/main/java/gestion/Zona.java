package gestion;
import zooAnimales.*;

import java.util.ArrayList;

public class Zona {

    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales=new ArrayList<Animal>();

    public Zona(){

    }
    public Zona(String nombre,Zoologico zoo){
        this.nombre=nombre;
        this.zoo=zoo;
    }

    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }
    public int cantidadAnimales(){
        return animales.size();
    }

    public String getNombre(){
        return nombre;
    }
    public Zoologico getZoo(){
        return zoo;
    }
    public ArrayList getAnimales(){
        return animales;
    }
}