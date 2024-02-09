package OOP1;

public class Employee {
    public String name;
    public double salary;
    public int workhours;
    public int hireyears;

    public double NewBonus=0;




    Employee(String name, double salary, int workhours, int hireyears){
        this.workhours=workhours;
        this.salary=salary;
        this.hireyears=hireyears;
        this.name=name;



    }
    public double tax(){
        if (this.salary>=1000){
            return 1000*0.03;
        }
        return 0.0;
    }
    public double bonus(){

        double NewBonus=30*this.workhours;
        return NewBonus;
    }

    public double raise(){

        if (this.hireyears<=10){
            return (this.salary*0.1+salary);
        } else if (this.hireyears<=20 ||this.hireyears>10) {
            return (this.salary*0.2+salary);
        }
        else{

            return (this.salary*0.3+salary);
        }
    }
    public void ShowInfos(){
        System.out.println("Name : "+name);
        System.out.println("Previous salary : "+salary+ "New salary : ");
        System.out.println("BonusMoney : "+NewBonus);
        System.out.println("Hireyears : "+hireyears);
    }

}
