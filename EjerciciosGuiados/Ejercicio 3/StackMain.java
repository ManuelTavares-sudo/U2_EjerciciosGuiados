/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stacks;

/**
 *
 * @author tavar
 */
public class StackMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackArray<String> nombres = new StackArray<>();
        nombres.push("Luis");
        nombres.push("Adrian");
        nombres.push("Mike");
        
        System.out.println(nombres.pop());
        System.out.println(nombres.pop());
        
    }
    
}
