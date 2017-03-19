package ua.mega;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("applicationContext.xml");

        BeanFactory factory = new XmlBeanFactory(r);

        Employee employee = (Employee) factory.getBean("e");
        employee.display();
    }
}
