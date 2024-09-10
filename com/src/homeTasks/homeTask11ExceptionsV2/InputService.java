package homeTasks.homeTask11ExceptionsV2;

public class InputService {
    private MemoryStorage memoryStorage;

    public InputService() {
        this.memoryStorage = new MemoryStorage();
    }

    public void processInput(String input){
        if (input.equalsIgnoreCase("get")){
            try {
                String item = memoryStorage.getSomething();
                System.out.println(item);
            }catch (EmptyMemoryException e){
                System.out.println("Error" + e.getMessage());
            }
        }else {
            try {
                memoryStorage.add(input);
                System.out.println("Item added");
            }catch (MemoryOverFlowException e){
                System.out.println("Error" + e.getMessage());
            }
        }
    }
}
