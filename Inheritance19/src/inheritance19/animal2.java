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
public class animal2 extends animal{
     //Use method showAnimal from animal class with override annotation
    @Override
    public void showAnimal(){
        System.out.println("Name : Dolphin");
    }
}
