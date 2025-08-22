package EnumProjects.SportsTournament;

public enum Sport {
    FOOTBALL(22,"UK"),
    BASKETBALL(12,"usa"),
    TENNIS(2,"Suisse"),
    CRICKET(10,"India"),
    SWIMMING(6,"Turkey");
    private int numberOfPlayers;
    private String originCountry;

    Sport(int numberOfPlayers, String originCountry) {
        this.numberOfPlayers = numberOfPlayers;
        this.originCountry = originCountry;
    }
    public void printInfo(){
        System.out.println(this.name()+"-> players:"+numberOfPlayers+"| Origin:"+originCountry);
    }

    public static void main(String[]args){
        for(Sport sport:Sport.values()){
            sport.printInfo();
        }

    }
}
