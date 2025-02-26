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
public class User {
    

    String userName;
    String birthDay;
    String password;
    int age;
    String gender;
    String phoneNumber;
    String email;
    String name;
    String profileImage;
    ArrayList<User> followers;
    ArrayList<User> followed;
    ArrayList<Post> posts;
    ArrayList<Post> likedPosts;

    public User(String userName, String birthDay, String password, int age, String gender, String phoneNumber, String email, String name, String profileImage){
        this.userName = userName;
        this.birthDay = birthDay;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.name = name;
        this.profileImage = profileImage;
        this.followers = new ArrayList<User>();
        this.followed = new ArrayList<User>();
        this.posts = new ArrayList<Post>();  // Bu listeyi başlatıyoruz
        this.likedPosts = new ArrayList<Post>();
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setBirthDay(String birthDay){
        this.birthDay = birthDay;
    }

    public String getBirthDay(){
        return this.birthDay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public void follow(User u){
        this.followed.add(u);
        u.followers.add(this);
    }

    public void addPost(Post p){
        this.posts.add(p);  // Postu ekliyoruz
    }

    public void like(Post p){
        p.addLiker(this);  // User'ı Post'a ekliyoruz
        this.likedPosts.add(p);  // User'ın beğendiği postları ekliyoruz
    }

    public void writeAllPosts(){
        System.out.println("Posts by " + this.userName + ":");
        for(int i = 0; i < posts.size(); i++){
            posts.get(i).writePost();  // Her postu yazdırıyoruz
        }
    }

    public void writeFollowedCount(){
        System.out.println(this.userName + " is following " + this.followed.size() + " users.");
    }

    public void writeFollowerCount(){
        System.out.println(this.userName + " has " + this.followers.size() + " followers.");
    }
}
