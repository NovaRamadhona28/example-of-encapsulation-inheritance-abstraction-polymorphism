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
public class Output {

    /**
     * @param args the command line arguments
     */
    private String name,hobby;
    private int age ;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    //Create etter, call in main class, output.java
    public String getName(){
        return name;
    }
    
    //Create getter, call in main class, output.java
    public int getAge(){
        return age;
    }
    
    //Create etter, call in main class, output.java
    public String getHobby(){
        return hobby;
    }
    
    //Create setter wich will setting value in main class, output.java by using object
    public void setName(String Name){
        name = Name;
    }
    
    //Create setter wich will setting value in main class, output.java by using object
    public void setAge(int Age){
        age = Age;
    }
    
    //Create setter wich will setting value in main class, output.java by using object
    public void setHobby(String Hobby){
        hobby = Hobby;
    }
}
        
        
    
   
    

