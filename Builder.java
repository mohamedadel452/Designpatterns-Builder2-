/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exampleonbuilder;

/**
 *
 * @author hp
 */
public class Builder  implements AbstractInterface{
    
    Car car=new Car();

    @Override
    public AbstractInterface setmodel(String model) {
        
        car.setModel(model);
       return this;
    }

    @Override
    public AbstractInterface setyear(int year) {
        car.setYear(year);
        return this;
    }

    @Override
    public AbstractInterface setsalary(int salary) {
        car.setSalary(salary);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
    
    

   
    
}
