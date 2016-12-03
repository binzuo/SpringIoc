package e;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/12/3.
 */
public class Test {
    public static void main(String[] args) {
        //Business business=new Business(new FloppyWriter());
       // Business business=new Business(new USBWriter());
       // business.saveDate();
        //-----------------------------------------------------------------------------------------------构造方法
       // Business business=new Business();
       // business.setDeviceWriter(new FloppyWriter());
       // business.saveDate();
        //-------------------------------------------------------------------------set方法
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
        Business business = (Business) applicationContext.getBean("business");
        business.saveDate();


    }

}
