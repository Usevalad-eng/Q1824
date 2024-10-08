import classTasks.lessonNineZoo.*;
import homeTasks.homeTask11Exceptions.ServiceOfExceptions;
import homeTasks.homeTask11Exceptions.ServiceOfExceptionsWithExit;
import homeTasks.homeTask11ExceptionsV2.InputService;
import homeTasks.homeTask12Vehicle.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
  //------------------------------------------------------------------------------------------------------------------
        //classwork nine Zoo
        /*Animal lion1 = new Lion("Leo", 150, 2);
        Animal lion2 = new Lion("Leo2", 130, 1);
        Animal eleph1 = new Elephant("Eleph", 1500, 20);
        Animal  peng1 = new Penguin("Peng", 13, 10);
        lion1.makeSound();
        lion2.makeSound();
        eleph1.makeSound();
        peng1.makeSound();
        Zoo zoo = new Zoo();
        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(eleph1);
        zoo.addAnimal(peng1);
        zoo.swimIfCan();
        try {
            zoo.removeAnimal(lion2);
        }catch (AnimalNotFound e){
            System.out.println(e);
        }
        System.out.println("Animals:");
        System.out.println(zoo);
        lion1.eat();
        eleph1.eat();
        peng1.eat();
        System.out.println("********************");
        zoo.makeSoundOfAllAnimals();
        zoo.makeFeedAllAnimals();
        System.out.println("Animals:");
        zoo.printAllAnimals();
        System.out.println("********************");
        System.out.println("Animals:");
        zoo.sortedAnimals();*/

  //-----------------------------------------------------------------------------------------------------------------
        //home task 12 Vehicle
        /*Vehicle vehicle1 = new Car(1, "model1", "brand1", 1985, 2000, 5);
        Vehicle vehicle2 = new Bus(2, "model1", "brand1", 1985, 2000, 25);
        Vehicle vehicle3 = new Truck(3, "model1", "brand1", 1985, 2000, 20);
        Driver driver1 = new Driver(1, "Name1", "Lname1", 25, "B category");
        Driver driver2 = new Driver(2, "Name2", "Lname2", 35, "B, C, D category");
        Trip trip1 = new Trip(1, vehicle1, driver1, LocalDate.now(),
                LocalDate.of(2024, 11, 10),250);
        FleetManager fleetManager = new FleetManager();
        fleetManager.addVehicle(vehicle1);
        fleetManager.addVehicle(vehicle2);
        fleetManager.addDriver(driver1);
        fleetManager.addDriver(driver2);
        fleetManager.planTrip(trip1);
        System.out.println("----------------------------------------");
        System.out.println("Available vehicles: ");
        List<Vehicle> vehicleList = fleetManager.getAvailableVehicle();
        for (Vehicle v : vehicleList){
            System.out.println(v);
        }
        System.out.println("----------------------------------------");
        System.out.println("Available drivers: ");
        List<Driver> driverList = fleetManager.getAvailableDriver();
        for (Driver d : driverList){
            System.out.println(d);
        }
        System.out.println("----------------------------------------");
        System.out.println("History of trip of Vehicle with id: " + "\"" + vehicle1.getId() + "\"");
        fleetManager.getHistory(vehicle1);*/
  //-----------------------------------------------------------------------------------------------------------------
        //home task 11 exceptions
        /*InputService inputService = new InputService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words in memory or \"Exit\" to exit");
        while (true){
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")){
                break;
            }
            inputService.processInput(input);
        }
        System.out.println("Program terminated");
        scanner.close();*/

 //-------------------------------------------------------------------------------------------------------------------
        //home task 11 exceptions
        /*ServiceOfExceptions serviceOfExceptions = new ServiceOfExceptions();
        serviceOfExceptions.exceptionAnalyzer();
        System.out.println("______________________________________________");

        ServiceOfExceptionsWithExit serviceOfExceptionsWithExit = new ServiceOfExceptionsWithExit();
        serviceOfExceptionsWithExit.run();*/

  //__________________________________________________________________________________________________________________
        //home task 10a java 8 features
        /*List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.orElse(0));
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println(max.orElse(0));
        System.out.println("----------------------------------------");
        System.out.println(numbers.stream().filter(w->w%2==0).reduce((x,y)->x+y).get());
        System.out.println("----------------------------------------");
        numbers.stream().skip(4).forEach(s-> System.out.print(s + " "));*/
