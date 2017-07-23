/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nauka.java.beer;
/**
 *
 * @author Dominik
 */
public class Beersong {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int beerNum=10;
        String word="bottles";
        
        while (beerNum>0){
            if (beerNum==1){
                word="bottle"; //one bottle.
            }
        
        System.out.print(beerNum + " " + word + " of beer on the wall, ");
        System.out.println(beerNum + " " + word + " of beer.");
        System.out.print("Take one down");
        System.out.print(" and pass it around, ");
        beerNum=beerNum - 1;
        
        if (beerNum>0){
            System.out.println(beerNum + " " + word + " of beer on the wall.");
            System.out.println("");
        } else{
            System.out.println("no more bottles of beer on the wall");
            System.out.println("");
            System.out.print("No more bottles of beer on the wall, ");
            System.out.println("No more bottles of beer.");
            System.out.print("Go to the store and buy some more, ");
            System.out.println("99 bottles of beer on the wall.");
            System.out.println("");
        } //else end
        } //While loop end
        
    } //Main metod end
    
} //class end
