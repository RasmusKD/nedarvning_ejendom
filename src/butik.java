public class butik extends ejendom {
    private int beboelsesareal;
    private int butiksareal;
    private int pris;

    public butik() {
    }

    public butik(int beboelsesareal, int butiksareal, int pris) {
        this.beboelsesareal = beboelsesareal;
        this.butiksareal = butiksareal;
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

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int prisPerKvadratmeter (){
        return this.beboelsesareal / this.pris;
    }
}
