package speltesting;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("other-tiers.xml");
        SimpleBeanB bean = container.getBean(SimpleBeanB.class);
        System.out.println(bean.getSimpleValue());
        System.out.println(bean.getRandom());
    }
}
