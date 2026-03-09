package springboot_project.project_1;

import org.springframework.stereotype.Component;

@Component
public class LoggerComponent {

    public void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}