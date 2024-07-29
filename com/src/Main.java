import homeTasks.homeTask1.SeasonTwo;
import homeTasks.homeTask3.*;
import homeTasks.homeTask4.*;

public class Main {
    public static void main(String[] args) {
//        LessonThree summa = new LessonThree();

//        System.out.println(summa.array());
//------------------------------------------------------
        //LessonTwo divide = new LessonTwo();
        //divide.divide();
//------------------------------------------------------
        //Cars car = new Cars();
        //car.cars();
//-------------------------------------------------------
        //homeTask1
        //VowelOrNot letter = new VowelOrNot();
        //letter.vowelOrNot();
//------------------------------------------------------
        //homeTask1
        //Season ses = new Season();
        //ses.season();
//------------------------------------------------------
        //homeTask1
        //ExitProgramm exit = new ExitProgramm();
        //exit.input();
//-----------------------------------------------------
        //homeTask1
        //DivideByThreeApp div = new DivideByThreeApp();
        //div.divByThree();
//-----------------------------------------------------
        //homeTask2.1
        //       FibonachiArray arr = new FibonachiArray();
        //       arr.arrayFibonachi();
        //----------------------------------------------------
        //homeTask2.2
        //       MinMaxElement minMaxElem=new MinMaxElement();
        //       minMaxElem.minMaxElement();
        //----------------------------------------------------
        //homeTask2.3
        //       DifferenceOfElements dif = new DifferenceOfElements();
        //       dif.difference();
        //----------------------------------------------------------------
        //       SeasonTwo season = new SeasonTwo();
        //       season.monthes();
        //----------------------------------------------------------------
        //homeTask3 User & constructor & inner classes
        //       User john = new User("John", "Smith", 33, "man");
        //       john.getNameSurname();
        //       john.getUser();
        //       john.getAge();
        //      john.setAge(34);
        //      john.getUser();
        //      john.setAge(0);
        //     john.setSex("binary");
        //      john.getUser();
        //     User ivan = new User("Ivan","Ivanov");
        //     ivan.getUser();
        //       User Jan = new User("Jan","Toma",80,"man","USA","NY");

        //------------------------------------------------------------------------------------
        //homeTask3 User Enam
        //      USERENAME user1 = USERENAME.JOHN;
        //      user1.getNameSurname();
        //      user1.getUser();
        //____________________________________________________________________
        //homeTask3 season
        //     SeasonEnam ses=new SeasonEnam(SeasonEnam.Type.FEBRUARY);
        //     ses.getType();
        //--------------------------------------------------------------------
        //          //homeTask3 array
        //     ArrOfNumbers arr = new ArrOfNumbers();
        //     arr.getArr();
        //     arr.getsortedArray();
        //     arr.getIndexOfElement();
        //--------------------------------------------------------------------------
        //homeTask3 overloading of methods & depricated
        //    OverloadOfMethods over = new OverloadOfMethods();
        //     System.out.println(over.sum(12, 13));
        //     System.out.println(over.sum(14.5, 14.2));
        //    System.out.println(over.sum(64, 63, 67));
        //    System.out.println(over.summa(5,5));
        //------------------------------------------------------
        //    home task3 two classes to create
        //    ArrayClass ar = new ArrayClass();
        //    homeTasks.homeTask2.ArrayClass ar2 = new homeTasks.homeTask2.ArrayClass();
        //-------------------------------------------------------------------------------
        //home task4
        Person john = new Person("John", "Smith");
        //john.getPerson();
        Person jan = new Person("Jan", "Gold");
        Person janet = new Person("Janet", "Vu");
        Employee worker1 = new Worker(1, PROF.WORKER);
        Employee worker2 = new Worker(4, PROF.WORKER);
        Employee director = new Director(15, PROF.DIRECTOR);
        if (director instanceof Director){
            ((Director)director).addWorker(worker1);
            ((Director)director).addWorker(worker1);
        }
        System.out.println("Worker1: " + john.getPerson() +"  "+ john.get2Person() +" salary$: " + worker1.printSalary());
        System.out.println("Worker2: " + jan.getPerson() +" "+ jan.get2Person()+" salary$: " + worker2.printSalary());
        System.out.println("Director: " + janet.getPerson() +" "+ janet.get2Person()+" salary$: " + director.printSalary());
        Employee secondDirector = new Director(15, PROF.DIRECTOR);
        if (director instanceof Director){
            ((Director)director).addWorker(secondDirector);
        }
        System.out.println(" First director: " + janet.getPerson()+" "+janet.get2Person());
        System.out.println(" Workers under first director: ");
        for (Employee w : ((Director)director).workers) {
            System.out.println("-"+w);
        }
        System.out.println("Information about workers:  "+((Director)director).workers);


//-------------------------------------------------------------------------------------------------------------
    }
}
