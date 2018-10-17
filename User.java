package com.jetbrains;

import java.util.ArrayList;

public class User
{
    private String username;
    private String fName;
    private String lName;
    private String webURLAvatar;
    private String emailid;
    ArrayList<Post> posts=new ArrayList<Post>(10);

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public User(String username, String fName, String lName, String webURLAvatar, String emailid) {
        this.username = username;
        this.fName = fName;
        this.lName = lName;
        this.webURLAvatar = webURLAvatar;

        this.emailid=emailid;
    }

    public String getUsername() {return username;}

    public String getfName() {return fName;}

    public String getlName() {return lName;}

    public String getWebURLAvatar() {return webURLAvatar;}

    public String getemailid(){return emailid;}

    public void addPost(Post post)
    {
        posts.add(post);

    }

    //public void add(Post p){
        //  Post p;}
    public static  void main(String[]args)
    {

    }
}
