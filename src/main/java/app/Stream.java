package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {

        List<User> userArrayList = new ArrayList<>();

        userArrayList.add(new User(1, "emre"));
        userArrayList.add(new User(2, "sema"));
        userArrayList.add(new User(3, "ekrem"));
        userArrayList.add(new User(4, "hacer"));
        userArrayList.add(new User(5, "pinar"));
        userArrayList.add(new User(6, "mustafa"));
        userArrayList.add(new User(7, "adem"));

        userArrayList.stream().forEach(x-> {
            System.out.println(x.getId());
            System.out.println(x.getName());
        });

        System.out.println("----forEach(x->x.talk())----");

        userArrayList.stream().forEach(x->x.talk());

        System.out.println("----forEach(User::talk)----Reference");

        userArrayList.stream().forEach(User::talk);

        System.out.println("----Filter----");

        userArrayList.stream().filter(x-> x.id > 5).forEach(x-> System.out.println(x.toString()));

        System.out.println("----FilterCount----");

        long count = userArrayList.stream().filter(x -> x.id > 5).count();
        System.out.println("Count : " + count);

        System.out.println("----FilterCollect----");

        List<User> userList = userArrayList.stream().filter(x -> x.getId() > 5).collect(Collectors.toList());
        userList.stream().forEach(x-> x.talk());

        System.out.println("----Map---Degisiklik yapıp yapıp yeni bir elemena map ediyor");

        List<User> collect = userArrayList.stream().filter(x-> x.getId() > 5).map(user -> new User(user.id + 100, user.name))
                .collect(Collectors.toList());

        collect.stream().forEach(user -> {
            System.out.println(user.toString());
        });

        System.out.println("----MapForeach---");

        Map<Integer, String> userMap = userArrayList.stream().collect(Collectors.toMap(user -> user.getId()
                , user -> user.getName()));

        userMap.forEach((key, value)-> System.out.println(key + " : " + value));






    }
}


class User{
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User[" +
                "id=" + id +
                ", name=" + name +
                ']';
    }

    public void talk(){
        System.out.println("Hi I am : " + this.name);
    }
}
