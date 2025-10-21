/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stacks;

/**
 *
 * @author tavar
 */
public class StackArray<T> implements IStack<T> {

    private T[] elements;
    private int top;
    
    public StackArray(){
        elements = (T[])new Object[30];
    }

    public StackArray(int size) {
        elements = (T[])new Object[size];
    }
    
    
    
    @Override
    public void push(T element) {
        if (top < elements.length - 1) {
            top++;
            elements[top] = element;
        } else {
            System.out.println("Error: La pila esta llena");
        }
    }

    @Override
    public T pop() {
       if (isEmpty()) {
            System.out.println("Error: La pila está vacía");
            return null;
        }
        T element = elements[top];
        top--;
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Pila Vacía");
        }
            System.out.println("Conociendo el último de la pila");
            return (T) elements[top -1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
    
}