//--------------------------------------------------------------------------------------------------------------
        //home task 10b java 8 features
        /*List<Parent> parents = Arrays.asList(
                new Parent("Parent1", 35, Arrays.asList(
                        new Child("child11",5,true),
                        new Child("child33",14,false))),
                new Parent("Parent2", 52, Arrays.asList(
                        new Child("child1",15,true),
                        new Child("child2",20,false),
                        new Child("child3",24,false),
                        new Child("child4",21,false)))
                );

        System.out.println("++++++++++++++++++++++");
        parents.stream()
                .flatMap(parent -> parent.getChildren().stream())
                .filter(child -> child.getName().contains("2"))
                .forEach(System.out::println);
        System.out.println("++++++++++++++++++++++");
        parents.stream()
                .filter(parent -> parent.getChildren().size()>3)
                .forEach(System.out::println);
        System.out.println("++++++++++++++++++++++");
        parents.stream()
                .flatMap(parent -> parent.getChildren().stream())
                .filter(child -> child.isMan())
                .forEach(System.out::println);
        System.out.println("_______________________");
        parents.stream()
                .flatMap(parent -> parent.getChildren().stream())
                .filter(child -> !child.isMan())
                .forEach(System.out::println);
        System.out.println("++++++++++++++++++++++");
        parents.stream()
                .flatMap(parent -> parent.getChildren().stream())
                .map(child -> child.getName().toUpperCase())
                .forEach(System.out::println);
        System.out.println("++++++++++++++++++++++");
        long count = parents.stream()
                .mapToLong(parent -> parent.getChildren()
                .size())
                .sum();
        System.out.println(count);
        System.out.println("++++++++++++++++++++++");
        Map<String, Integer> collect = parents.stream()
                .flatMap(parent -> parent.getChildren().stream())
                .collect(Collectors.toMap(Child::getName, Child::getAge));
        System.out.println(collect);*/
//------------------------------------------------------------------------------------------------------------------
        //home task 9 music playlistV2
        /*PlayListV2 playListL = new PlayListV2();
        MusicItemV2 song1 = new SongV2("Song one","Artist one", 180, "Rock", 5, "album1");
        MusicItemV2 song2 = new SongV2("Song two","Artist two", 190, "Pop", 4, "album2");
        MusicItemV2 podcast1 = new PodcastV2("Pod one","Artist two", 200, "Pop", 3, "www.h.com");
        playListL.addTrack(song1);
        playListL.addTrack(song2);
        playListL.addTrack(podcast1);
        System.out.println("*****************************************************************************************");
        System.out.println("Searching title: Pod");
        List<AudioTrackV2> podcasts = playListL.searchbyTitle("Pod one");
        for (AudioTrackV2 track : podcasts){
            System.out.println(track.getTitle() + " " + track.getArtist());
        }
        System.out.println("*****************************************************************************************");
        System.out.println("Searching Artist: 'Artist two' ");
        List<AudioTrackV2> podcasts2 = playListL.searchbyArtist("Artist two");
        for (AudioTrackV2 track : podcasts2){
            System.out.println(track.getTitle() + " " + track.getArtist());
        }
        System.out.println("*****************************************************************************************");
        System.out.println("Searching Genre: 'Pop' ");
        List<AudioTrackV2> podcasts3 = playListL.searchbyGenre("Pop");
        for (AudioTrackV2 track : podcasts3){
            System.out.println(track.getTitle() + " " + track.getArtist() + " " + track.getGenre());
        }
        System.out.println("*****************************************************************************************");
        playListL.removeTrack(song2);
        playListL.printPlaylist();
        playListL.getAllDuration();
        playListL.addTrack(song2);
        playListL.sortPlaylist();*/
 //-------------------------------------------------------------------------------------------------------------------
        //home task 9 music playlist
        /*PlayList playList = new PlayList();
        MusicItem song1 = new Song("Song one","Artist one", 180, "Rock", 5, "album1");
        MusicItem song2 = new Song("Song two","Artist two", 190, "Pop", 4, "album2");
        MusicItem podcast1 = new Podcast("Pod one","Artist two", 200, "Pop", 3, "www.h.com");
        playList.addTrack(song1);
        playList.addTrack(song2);
        playList.addTrack(podcast1);
        playList.searchByTitle("Song one");
        playList.searchByArtist("Artist two");
        playList.getTracksByGenre("Pop");
        playList.removeTrack(song2);
        playList.printPlaylist();
        playList.getTotalDuration();
        playList.addTrack(song2);
        playList.sortPlaylist();
        System.out.println("*****************************************************************************************");
        System.out.println("Searching for Pod");
        List<AudioTrack> podcasts = playList.searchByTitleV2("pod");
        for (AudioTrack track : podcasts){
            System.out.println(track.getTitle());
        }
        System.out.println("*****************************************************************************************");
        podcast1.setRating(1);
        playList.sortByRating();
        System.out.println("Playlist sorted by rating");
        playList.printPlaylist();*/
 //-------------------------------------------------------------------------------------------------------------------
        //home task 8 strings
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
        //task6 libraryV2
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
