/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism19;

/**
 *
 * @author Nova Ramadhona
 */
class OutpuList extends animal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create object from animals class
        animals nl = new animals();
        //Create object from animal1 class
        animals animal1 = new animal1();
        //Create object from animals2 class
        animals animal2 = new animal2();
        //Create object from animals3 class
        animals animal3 = new animal3();
        
        //Call name method
        nl.animals();
        //Call name method from animal1 class
        animal1.animals();
        //Call name method from animal2 class
        animal2.animals();
        //Call name method from animal3 class
        animal3.animals();
    }
    
}
