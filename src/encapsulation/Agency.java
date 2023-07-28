package encapsulation;

public class Agency {
    private String Adress;
    private String AgentName;
    private int price;

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getAgentName() {
        return AgentName;
    }

    public void setAgentName(String agentName) {
        AgentName = agentName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
