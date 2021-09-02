package com.jpa.test;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

import antlr.collections.List;

       @SpringBootApplication
        public class BootjpaexampleApplication 
         {
     	public static void main(String[] args) {
		ApplicationContext con =SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userrepo=con.getBean(UserRepository.class);
		User user =new User();
		user.setName("sanjay");
	    user.setCity("dehradun");
	    user.setStatus("java developer");
	    User user1 =new User();
		user1.setName("ankita");
	    user1.setCity("delhi");
	    user1.setStatus("c programmer");
     //   User user2=userrepo.save(user1);
       
	   // System.out.println(user2);
	  
  
       /*   ArrayList<User> student=new ArrayList();
          student.add(user1);
          student.add(user);
          for(User s :student)
          {
        	  System.out.println(s);
          }*/
	    
	  // Optional<User> option= userrepo.findById(2);
	    /*
	    User user5=option.get();
	    user5.setName("mohit sir");
	    User user6=userrepo.save(user5);
	    System.out.println(user6);
	    */
	    
	   /*Iterable<User> name= userrepo.findAll();
	  	name.forEach(user8->{System.out.println(user8);});
     	*/
	    
     	//deleting
	    //userrepo.deleteById(1);
	// java.util.List<User> list=userrepo.findByName("ankita");
	//  list.forEach(e->System.out.print(e));
	  java.util.List<User> list1=userrepo.getAllUser();
	  list1.forEach(p->System.out.print(p));
	//  java.util.List<User> list1=userrepo.findByName("an");
	// list1.forEach(p->System.out.print(p));
     	
     	
     	}
   }
