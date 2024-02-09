package OOP1;

public class Main {
    public static void main(String[] args){
        Employee liste=new Employee("Batuhan",35000,8,14);

        System.out.println("Name : "+liste.name);
        System.out.println("Previous salary : "+liste.salary+ " New salary : "+liste.raise());
        System.out.println("BonusMoney : "+liste.bonus());
        System.out.println("Hireyears : "+liste.hireyears);
        System.out.println("Tax : %"+liste.tax());




    }
}
