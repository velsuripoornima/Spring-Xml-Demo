package com.stackroute.domain;

public class Actor {

    private String name,gender;
    private int age;

    //creating getters and setters
    public void setName(String name) {

        this.name = name;
    }


    public void setGender(String gender) {

        this.gender = gender;
    }


    public void setAge(int age) {

        this.age = age;
    }

    //display information about actor
    public void info(){

        System.out.println("Actor name is:"+name+ "\ngender of the actor is :" +gender+ "\nage is :" +age);
    }

}
