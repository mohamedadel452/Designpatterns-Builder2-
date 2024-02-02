/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exampleonbuilder;

/**
 *
 * @author hp
 */
public class Car {
    
    private  String  model;
    private  int  year ;
    private  int salary ;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", year=" + year + ", salary=" + salary + '}';
    }
    
    
    
    
    
    
}
