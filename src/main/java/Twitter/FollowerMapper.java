package Twitter;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FollowerMapper implements RowMapper {  
 public Follower mapRow(ResultSet rs, int rowNum) throws SQLException {  
  Follower f = new Follower();  
  f.setFollower(rs.getString("Follower"));  
  f.setFollowing(rs.getString("Following")); 
  return f;  
 }  
}