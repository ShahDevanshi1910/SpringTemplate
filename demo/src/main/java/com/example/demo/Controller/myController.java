package com.example.demo.Controller;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class myController {


    @Autowired
    StudentRepository studentRepository;

@PostMapping("/addUser")
public List<Student> addUser(@RequestBody Student student){
    System.out.println("Done");
    studentRepository.save(student);
    return studentRepository.findAll();
}

}
