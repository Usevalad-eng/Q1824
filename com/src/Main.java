import homeTasks.homeTask5v2.*;

import java.util.Arrays;

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
        /*Person john = new Person("John", "Smith");
        Person jan = new Person("Jan", "Gold");
        Person ivan = new Person("Ivan", "Gold");
        Person janet = new Person("Janet", "Vu");
        Person j = new Person("J", "D");
        Employee worker1 = new Worker(1, PROF.WORKER);
        Employee worker2 = new Worker(4, PROF.WORKER);
        Employee worker3 = new Worker(2, PROF.WORKER);
        Employee director = new Director(15, PROF.DIRECTOR);
        if (director instanceof Director){
            ((Director)director).addWorker(worker1);
            ((Director)director).addWorker(worker2);
        }
        System.out.println("Worker1: " + john.getPerson() +"  "+ john.get2Person() +" salary$: " + worker1.printSalary());
        System.out.println("Worker2: " + jan.getPerson() +" "+ jan.get2Person()+" salary$: " + worker2.printSalary());
        System.out.println("Worker3: " + ivan.getPerson() +" "+ ivan.get2Person()+" salary$: " + worker3.printSalary());
        System.out.println("Director: " + janet.getPerson() +" "+ janet.get2Person()+" salary$: " + director.printSalary());
        Employee secondDirector = new Director(15, PROF.DIRECTOR);
        if (director instanceof Director){
            ((Director)director).addWorker(secondDirector);
        }
        ((Director)secondDirector).addWorkerForSecondDir(worker3);
        System.out.println(" First director: " + janet.getPerson()+" "+janet.get2Person());
        System.out.println(" Workers under first director: ");
        for (Employee w : ((Director)director).workers) {
            System.out.println("-"+ w);
        }
        System.out.println("Information about workers:  "+((Director)director).workers);
        System.out.println("Worker1: " + john.getPerson() +"  "+ john.get2Person() +" salary$: " + worker1.printSalary());
        System.out.println("Worker2: " + jan.getPerson() +" "+ jan.get2Person()+" salary$: " + worker2.printSalary());
        System.out.println("Employee3: Second Director: " + j.getPerson() +" "+ j.get2Person()+" salary$: "
                + ((Director) secondDirector).printSalarySecDir());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Second Director: " + j.getPerson() +" "+ j.get2Person()+" salary$: "
                + ((Director) secondDirector).printSalarySecDir());
        System.out.println(" Workers under second director: ");
        for (Employee w : ((Director)secondDirector).workers2) {
            System.out.println("-"+ w);
        }
        System.out.println("Worker: " + ivan.getPerson() +" "+ ivan.get2Person()+" salary$: " + worker3.printSalary());*/
//-------------------------------------------------------------------------------------------------------------
        //home task4 using arrays
        /*Employe worker1 = new Worke("w1","ws1",1);
        Employe worker2 = new Worke("w2","ws2",2);
        Employe worker3 = new Worke("w3","ws3",3);
        Employe director1 = new Direktor("d1","ds1",1);
        Employe director2 = new Direktor("d2","ds2",2);
        ((Direktor)director1).addWorker(worker1);
        ((Direktor)director1).addWorker(worker2);
        ((Direktor)director1).addWorker(worker3);
        ((Direktor)director2).addWorker(director1);
        System.out.println(director2);
        System.out.println(director2.getSalary());
        System.out.println(director1);
        System.out.println(director1.getSalary());
        System.out.println(worker1);
        System.out.println(worker1.getSalary());
        System.out.println(worker2);
        System.out.println(worker2.getSalary());
        System.out.println(worker3);
        System.out.println(worker3.getSalary());
        System.out.println(director2 + " " + "has workers: " + "\n" + director1 + ";");
        System.out.println(director1 + " " + "has workers: " + "\n" +  worker1 + "\n"
                +  worker2 + "\n" + worker3 + ";");*/
//-----------------------------------------------------------------------------------------------------------------
       //home task 5
        /*Employee qa1 = new Qa("QA1", "SQA1", 22);
        Employee jd1 = new Juniordev("JD1", "SJD1", 25);
        Employee sd1 = new Seniordev("SD1", "SSD1", 32);
        Employee tl1 = new Teamlead("TL1", "STL1", 36);
        Employee dir1 = new Director("D1", "SD1", 42);
        qa1.addSkill("Can test");
        Person[] s = new Person[]{qa1,dir1};
        Project proj1 = new Project("Project1",2, s);
        jd1.getPromoted();
        System.out.println("-------------------");
        System.out.println(jd1);
        System.out.println(qa1);
        System.out.println(jd1);
        System.out.println(sd1);
        System.out.println(tl1);
        System.out.println(dir1);
        System.out.println(proj1);
        System.out.println("All salary" + ((Director)dir1).getAllSalary(5) + "$");*/
        //---------------------------------------------------------------------------
        //classwork 4 shop
//        OnlineStore onlineStore = new OnlineStore(1000);
//        Product laptop = new Ecectronics("Notebook",1000,10,"Dell","D");
//        Product novel = new Book("Novel",22.2,10,"Cheiz",400);
//        onlineStore.addProduct(laptop);
//        onlineStore.addProduct(novel);
//        onlineStore.displayAllProducts();
//        Customer customer1 = new Customer("Ivan Ivanov","ivan@mail.ru");
//        Customer customer2 = new Customer("Alla Ivanova","alla@mail.ru");
//        Order order1 = new Order(customer1,laptop,2);
//        Order order2 = new Order(customer2,novel,1);
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        order1.processOrder();
//        order2.processOrder();
//        onlineStore.displayAllProducts();
        //--------------------------------------------------------------------------------------------------
            //home task5 v2
//        Employee qa1 = new QaEngineer("Ivan","Petrov",1);
//        Employee jd1 = new JuniorDev("Ivan","Sidorov",1);
//        Employee sd1 = new SeniorDev("Ivan","Ivanov",1);
//        qa1.addSkills("can test");
//        jd1.addSkills("can code");
//        Employee dir = new Director("Tom","Raven",10);
//        Project testproj = new Project("Test Project");
//        Project testproj2 = new Project("Test Proj Two");
//        ((Director)dir).assignToProject(qa1,testproj);
//        ((Director)dir).assignToProject(jd1,testproj);
//        ((Director)dir).assignToProject(sd1,testproj);
//        ((Director)dir).promote(jd1);
//        System.out.println(testproj);
//        System.out.println(testproj2);
//        System.out.println(qa1);
//        System.out.println(jd1);
//        System.out.println(sd1);
//        System.out.println(dir);

 //--------------------------------------------------------------------------------------------------------------------
          //task6 library

    }
}
