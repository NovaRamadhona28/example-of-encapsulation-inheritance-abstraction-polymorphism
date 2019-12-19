/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation19;

/**
 *
 * @author Nova Ramadhona
 */
public class Main {
      /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        Output en = new Output();
        
        //Setting value
        en.setName("Nova Ramadhona");
        en.setAge(17);
        en.setHobby("Read Novel");
        
        //Take attribute values
        System.out.println("Name  : "+en.getName());
        System.out.println("Age   : "+en.getAge());
        System.out.println("Hobby : "+en.getHobby());
    } 
}