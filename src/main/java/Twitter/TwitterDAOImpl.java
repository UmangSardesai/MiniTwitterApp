package Twitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
// import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.*;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
// import org.springframework.context.annotation.Bean;
// import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Component;

@Component
public class TwitterDAOImpl implements TwitterDAO
{
    @Autowired
    // private DataSource dataSource;
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public TwitterDAOImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // @PostConstruct
    // private void postConstruct() {
    //   // this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    //   this.jdbcTemplate = jdbcTemplate;
    // }

    @Override
    public void create(String data, String user)
    {
      //INSERT into Tweets (data, user) values ('hello, my name is blah', 'umang');
      String sql = "INSERT INTO Tweets (data, user) VALUES (:data, :user)";
      Map m = new HashMap();
      m.put("data", data);
      m.put("user", user);
      jdbcTemplate.update(sql, m);
    }

    @Override
    public void following(String follower)
    {
      //SELECT Followers.following where Followers.follower = 'Umang';
      String sql = "SELECT following from Followers where follower =:follower";
      // SqlParameterSource namedParameters = new MapSqlParameterSource("follower", follower);
      //returns a list of FollowerMapper            
    }

    @Override
    public void followers(String following)
    {
      //SELECT Followers.follower where Followers.following = 'Umang'SELECT Followers.follower where Followers.following = 'Umang'
      String sql = "SELECT follower from Followers where following =:following";
      // SqlParameterSource namedParameters = new MapSqlParameterSource("following", following);
      //returns a list of FollowerMapper            
    }

    public void follow(String follower, String following)
    {
      //INSERT into Followers (follower, following) values ('follower', 'following');
      String sql = "INSERT INTO Followers (follower, following) VALUES (:follower, :following)";
      Map m = new HashMap();
      m.put("follower", follower);
      m.put("following", following);
      jdbcTemplate.update(sql, m);
    }        

    public void unfollow(String follower, String following)
    {
      //DELETE FROM Followers WHERE follower='follower' AND following='following';
      String sql = "DELETE FROM Followers WHERE follower=:follower AND following=:following";
      Map m = new HashMap();
      m.put("follower", follower);
      m.put("following", following);
      jdbcTemplate.update(sql, m);
    }

    public void feed(String user)
    {
      //SELECT * from Tweets WHERE Tweets.user='umang' OR Tweets.user IN (SELECT following from Followers where Followers.follower = 'umang');
      String sql = "SELECT * from Tweets WHERE Tweets.user=:user OR Tweets.user IN (SELECT following from Followers where Followers.follower =:user)";
      // SqlParameterSource namedParameters = new MapSqlParameterSource("user", user);
      //return a list of TweetMapper            
    }  
}