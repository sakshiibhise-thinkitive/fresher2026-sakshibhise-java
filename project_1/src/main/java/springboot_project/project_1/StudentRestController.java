package springboot_project.project_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

    @GetMapping("/student")
    public Student getStudent() {

        Student s = new Student(1, "Sakshi");

        return s;
    }
}