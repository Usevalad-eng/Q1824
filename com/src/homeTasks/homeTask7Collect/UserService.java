package homeTasks.homeTask7Collect;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    public Map<String, UserCollection> userCollectionMap = new HashMap<>();

    public void addUser(String sKey, UserCollection user) {
        userCollectionMap.put(sKey, user);
    }

    public void getUserName(String name) {
        for (Map.Entry<String, UserCollection> item : userCollectionMap.entrySet()) {
            if (item.getValue().getName().equals(name)) {
                System.out.printf("Key: %s  Value(Name): %s \n", item.getKey(), item.getValue().getName());
                break;
            } else {
                //System.out.println("Not found");
            }
        }
    }
    public void getAllUsersBySex() {
        System.out.println("Users: ");
        for (Map.Entry<String, UserCollection> item : userCollectionMap.entrySet()) {
            System.out.printf("Key: %s  Name: %S Sex: %s \n",
                    item.getKey(), item.getValue().getName(), item.getValue().getSex());
        }
    }
    public void getAllUsersByAge() {
        System.out.println("Users: ");
        for (Map.Entry<String, UserCollection> item : userCollectionMap.entrySet()) {
                System.out.printf("Key: %s  Name: %S Age: %s \n",
                        item.getKey(), item.getValue().getName(), item.getValue().getAge());
        }
    }

}
