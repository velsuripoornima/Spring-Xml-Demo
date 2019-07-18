package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie {

    private Actor actor;

    //created default constructor
    public Movie() {

    }

    //creating the constructor for actor class
    public Movie(Actor actor) {
        this.actor = actor;
    }


    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //by using this method we are calling the actor class method
    public void displayinfo(){

        actor.info();
    }
}
