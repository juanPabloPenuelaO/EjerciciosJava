package encapsulation;

public class MainSoccerPlayer {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        soccerPlayer.setName("Samuel");
        soccerPlayer.setGolesAnotados(34);
        soccerPlayer.setNumeroCamiseta(10);
        System.out.println(soccerPlayer.getName());
        System.out.println(soccerPlayer.getGolesAnotados());
        System.out.println(soccerPlayer.getNumeroCamiseta());
    }
}
