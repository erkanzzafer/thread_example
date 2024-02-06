/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.thread_example;

public class Thread_example {

    public static void main(String[] args) {

            islemler i1 = new islemler("ilk");
            islemler i2 = new islemler("ikinci");
            
           // i1.run();
           // i2.run();
           
           Thread t1=new Thread(i1);
           Thread t2=new Thread(i2);
        
           t1.start();
           t2.start();
           
    }
}
