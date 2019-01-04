package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList =new ArrayList<>();
    public Forum(){
        theUserList.add(new ForumUser(00001, "Karol",'M', 1986,02,15,2));
        theUserList.add(new ForumUser(00002, "Jan",'M', 1980,02,15,0));
        theUserList.add(new ForumUser(00003, "Anna",'F', 1986,03,15,10));
        theUserList.add(new ForumUser(00004, "Piotr",'M', 2003,03,15,7));
        theUserList.add(new ForumUser(00005, "Robert",'M', 1995,03,17,3));
    }
    public List<ForumUser>getUserList(){
        return new ArrayList<>(theUserList);
    }
}
