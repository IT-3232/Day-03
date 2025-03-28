package lk.ac.vau.fas.ict.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/app")
public class AppController {
    Student ob1 = new Student("2020ict30","Thilan",25,"IT",3.0);
    Student ob2 = new Student("2020ict21","Sandeepa",25,"IT",6.0);
	Student ob3 = new Student("2020ict49","goka",25,"IT",4.0);
	Student ob4 = new Student("2020ict32","baiyamalliteshan",25,"IT",4.0);


    @GetMapping("/name")
    public String getMethodName() {
        return ob1.getName();
    }
    
	
}
