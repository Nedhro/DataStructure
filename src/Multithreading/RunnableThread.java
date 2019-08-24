/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

/**
 *
 * @author nidhro
 */

class MultiThreadDemo implements Runnable {
    
    public void run(){
        try{
            System.out.println("Thread : "+Thread.currentThread().getId()+" is running");
            
        }catch (Exception ex) {
            System.out.println("Exception caught");
        }
    }
    
}

public class RunnableThread {
     public static void main(String[] args) {
        
        int n=8;
        for(int i=0; i<8; i++){
            Thread obj= new Thread(new MultiThreadDemo());
            obj.start();
            
        }
        
    }
    
}
