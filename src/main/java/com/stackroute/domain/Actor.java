package com.stackroute.domain;

public class Actor {

    private String name,gender;
    private int age;

    // parameter constructor
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

//creating setters and getters
    public void setName(String name) {

        this.name = name;
    }


    public void setGender(String gender) {

        this.gender = gender;
    }


    public void setAge(int age) {

        this.age = age;
    }

    //displaying the actor information
    public void info(){

        System.out.println("Actor name is:"+name+ "\ngender of the actor is :" +gender+ "\nage is :" +age +"\n");
    }

}
