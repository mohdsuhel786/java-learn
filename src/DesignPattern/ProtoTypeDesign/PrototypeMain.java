package DesignPattern.ProtoTypeDesign;

public class PrototypeMain {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadImportantData();
        System.out.println(networkConnection);

        // new object of network connection
    NetworkConnection networkConnection1 = null;
    try{
        networkConnection1 = (NetworkConnection) networkConnection.clone();
        System.out.println(networkConnection1);
        networkConnection.getDomains().remove(0);
        System.out.println(networkConnection);
        System.out.println(networkConnection1);
    }catch (CloneNotSupportedException e)
    {
        e.printStackTrace();
    }
    }
}
