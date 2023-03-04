package houses;

public class houses {
    private String houseName;
    private int gryffindorScore;
    private int ravenclawScore;
    private int hufflepuffScore;
    private int slytherinScore;

    public houses(String houseName, int gryffindorScore, int ravenclawScore, int hufflepuffScore, int slytherinScore) {
        this.houseName = houseName;
        this.gryffindorScore = gryffindorScore;
        this.ravenclawScore = ravenclawScore;
        this.hufflepuffScore = hufflepuffScore;
        this.slytherinScore = slytherinScore;
    }

    public String getHouseName() {
        return houseName;
    }

    public int getGryffindorScore() {
        return gryffindorScore;
    }

    public int getRavenclawScore() {
        return ravenclawScore;
    }

    public int getHufflepuffScore() {
        return hufflepuffScore;
    }

    public int getSlytherinScore() {
        return slytherinScore;
    }

    public void addToSlytherinScore(String questionAnswer){
        if (questionAnswer.equals(slytherinScore))
            ++slytherinScore;
    }
}
