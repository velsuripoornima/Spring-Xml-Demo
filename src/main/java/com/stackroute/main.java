package main.java.com.stackroute;


import main.java.com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class main {

        public static void main(String[] args) {
            ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
            Movie movie = context.getBean("rammovie", Movie.class);
            movie.displayinfo();

            XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
            Movie obj = factory.getBean("rammovie",Movie.class);
            obj.displayinfo();

            DefaultListableBeanFactory factory1=new DefaultListableBeanFactory();
            BeanDefinitionRegistry context1=new GenericApplicationContext(factory1);
            BeanDefinitionReader reader=new XmlBeanDefinitionReader(context1);
            reader.loadBeanDefinitions("beans.xml");
            Movie shivam=factory1.getBean("rammovie",Movie.class);
            shivam.displayinfo();

        }
}
