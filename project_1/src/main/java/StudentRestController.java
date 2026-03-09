import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    @Autowired
    private StudentService service;

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        service.addStudent(student);
        return "Student Added";
    }

    @GetMapping
    public List<Student> getStudents() {
        return service.getStudents();
    }
}