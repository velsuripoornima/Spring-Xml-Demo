package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie {

    private Actor actor;

    //it is a default contructor for movie class
    public Movie() {

    }

    //create constructor for actor class
    public Movie(Actor actor) {
        this.actor = actor;
    }

//    @Autowired <constructor-arg name="actor" ref="ravi" />
//    @Qualifier("ravi")
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //by using this method we displaying the actor information
    public void displayinfo(){

        actor.info();
    }
}
