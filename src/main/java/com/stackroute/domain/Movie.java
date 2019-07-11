package main.java.com.stackroute.domain;

public class Movie {

    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayinfo(){

        actor.info();
    }
}
