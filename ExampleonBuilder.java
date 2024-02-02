/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exampleonbuilder;

/**
 *
 * @author hp
 */
public class ExampleonBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car car=new Builder()
                .setmodel("mohamed")
                .setsalary(20000)
                .setyear(2020)
                .build();
        
        System.out.println(car.toString());
        
        
        
    }
    
}
