package com.stackroute.domain;

public class Actor {

    private String name,gender;
    private int age;

    //creating parameter constructor
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    //creating the getters and setters
    public void setName(String name) {

        this.name = name;
    }


    public void setGender(String gender) {

        this.gender = gender;
    }


    public void setAge(int age) {

        this.age = age;
    }

    public void info(){

        System.out.println("Actor name is:"+name+ "\ngender of the actor is :" +gender+ "\nage is :" +age +"\n");
    }

}
