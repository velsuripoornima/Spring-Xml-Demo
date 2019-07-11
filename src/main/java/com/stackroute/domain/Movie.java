package main.java.com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie {

    private Actor actor;

    public Movie() {

    }
    public Movie(Actor actor) {
        this.actor = actor;
    }

//    @Autowired
//    @Qualifier("ravi")
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayinfo(){

        actor.info();
    }
}
