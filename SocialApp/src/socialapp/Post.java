/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialapp;

import java.util.ArrayList;

/**
 *
 * @author hayrunisa
 */
public class Post {
    

    public String postText;
    public ArrayList<User> likers;

    public Post(String postText){
        this.postText = postText;
        this.likers = new ArrayList<User>();  // Liker listesi başlatılıyor
    }

    public void addLiker(User liker){
        this.likers.add(liker);  // Liker'ı ekliyoruz
    }

    public void setPostText(String postText){
        this.postText = postText;
    }

    public String getPostText(){
        return this.postText;
    }

    public void writePost(){
        System.out.println("Post Text: " + this.postText);
        System.out.println("Likes: " + this.likers.size());
    }
}

