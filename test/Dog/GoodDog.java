/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dog;

/**
 *
 * @author Dominik
 */
public class GoodDog {
    private int size;
    
    public int getSize(){
        return size;
    }
    
    public void setSize(int s){
        size=s;
    }
    void bark(){
        if (size>60){
            System.out.println("Wooof! Wooof!");
        }else if (size>14){
            System.out.println("Ruff! Ruff!");
        }else {
            System.out.println("Yip! Yip");
        }
    }
    
    public static void main(String[] args){
       GoodDog one=new GoodDog();
       one.setSize(70);
       GoodDog two=new GoodDog();
       two.setSize(8);
       GoodDog three=new GoodDog();
       three.setSize(20);
       System.out.println("Dog One: "+one.getSize());
       System.out.println("Dog two: "+two.getSize());
       System.out.println("Dog three: "+three.getSize());
       one.bark();
       two.bark();
       three.bark();
    }
}
