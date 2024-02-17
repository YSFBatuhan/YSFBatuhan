package Project1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        workers workers=new workers();
        Scanner scanner=new Scanner(System.in);
        workers.name="Ali Beyazıd";
        workers.surname="Sürmene";
        workers.experience=7;
        workers.salary=24750;
        workers.age=32;
        boolean flag=true;

        while (true){
            System.out.println("Enter the number you want to perform. 1--> raise , 2--> info , 3--> reset ,4-->Exit");
            int key=scanner.nextInt();
            switch (key){
                case 1:
                    double zam=0;
                    workers.raise(zam);
                    break;
                case 2:
                    workers.info();
                    break;
                case 3:
                    workers.reset();
                    break;
                case 4:
                    System.out.println("Exiting");
                default:
                    System.out.println("Enter correct number one");
            }


            if (key==4){
                break;
            }
        }

/*
        System.out.println("Enter the number you want to perform. 1--> raise , 2--> info , 3--> reset ,4-->Exit");
        int key=scanner.nextInt();
        switch (key){
            case 1:
                double zam=0;
                workers.raise(zam);
                break;
            case 2:
                workers.info();
                break;
            case 3:
                workers.reset();
                break;
            default:
                System.out.println("Enter correct number one");
        }*/

    }
}
