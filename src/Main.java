import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        villa v1 = new villa(4, 120,2000000);
        butik b1 = new butik(30,80,1200000);
        etage e1 = new etage(20,130,2,2600000);

        ArrayList <ejendom> e = new ArrayList<>();

        e.add(v1);
        e.add(b1);
        e.add(e1);

        udskriv(e);

    }
    public static void udskriv(ArrayList <ejendom> e){
        for (int i = 0; i < e.size(); i++){
            System.out.println("Ejendom " + (i + 1));
            if (e.get(i) instanceof villa) {
                System.out.println("Pris " + ((villa) e.get(i)).getPris());
                System.out.println("Rum " + ((villa) e.get(i)).getRum());
                System.out.println("BeboedeKvadratmeter " + ((villa) e.get(i)).getAntalBeboedeKvadratmeter());
            }
            if (e.get(i) instanceof butik) {
                System.out.println("Pris " + ((butik) e.get(i)).getPris());
                System.out.println("Butiksareal " + ((butik) e.get(i)).getButiksareal());
                System.out.println("Beboelsesareal " + ((butik) e.get(i)).getBeboelsesareal());
            }
            if (e.get(i) instanceof etage) {
                System.out.println("Pris " + ((etage) e.get(i)).getPris());
                System.out.println("Beboelsesareal " + ((etage) e.get(i)).getBeboelsesareal());
                System.out.println("Etager " + ((etage) e.get(i)).getEtager());
                System.out.println("Butiksareal " + ((etage) e.get(i)).getButiksareal());
            }
        }
    }
}