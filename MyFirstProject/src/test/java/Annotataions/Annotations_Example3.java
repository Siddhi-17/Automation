package Annotataions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Example3 {
 @BeforeTest
 public void createpim() {
	 System.out.println("pim created");
 }
 @Test
 public void first(){
	 System.out.println("this is my first tc..");
 }
 @AfterTest
 public void deletepim() {
	 System.out.println("pim deleted successfully..");
 }
 
 @Test
 public void second() {
	 System.out.println("this is my second tc..");
 }
 
  }

