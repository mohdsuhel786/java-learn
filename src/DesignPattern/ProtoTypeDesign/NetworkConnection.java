package DesignPattern.ProtoTypeDesign;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + this.ip + '\'' +
                ", importantData='" + this.importantData + '\'' + " : " + domains +
                '}';
    }

    public void loadImportantData() throws InterruptedException {
        this.importantData = "very important data";
        domains.add("www.google.com");
        domains.add("ww.fb.com");
        domains.add("www.tech.com");
        Thread.sleep(5000);
        // it will take 5 minute
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       // logic for cloning (Deep copy)
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.ip);
        networkConnection.setImportantData(this.getImportantData());
        for(String d: this.domains){
            networkConnection.getDomains().add(d);
        }
      //  return super.clone(); for shallow copy
        return networkConnection;
    }
}
