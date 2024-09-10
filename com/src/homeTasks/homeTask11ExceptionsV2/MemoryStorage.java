package homeTasks.homeTask11ExceptionsV2;

import java.util.LinkedList;

public class MemoryStorage {
    private static final int MAXSIZE = 5;
    private LinkedList<String> storage;

    public MemoryStorage() {
        this.storage = new LinkedList<String>();
    }

    public void add(String item) throws MemoryOverFlowException{
        if (storage.size() >=MAXSIZE){
            throw new MemoryOverFlowException("Memory is full");
        }
        storage.addLast(item);
    }

    public String getSomething() throws EmptyMemoryException{
        if (storage.isEmpty()){
            throw new EmptyMemoryException("Memory is Empty");
        }
        return storage.removeFirst();
    }

}
