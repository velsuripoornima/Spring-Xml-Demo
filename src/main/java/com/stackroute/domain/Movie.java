package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private Actor actor;

    //default constructor
    public Movie() {

    }
    
    //constructor for actor class
    public Movie(Actor actor) {
        this.actor = actor;
    }

//    @Autowired
//    @Qualifier("ravi")
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //calling actor method
    public void displayinfo(){

        actor.info();
    }

    //inbuilt method for appliationaware
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("this method implemented by BeanFactoryAware.....");

    }

    //inbuilt method for BeanFactoryAware
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("this method implemented by Application context aware ...");

    }

    //inbuilt method for Beannameaware
    public void setBeanName(String s) {

        System.out.println("this is implemented by beanawarenme....");

    }
}
