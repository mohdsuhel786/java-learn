package DesignPattern.ProtoTypeDesign;

public class NetworkConnection {

    private String ip;
    private String importantData;

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

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + this.ip + '\'' +
                ", importantData='" + this.importantData + '\'' +
                '}';
    }

    public void loadImportantData(){
        this.importantData = "very important data";
        // it will take 5 minute
    }
}
