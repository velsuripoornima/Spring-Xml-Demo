package com.stackroute.domain;

public class Actor {

    private String name,gendor;
    private int age;

    public Actor(String name, String gendor, int age) {
        this.name = name;
        this.gendor = gendor;
        this.age = age;
    }


    public void setName(String name) {

        this.name = name;
    }


    public void setGendor(String gendor) {

        this.gendor = gendor;
    }


    public void setAge(int age) {

        this.age = age;
    }

    public void info(){

        System.out.println("Actor name is:"+name+ "\ngender of the actor is :" +gendor+ "\nage is :" +age +"\n");
    }

}
