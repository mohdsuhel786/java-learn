package DesignPattern.ProtoTypeDesign;

public class PrototypeMain {
    public static void main(String[] args) {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadImportantData();
        System.out.println(networkConnection);
    }
}
