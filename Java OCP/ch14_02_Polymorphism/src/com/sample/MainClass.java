/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

/**
 *
 * @author student
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager managerA = new Manager("行銷", 1, "Amy", "123-456-7890", 50000);
        System.out.printf("managerA：[%s, %d, %s, %s, %.2f]%n", managerA.getDeptName(), managerA.getEmpId(), managerA.getName(), managerA.getSsn(), managerA.getSalary());
        System.out.println("managerA.test：" + managerA.test);
        managerA.showTest();
        
        System.out.println("------------");
        Employee employeeB = managerA;
        System.out.printf("employeeB：[%d, %s, %s, %.2f]%n", employeeB.getEmpId(), employeeB.getName(), employeeB.getSsn(), employeeB.getSalary());
        System.out.println("employeeB.test：" + employeeB.test);
        employeeB.showTest();
        
        System.out.println("------------");        
        Manager managerC = (Manager)employeeB;
        System.out.printf("managerC：[%s, %d, %s, %s, %.2f]%n", managerC.getDeptName(), managerC.getEmpId(), managerC.getName(), managerC.getSsn(), managerC.getSalary());
        
        System.out.println("------------");     
        
        //Director directorD = (Director)managerC; //java.lang.ClassCastException
        //directorD.getBudget();
        
        //Engineer engineerE = managerC;            //編譯失敗
        //Engineer engineerE = (Engineer)managerC;  //編譯失敗
        
        //Engineer engineerE = (Engineer)employeeB;   //java.lang.ClassCastException
        
        //--------------------------------------------
        
        Employee employee = new Employee(2,"Tom","234-56-7891",36000);
        Manager manager = new Manager("行銷",1,"Amy","123-45-6789",50000);
        Director director = new Director(100000,"企劃",3,"Jackie","345-67-8912",42000);
        Engineer engineer = new Engineer(4,"小明","45-678-9123",46000);
        info(employee);
        info(manager);
        info(engineer);
        info(director);
        System.out.println("------------");
        
        Employee employee1 = new Employee(2,"Tom","234-56-7891",36000);
        Employee manager2 = new Manager("行銷",1,"Amy","123-45-6789",50000);
        Employee director3 = new Director(100000,"企劃",3,"Jackie","345-67-8912",42000);
        Employee engineer4 = new Engineer(4,"小明","45-678-9123",46000);
        
        Employee[] employees = new Employee[4];
        employees[0] = new Employee(2,"Tom","234-56-7891",36000);
        employees[1] = new Manager("行銷",1,"Amy","123-45-6789",50000);
        employees[2] = new Director(100000,"企劃",3,"Jackie","345-67-8912",42000);
        employees[3] = new Engineer(4,"小明","45-678-9123",46000);
        for(Employee e : employees){
            info(e);
        }
        System.out.println("------------");
        
        Employee e = new Director(100000,"企劃",3,"Jackie","345-67-8912",42000);
        if(e instanceof Manager){
            Manager m = (Manager)e;
            System.out.println("e to Manager -> true");
        }else{
            System.out.println("e to Manager -> false");
        }
        
        if(e instanceof Engineer){
            Engineer en = (Engineer)e;
            System.out.println("e to Engineer -> true");
        }else{
            System.out.println("e to Engineer -> false");
        }
    }
    
    private static void info(Employee e){
        System.out.printf("%d\t%s\t%.2f%n", e.getEmpId(), e.getName(), e.getSalary());
    }
    
}
