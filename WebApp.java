public class WebApp implements AlertListener{
  public void processAlert(String message){
    System.out.println("WebApp: "+ message);
  }
}
