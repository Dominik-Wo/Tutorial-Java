/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dog2;

/**
 *
 * @author Dominik
 */
public class Dog2 {
    int size;
    String name;
    
    void bark(int numOfBarks){
        while (numOfBarks>0){
        if (size>60){
            System.out.println(" Wooof! Wooof! ");
            numOfBarks=numOfBarks -1;
        } else if (size>14){
            System.out.println(" Ruff! Ruff! ");
            numOfBarks=numOfBarks -1;
        } else {
            System.out.println(" Yip! Yip! ");
            numOfBarks=numOfBarks -1;
        }
        }
    }
    
    public static void main (String[] args){
        Dog2 one=new Dog2();
        one.size=70;
        Dog2 two=new Dog2();
        two.size=8;
        Dog2 three=new Dog2();
        three.size=35;
        
        one.bark(4);
        two.bark(2);
        three.bark(3);
        
    }
    
}
