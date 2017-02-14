CREATE TABLE Followers
 (
  follow_id int(10) NOT NULL AUTO_INCREMENT, 
  follower varchar(25) NOT NULL, 
  following varchar(25) NOT NULL, 
  PRIMARY KEY (follow_id)
 );