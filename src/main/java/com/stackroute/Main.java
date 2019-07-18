package com.stackroute;


import com.stackroute.domain.Movie;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

        public static void main(String[] args) {
                //display using the application context
            ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

            Movie movie = context.getBean("rammovie", Movie.class);
            movie.displayinfo();

            Movie movie1 = context.getBean("rammovie1", Movie.class);
            movie1.displayinfo();


            Movie ravimovie = context.getBean("ravimovie", Movie.class);
            ravimovie.displayinfo();

            Movie ravimovie1 = context.getBean("ravimovie1", Movie.class);
            ravimovie1.displayinfo();


            Movie vijaymovie = context.getBean("vijaymovie", Movie.class);
            vijaymovie.displayinfo();

            System.out.println(movie==movie1);  //resulting false 
            System.out.println(ravimovie==ravimovie1); //resulting true

            ((ClassPathXmlApplicationContext)context).close(); //destroy context


        }
}
