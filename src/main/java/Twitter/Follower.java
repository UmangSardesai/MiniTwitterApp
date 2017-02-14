package Twitter;

class Follower
{
  private String follower;
  private String following;

  public String getFollower()
  {
    return this.follower;  
  }

  public void setFollower(String follower)
  {
    this.follower=follower;
  }

  public String getFollowing()
  {
    return this.following;
  }

  public void setFollowing(String following)
  {
    this.following = following;
  }

  public Follower(String follower, String following)
  {
    this.follower = follower;
    this.following = following;
  }

  public Follower()
  {

  }        
}