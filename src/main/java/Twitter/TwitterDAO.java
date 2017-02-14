package Twitter;

public interface TwitterDAO
{

  void create(String data, String user);

  void following(String follower);

  void followers(String following);

  void follow(String follower, String following);

  void unfollow(String follower, String following);

  void feed(String user);
  
}