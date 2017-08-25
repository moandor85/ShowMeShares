package de.torsten.facestutorial;

import java.util.Calendar;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
   
   public HelloWorld() {
      System.out.println("HelloWorld started!");
   }
	
   public String getMessage() {
	   Calendar c = Calendar.getInstance();
      return "Hello World! " + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE);
   }
}