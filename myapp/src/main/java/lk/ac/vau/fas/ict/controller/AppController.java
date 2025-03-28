package lk.ac.vau.fas.ict.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/app")
public class AppController {
    Student ob1 = new Student("2020ict30","Thilan",25,"IT",3.0);
    Student ob2 = new Student("2020ict21","Sandeepa",25,"IT",6.0);
	Student ob3 = new Student("2020ict49","goka",25,"IT",4.0);
	Student ob4 = new Student("2020ict32","baiyamalliteshan",25,"IT",4.0);

   @GetMapping("/age/{ag}")
	public String myAge(@PathVariable("ag") int age){
		return "My Age is "+ age;
	}
	
	@GetMapping("/age/{name}/{ag}")
	public String myAge(@PathVariable("ag") int age,@PathVariable("name") String name){
		return "My Age is "+ age + " My name is "+  name;
	}

    @GetMapping("/name")
    public String getMethodName() {
        return ob1.getName();
    }
    
	@GetMapping("/getdetails")
	public Student getdetails() {
		return ob1;
	}
	



}
