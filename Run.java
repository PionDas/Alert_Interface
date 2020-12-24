public class Run{
  public static void main(String[] args) {
    WebApp web = new WebApp();
    PhoneApp phone = new PhoneApp();
    AlertServer alert = new AlertServer();
    alert.AlertServer(2);
    alert.register(web);
    alert.register(phone);
    alert.broadcast("Hello");
  }
}
