package Cwiczenie4;

public class Zadanie5 {

    public class Zadanie5 {

        int amplituda;
        int ileKrokowNaPelnyKat;
        int liczbaWierszy;
        String temp = "";

        public Zadanie5(int amplituda, int ileKrokowNaPelnyKat, int liczbaWierszy) {
            this.amplituda = amplituda;
            this.ileKrokowNaPelnyKat = ileKrokowNaPelnyKat;
            this.liczbaWierszy = liczbaWierszy;
        }

        public String printFunction() {

            for (int i = 0; i < liczbaWierszy; i++) {
                //   Math.sin(90*Math.PI/180)=1.0   ;
                int j = (int) (amplituda * Math.cos((360 / ileKrokowNaPelnyKat) * i * Math.PI / 180) + amplituda + 1);
                for (int k = 0; k < j; k++) {
                    temp = temp.concat("*");
                }
                temp = temp.concat("\n");
            }
            return temp;
        }

        public static void main(String[] args) {
            Zadanie5 cosinusik = new Zadanie5(10, 20, 40);

            System.out.println(cosinusik.printFunction() );

        }
    }