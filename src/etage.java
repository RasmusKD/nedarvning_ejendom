public class etage extends ejendom{
    private int beboelsesareal;
    private int butiksareal;
    private int etager;
    private int pris;

    public etage() {
    }

    public etage(int beboelsesareal, int butiksareal, int etager, int pris) {
        this.beboelsesareal = beboelsesareal;
        this.butiksareal = butiksareal;
        this.etager = etager;
        this.pris = pris;
    }

    public int getBeboelsesareal() {
        return beboelsesareal;
    }

    public void setBeboelsesareal(int beboelsesareal) {
        this.beboelsesareal = beboelsesareal;
    }

    public int getButiksareal() {
        return butiksareal;
    }

    public void setButiksareal(int butiksareal) {
        this.butiksareal = butiksareal;
    }

    public int getEtager() {
        return etager;
    }

    public void setEtager(int etager) {
        this.etager = etager;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public void prisPerKvadratmeter (){
        System.out.println(this.beboelsesareal / this.pris);
    }
}
