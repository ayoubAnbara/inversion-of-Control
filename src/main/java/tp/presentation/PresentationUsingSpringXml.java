package tp.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tp.metier.IMetierImpl;

public class PresentationUsingSpringXml {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");


        IMetierImpl metier=applicationContext.getBean(IMetierImpl.class);

        double res = metier.calcul();
        System.out.println(res);
    }
}
