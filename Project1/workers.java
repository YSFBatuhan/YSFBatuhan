package Project1;
import java.util.Scanner;

public class workers {
    Scanner sc=new Scanner(System.in);
    String name;
    String surname;
    int age;
    int experience;
    int salary;
    String administor="YSFBatuhan";
    String password="123456";



    public workers(){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.experience=experience;
        this.salary=salary;

    }
    public void raise(double zam){
        System.out.println("Enter  raise rate : ");
        zam=sc.nextInt();
        double newsalary=salary+salary*zam/100;
        System.out.println("Previous salary : "+salary);
        System.out.println("New salary : "+newsalary);
    }
    public void info(){
        System.out.println("-----------------INFO OF WORKER-----------------");
        System.out.println("NAME / SURNAME : "+name+" "+surname);
        System.out.println("Age : "+age);
        System.out.println("Experience : "+experience);
        System.out.println("Salary : "+salary);
    }

    public void reset(){
        boolean k=true;
        while (k){
            System.out.println("Entry your UserName : ");
            String asd=sc.next();
            System.out.println("Entry your password : ");
            String sdf=sc.next();

            if (asd.equals(administor)&&sdf.equals(password)){
                System.out.println("Enterance is successfully :)");
                System.out.println("System are reseting.");
                break;

            }
        }



    }
}
