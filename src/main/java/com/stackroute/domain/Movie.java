package com.stackroute.domain;

public class Movie {

    private Actor actor;

    //create contructor for actor class
    public void setActor(Actor actor) {

        this.actor = actor;
    }

    //by using this method we are calling the actor method
    public void displayinfo(){

        actor.info();
    }
}
