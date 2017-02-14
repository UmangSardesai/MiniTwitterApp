package Twitter;

class Tweet
{
  private String data;
  private String user;

  public String getData()
  {
    return this.data;  
  }

  public void setData(String data)
  {
    this.data=data;
  }

  public String getUser()
  {
    return this.user;
  }

  public void setUser(String user)
  {
    this.user = user;
  }

  public Tweet(String data, String user)
  {
    this.data=data;
    this.user = user;
  }

  public Tweet()
  {
    
  }      
}