/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prypilas1;

import java.util.Stack;

/**
 *
 * @author laboratorio
 */
public class MeStack {
    private Stack pila;
    
    public MeStack(){
     pila=new Stack();
    }
    
    public boolean esVacia(){
     return pila.empty();
    }
    
    public void push(int dato){
      pila.push(dato);
    }
    
    public int pop(){
      return (int)pila.pop();
    }
    
    public int top(){
      return (int)pila.peek();
    }

    @Override
    public String toString() {
        String resultado="";
        while(!esVacia()){
           resultado+=pop();
        }
        return resultado; 
    }
    
}
