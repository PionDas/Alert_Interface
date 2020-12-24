public class AlertServer{

  private AlertListener[] clients;
  private int numberOfClients;

  public void AlertServer(int capacity){
    clients = new AlertListener[capacity];
    numberOfClients = 0;
  }

  public void register(AlertListener client){
    clients[numberOfClients] = client;
    numberOfClients++;

  }

  public void broadcast(String message){
    for(int i = 0; i<numberOfClients; i++){
      clients[i].processAlert(message);
    }
  }

}
