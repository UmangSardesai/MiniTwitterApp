package Twitter;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TweetMapper implements RowMapper {  
 public Tweet mapRow(ResultSet rs, int rowNum) throws SQLException {  
  Tweet t = new Tweet();  
  t.setData(rs.getString("data"));  
  t.setUser(rs.getString("user")); 
  return t;  
 }  
}  