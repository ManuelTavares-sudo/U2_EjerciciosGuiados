/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colas;

/**
 *
 * @author tavar
 */
public class Cola <T>{
    private Nodo<T> cabeza; //Puntero al frente (por donde se quita)
    private Nodo<T> cola;   //Puntero al final (por donde se inserta)
    private int tamano;     //Para llevar la cuenta del tamaño
    
    public Cola(){
        this.cabeza = null; //Inicializa una cola vacia
        this.cola = null;
        this.tamano = 0;
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo<T> getCola() {
        return cola;
    }

    public void setCola(Nodo<T> cola) {
        this.cola = cola;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    public boolean colaVacia(){
        return cabeza == null;
    }
    
    public void insertar(T elemento){
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        
        if(colaVacia()){ //Caso 1: La cola esta vacia
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }else{ //Caso 2: La cola No esta vacia
            //El nodo actual que era el el 'final' ahora apunta al nuevo nodo
            this.cola.setSiguiente(nuevoNodo);
            //EEl puntero 'cola' (final) se mueve al nuevo nodo
            this.cola = nuevoNodo;
        }
        tamano++; //Incrementar tamaño
        System.out.println("-> Insertado: "+elemento);
    }
    
    public T quitar(){
        if(colaVacia()){
            System.out.println("Error: La cola esta vacia.");
        }
        
        T datoQuitado = this.cabeza.getDato(); //Guardamos el dato a devolver
        
        this.cabeza = this.cabeza.getSiguiente(); //Cabeza siguiente nodo
        
        if(this.cabeza == null){//Actualiza no hay elementos
            this.cola = null;
        }
        tamano--;
        return datoQuitado;
    }
    
    /*
    *Operacion: Frennte (Peek)
    *Devuelve el elemento del FRENTE sin retirarlo
    */
    public T frente(){
        if(colaVacia()){
            System.out.println("Error: La cola esta vacia");
        }
        return this.cabeza.getDato();
    }
    
    public void mostrarCola() {
        if (colaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }

        Nodo<T> actual = cabeza;
        System.out.println("Estado actual de la cola:");
        while (actual != null) {
            System.out.println(" - " + actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
