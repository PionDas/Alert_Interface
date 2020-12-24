public class PhoneApp implements AlertListener{
  public void processAlert(String message){
    System.out.println("PhoneApp: " + message);
  }
}
