package tpSpringAnnotation.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tpSpringAnnotation.metier.IMetierImpl;

public class PresentationUsingSpringAnnotation {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext("tpSpringAnnotation");


        IMetierImpl metier=applicationContext.getBean(IMetierImpl.class);

        double res = metier.calcul();
        System.out.println(res);
    }
}
