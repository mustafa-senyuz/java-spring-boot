 
	 package com.luv2code.springboot.demo.mycoolapp.check;
	 
	 import org.springframework.boot.actuate.info.Info.Builder; import
	 org.springframework.boot.actuate.info.InfoContributor; import
	 org.springframework.stereotype.Component;
	 
	 @Component 
	 public class CustomInfoContributor implements InfoContributor {
	 
	 @Override 
	 public void contribute(Builder builder) {
		 
	 builder.withDetail("name", "customValue"); 
	 builder.withDetail("description","customValue"); 
	 builder.withDetail("version", "customValue"); }
	 
	 }
 
