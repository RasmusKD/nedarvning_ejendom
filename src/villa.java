public class villa extends ejendom {
    private int rum;
    private int antalBeboedeKvadratmeter;
    private int pris;

    public villa() {
    }

    public villa(int rum, int antalBeboedeKvadratmeter, int pris) {
        this.rum = rum;
        this.antalBeboedeKvadratmeter = antalBeboedeKvadratmeter;
        this.pris = pris;
    }

    public int getRum() {
        return rum;
    }

    public void setRum(int rum) {
        this.rum = rum;
    }

    public int getAntalBeboedeKvadratmeter() {
        return antalBeboedeKvadratmeter;
    }

    public void setAntalBeboedeKvadratmeter(int antalBeboedeKvadratmeter) {
        this.antalBeboedeKvadratmeter = antalBeboedeKvadratmeter;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int prisPerKvadratmeter (){
        return this.antalBeboedeKvadratmeter / this.pris;
    }
}
