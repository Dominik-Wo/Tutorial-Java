/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricGuitar;

/**
 *
 * @author Dominik
 */
public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;
    
    String getBrand() {
        return brand;
    }
    
    void setBrand(String aBrand){
        brand=aBrand;
    }
    
    int getNumOfPickups(){
        return numOfPickups;
    }
    
    void setNumOfPickups(int num){
        numOfPickups=num;
    }
    
    boolean getRockStarUsesIt(){
        return rockStarUsesIt;
    }
    
    void setRockStartUsesIt(boolean yesOrNo){
        rockStarUsesIt=yesOrNo;
    }
}
