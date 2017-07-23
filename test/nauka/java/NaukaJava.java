/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nauka.java;
/**
 *
 * @author Dominik
 */

public class NaukaJava { 


    public static void main(String[] args) {
        // TODO code application logic here
        int[]index=new int[4];
        index[0]=1;
        index[1]=3;
        index[2]=0;
        index[3]=2;
        String [] island=new String[4];
        island[0]="Bermuda";
        island[1]="Fiji";
        island[2]="Azores";
        island[3]="Cozumel";
        int y=0;
        int ref;
        while(y<4){
            ref=index[y];
            System.out.print("island = ");
            System.out.println(island[ref]);
            y=y+1;
        }

        System.out.println("");//additional space and the end
    } //Main metod end
    
    
    
} //class end
