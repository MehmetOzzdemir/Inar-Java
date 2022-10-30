package Weeks.Weeks_12;

public class FootballClub {

    private int balance;
    private String clubName;
    private double ticketFee;
    private String stadium;
    private int stadiumCapacity;

    private Player [] players;
    private Player [] team;

    public FootballClub(){
        this(0,"",0,"",0,new Player[25]);
    }

    public FootballClub(int balance,String clubName,double ticketFee,String stadium,int stadiumCapacity,Player  [] players){
        this.balance=balance;
        this.clubName=clubName;
        this.ticketFee=ticketFee;
        this.stadium=stadium;
        this.stadiumCapacity=stadiumCapacity;
        this.players=new Player[25];

    }


    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }

    public String  getClubName(){
        return this.clubName;
    }
    public void setClubName(String clubName){
        this.clubName=clubName;
    }

    public double getTicketFee(){
        return this.ticketFee;
    }

    public void setTicketFee(double ticketFee){
        this.ticketFee=ticketFee;
    }

    public String  getStadium(){
        return this.stadium;
    }
    public void setStadium(String stadium){
        this.stadium=stadium;
    }

    public int getStadiumCapacity(){
        return this.stadiumCapacity;
    }
    public void setStadiumCapacity(int stadiumCapacity){

        this.stadiumCapacity=stadiumCapacity;
    }
    public Player [] getPlayers(){
        return players;
    }
    public void setPlayers(Player[]players){
        this.players=players;
    }
    public void sellTickets(int soldTicketNumber){
        soldTicketNumber=soldTicketNumber>this.stadiumCapacity?this.stadiumCapacity:soldTicketNumber;
        this.balance+=(int)(soldTicketNumber*this.ticketFee);
    }
    public void sellPlayer(Player p){
        this.balance=this.balance-p.getFee();
        removePlayer(p);
    }

    private void removePlayer(Player p) {
        for (int i = 0; i <this.team.length ; i++) {
            Player myPlayer = team [i];
            if(myPlayer.getFee().equals(p.getName())){
                
            }
        }

    }


}
