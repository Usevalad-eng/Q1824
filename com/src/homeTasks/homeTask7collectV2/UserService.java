package homeTasks.homeTask7collectV2;

import java.util.*;

public class UserService {

    private List<User> userList;
    private Set<User> userSet;

    public UserService(List<User> userList, Set<User> userSet) {
        this.userList = userList;
        this.userSet = userSet;
    }
    public List<User> findUsersByName(String name){
        List<User> result = new ArrayList<>();
        for (User user : userList){
             if (user.getName().equalsIgnoreCase(name)){
                result.add(user);
             }

        } return result;
    }

    public List<User> findUsersByGender(String gender){
        List<User> result = new ArrayList<>();
        for (User user : userList){
            if (user.getGender().equalsIgnoreCase(gender)){
                result.add(user);
            }

        } return result;
    }

    public List<User> getSortedUsersByAge(){
        List<User> sortedList = new ArrayList<>(userList);
        Collections.sort(sortedList);
        return sortedList;
    }

    public Set<User> getUsersByName(String name){
        Set<User> result = new HashSet<>();
        for (User user : userList){
            if (user.getName().equalsIgnoreCase(name)){
                result.add(user);
            }

        } return result;
    }

    public Set<User> getUsersByGender(String gender){
        Set<User> result = new HashSet<>();
        for (User user : userList){
            if (user.getGender().equalsIgnoreCase(gender)){
                result.add(user);
            }

        } return result;
    }

    public Set<User> getSortedUsersSetByAge(){
        return new TreeSet<>(userSet);
    }

}
