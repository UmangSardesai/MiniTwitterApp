package Twitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
// @ImportResource("beans.xml")
public class Application {

    public static void main(String[] args) {

        // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // TwitterDAOImpl twitterDAOImpl = (TwitterDAOImpl)context.getBean("twitterDAOImpl");   
        SpringApplication.run(Application.class, args);


    }
}