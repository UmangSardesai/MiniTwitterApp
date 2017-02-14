package Twitter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.annotation.PostConstruct;


@RestController
class Controller{

   @Autowired 
   private TwitterDAOImpl t;

   //  @PostConstruct
   //  private void postConstruct() {
   //      this.t = new TwitterDAOImpl();
   //  }   

   @RequestMapping("/greeting")
   public String greeting() {

        t.create("Good Morning Mumbai!", "umang");
        return "Created Successfully!";
    }

   @RequestMapping("/")
   public String hello() {
        return "This is a sample Twitter App!";
    }
}