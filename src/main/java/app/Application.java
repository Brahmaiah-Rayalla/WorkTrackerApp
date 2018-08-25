package app;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

/**
 * Main class to start spring boot
 * @author RAYALLB
 *
 */
@SpringBootApplication
@Controller
public class Application {
    
    public static Logger log = Logger.getLogger(Application.class.getName());
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
    
}
