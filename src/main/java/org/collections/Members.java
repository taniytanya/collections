package org.collections;

import java.util.ArrayList;

public class Members {
    ArrayList<String> members = new ArrayList<>();

    public void addMember(String name){
        members.add(name);
    }
    public void findMember(String name) {
        for (String s1:members) {
            if (s1.equals(name)) {
                System.out.println("Member " + name + " was found");
            } else {
                System.out.println("Member " + name + " was not found");
            }
        }
    }

}
