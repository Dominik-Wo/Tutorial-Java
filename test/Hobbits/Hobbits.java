/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hobbits;

/**
 *
 * @author Dominik
 */
public class Hobbits {
    String name;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hobbits[]h=new Hobbits[3];
        int z=-1;
        
        while (z<2){
            z=z+1;
            h[z]=new Hobbits();
            h[z].name="Bilbo";
            
            if (z==1){
                h[z].name="Frodo";
            }
            if (z==2){
                h[z].name="Sam";
            }
            System.out.print(h[z].name+" is a ");
            System.out.println("good Hobbit name");
            
        }

        System.out.println("");//additional space and the end
    }
}
