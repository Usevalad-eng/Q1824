import homeTasks.homeTask8Strings.AnalyzerOfText;
import homeTasks.homeTask8Strings.AnalyzerOfTextV2;

public class Main {
    public static void main(String[] args) {

 //-------------------------------------------------------------------------------------------------------------------
        //new task
        /*AnalyzerOfText analyzerOfText = new AnalyzerOfText();
        analyzerOfText.analyzerOfText();*/

        /*AnalyzerOfTextV2 analyzerOfTextV2 = new AnalyzerOfTextV2();
        analyzerOfTextV2.analyzerOfTextRun();*/


//-------------------------------------------------------------------------------------------------------------------
        //class work  Library system
        /*LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.run();*/

 //-------------------------------------------------------------------------------------------------------------------
        //home task 7 collections v2
        /*User user1 = new User("Alice","Female",25);
        User user2 = new User("Bob","Male",25);
        User user3 = new User("Charlie","Male",25);
        User user4 = new User("Diana","Female",25);
        User user5 = new User("Alice","Female",22);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        Set<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);
        UserService userService = new UserService(userList,userSet);
        System.out.println("Users named Alice: " + userService.findUsersByName("Alice"));
        System.out.println("Users Female: " + userService.findUsersByGender("Female"));
        System.out.println("Users sorted by age: " + userService.getSortedUsersByAge());
        System.out.println("__________________________________________________________");
        System.out.println("Users named Alice: " + userService.getUsersByName("Alice"));
        System.out.println("Users Female: " + userService.getUsersByGender("Female"));
        System.out.println("Users sorted by age: " + userService.getSortedUsersSetByAge());
        System.out.println(userList);
        System.out.println(userSet);
        System.out.println("+++++++++++++++++++++++++++");
        List<User> userList1 = new LinkedList<>(userList);
        System.out.println(userList1);*/
        //------------------------------------------------------------------------------------------------------------
        //home task 7 collections
        /*List<UserCollection> userCollections = new ArrayList<>();
        userCollections.add(new UserCollection("Man1",22,"man"));
        userCollections.add(new UserCollection("Man2",23,"man"));
        userCollections.add(new UserCollection("Man3",24,"man"));
        System.out.println(userCollections);
        Set<UserCollection> userCollections1 = new HashSet<>();
        userCollections1.add(new UserCollection("ManMan",32,"man"));
        userCollections1.add(new UserCollection("manMan2",32,"man"));
        userCollections1.add(new UserCollection("ManMan3",32,"man"));
        System.out.println(userCollections1);*/
        /*Map<String,UserCollection> userCollectionMap = new HashMap<>();
        userCollectionMap.put("one", new UserCollection("Tom",55,"man"));
        userCollectionMap.put("two", new UserCollection("John",56,"man"));
        userCollectionMap.put("three", new UserCollection("Ivan",57,"man"));
        System.out.println(userCollectionMap);*/
        /*System.out.println("*****************************************************************************************");
        UserService service = new UserService();
        service.addUser("one",new UserCollection("Vasia",22,"man"));
        service.addUser("two",new UserCollection("Petia",33,"man"));
        service.addUser("three",new UserCollection("Jenifer",20,"woman"));
        service.getUserName("Vasia");
        service.getUserName("Petia");
        System.out.println("****************************************************");
        service.getAllUsersBySex();
        System.out.println("****************************************************");
        service.getAllUsersByAge();*/

//---------------------------------------------------------------------------------------------------------------------
        //class lesson5 sender
        /*Message message = new Message("some message", new User("Vasia"));
        SendService service = new SendService();
        Sender telega = new Telega();
        service.sendMessage(message,telega);
        service.getMassage(message,new Telega());*/
//---------------------------------------------------------------------------------------------------------------------
        //libraryV2
        /*Library library = new Library(10);
        library.addItem(new Book("Book1", "Author1"));
        library.addItem(new Book("Book2", "Author2"));
        library.addItem(new Dvd("DVD1", 100));
        library.addItem(new Dvd("DVD2", 120));
        library.displayAvailableItems();
        System.out.println("-----------------------------------");
        library.borrowItem("Book1");
        library.borrowItem("DVD1");
        library.displayAvailableItems();
        System.out.println("-----------------------------------");
        library.returnItem("Book1");
        library.returnItem("DVD1");
        library.displayAvailableItems();
        System.out.println("-----------------------------------");
        library.borrowItem("Book3");*/


//---------------------------------------------------------------------------------------------------------------------
          //task6 library
          /*OnlineSLibrary onlineSLibrary = new OnlineSLibrary(1000);
          LibraryProduct magazine = new LibraryMagazine("Magazine",10,"33");
          LibraryProduct book = new LibraryBook("Books in XXI century",10,"I.Garcia");
          onlineSLibrary.addProduct(magazine);
          onlineSLibrary.addProduct(book);
          onlineSLibrary.displayAllLibraryProducts();
          LibraryCustomer customer1 = new LibraryCustomer("Ivan Ivanov","ivan@mail.ru");
          LibraryCustomer customer2 = new LibraryCustomer("Alla Ivanova","alla@mail.ru");
          LibraryOrder order1 = new LibraryOrder(customer1,magazine,1);
          LibraryOrder order2 = new LibraryOrder(customer2,book,1);
          System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
          order1.processOrder();
          order2.processOrder();
          onlineSLibrary.displayAllLibraryProducts();
          System.out.println("\n------------------------------------------------------------------");
          order1.processOrderGetBack();  //new
          order2.processOrderGetBack();  //new
          onlineSLibrary.displayAllLibraryProducts();  //new
          System.out.println("********************************************************************");
          LibraryProduct vhs = new LibraryVHS("King-kong",1,100); //new
          onlineSLibrary.addProduct(vhs); //new
          ((Length) vhs).getLength();   //new
          onlineSLibrary.displayAllLibraryProducts();  //new*/
//---------------------------------------------------------------------------------------------------------------------
//      home task5 v2
        /*Employee qa1 = new QaEngineer("Petr","Petrov",1);
        Employee jd1 = new JuniorDev("Sidr","Sidorov",1);
        Employee sd1 = new SeniorDev("Ivan","Ivanov",1);
        qa1.addSkills("can test");
        jd1.addSkills("can code");
        Employee dir = new Director("Tom","Raven",10);
        Project testproj = new Project(" Test Project ");
        Project testproj2 = new Project(" Test Proj Two ");
        ((Director)dir).assignToProject(qa1,testproj);
        ((Director)dir).assignToProject(jd1,testproj);
        ((Director)dir).assignToProject(sd1,testproj);
        ((Director)dir).promote(jd1);
        System.out.println(testproj);
        System.out.println(testproj2);
        System.out.println("********************************");
        System.out.println(qa1);
        System.out.println(jd1);
        System.out.println(sd1);
        System.out.println(dir);
        System.out.println("********************************");    //new
        Employee[] employees = new Employee[]{qa1,jd1,sd1,dir};
        ((Director)dir).getEmployee(employees, qa1, "Petr");
        ((Director)dir).addWorker(qa1);
        ((Director)dir).getEmployee(employees, qa1, "Petr");*/

 //-------------------------------------------------------------------------------------------------------------------
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
 //--------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------
        //class lesson5 sender
//        Message message = new Message("some message", new User("Vasia"));
//        SendService service = new SendService();
//        Sender telega = new Telega();
//        service.sendMessage(message,telega);
//        service.getMassage(message,new Telega());
//-------------------------------------------------------------------------------------------------
        //class lesson5 web elements
        /* Element[] element=new Element[]{new Button(), new CheckBox(), new Label()};

        for (Element el : element) {
            if (el instanceof Click){
                ((Click) el).click();
            }
        }*/
//--------------------------------------------------------------------------------------------------------------------
        //class lesson5 vehicle
        /*Car car = new Car();
        Bike bike = new Bike();
        car.useVehicle(car);
        System.out.println("-----------------------------------");
        bike.useVehicle(bike);*/
//--------------------------------------------------------------------------------------------------------------------
          //classwork collections
//        ArrayList<String> arrayL = new ArrayList<>();
//        arrayL.add("first");
//        arrayL.add("Second");
//        System.out.println(arrayL);
//        arrayL.add(1, "first test");
//        System.out.println(arrayL);
//        System.out.println("--------------------");
//        for (String el : arrayL){
//            System.out.println(el);
//        }
//        System.out.println("--------------------");
//        Iterator<String> iter = arrayL.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }
//        System.out.println("________________________");
//        ArrayDeque<String> arrayD = new ArrayDeque<>();
//        arrayD.add("First");
//        arrayD.add("Second");
//        arrayD.add("Third");
//        while(arrayD.peek()!=null){
//            System.out.println(arrayD.poll());
//        }
//        System.out.println("++++++++");
//        HashSet<String> setL = new HashSet<>();
//        setL.add("first1");
//        setL.add("first2");
//        setL.add("first3");
//        System.out.println(setL);
//        System.out.println(setL.contains("first3"));
//        HashSet<User> setU = new HashSet<>();
//        setU.add(new User("Vasia",22));
//        setU.add(new User("Petia",24));
//        System.out.println(setU);
//        TreeSet<User> setT = new TreeSet<>();
//        setT.add(new User("Tom",55));
//        setT.add(new User("Tom2",56));
//        System.out.println(setT);
//        System.out.println("++++++++");
//        Set<User> setU2 = new TreeSet<>(new UserComparator());
//        setU2.add(new User("Name1",66));
//        setU2.add(new User("Name2",66));
//        System.out.println(setU2);
//        System.out.println("***********************************");
//        Map<String,User> mapU = new HashMap<>();
//        mapU.put("one",new User("Oleg1",22));
//        mapU.put("two",new User("Oleg2",22));
//        mapU.put("three",new User("Oleg2",22));
//        System.out.println(mapU);
//---------------------------------------------------------------------------------------------------------------------
        //class work  to do list
        /*ToDoList toDoList = new ToDoList();
        toDoList.run();*/

//--------------------------------------------------------------------------------------------------------------------
    }
}
