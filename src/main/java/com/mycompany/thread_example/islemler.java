/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thread_example;

/**
 *
 * @author zafer
 */
public class islemler implements Runnable {
    
    String name;
    
    public islemler(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        
        try {
            
            for (int i = 5; i > 0; i--) {
                System.out.println(this.name + " : " + i);
                Thread.sleep(1000);
            }
            
        } catch (Exception e) {
            System.out.println(this.name + " hata oluştu ");
        }
        System.out.println(this.name + " işlem bitti ");
    }
    
}
