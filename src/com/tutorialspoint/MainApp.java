package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
   public static void main(String[] args) {
      @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");//"Beans.xml" 文件加载路径问题
      HelloWorld obj = (HelloWorld) context.getBean("helloworld");
      obj.getMessage();
   }
}