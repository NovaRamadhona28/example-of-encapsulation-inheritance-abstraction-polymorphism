/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance19;

/**
 *
 * @author Nova Ramadhona
 */
public class Inheritance19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create object from animal1 class
        animal1 name = new animal1();
        //Call showAnimal method with value
        name.showAnimal();
        //Use argument to determine value
        name.showType("Mamals");
        
        animal2 animal = new animal2();
        animal.showAnimal();
        name.showType("Mamals");

    }
    
}
