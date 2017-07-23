/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Books;

/**
 *
 * @author Dominik
 */
public class Books {
    String title;
    String author;
    
    //class Book{
    //String title;
    //String author;
    //}
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Books[]myBooks=new Books[3];
        int x=0;
        myBooks[0]=new Books();
        myBooks[1]=new Books();
        myBooks[2]=new Books();
        myBooks[0].title="The Grapes of Java";
        myBooks[1].title="The Java Gatsby";
        myBooks[2].title="The Java Cookbook";
        myBooks[0].author="Bob";
        myBooks[1].author="Sue";
        myBooks[2].author="Ian";
        
        while (x<3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x=x+1;
        }

        System.out.println("");//additional space and the end
    }
}  

