package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.StringIntConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, StringIntConfig.class); //Creating container

        BeanFactory context = new AnnotationConfigApplicationContext();

        System.out.println("Retrieving the beans");

        SonyMonitor sony = container.getBean(SonyMonitor.class);
        DellCase dell = container.getBean(DellCase.class);
        AsusMotherboard asus = container.getBean(AsusMotherboard.class);

        PC myPc2 =new PC(dell, sony, asus);

//        Monitor theMonitor = container.getBean("monitorSony",Monitor.class);
        Monitor theMonitor = container.getBean("sony",Monitor.class); //By Bean name
        Case theCase = container.getBean(Case.class);
        Motherboard theMotherboard = container.getBean(Motherboard.class);


        PC myPc = new PC(theCase, theMonitor, theMotherboard);
        myPc.powerUp();


    }
}
