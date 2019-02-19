package Cwiczenie4;

import java.util.Random;

public class Cwiczenie_4_matrix {

    public static void main(String[] args) {
        //liczba kolumn i rekordów
        int columns = 5;
        int records = 5;

        //tablice jednowymiarowe o długosci zadeklarowanych kolumn do przechowywania max'ów i min'ów;
        int maxValue[] = new int[columns];
        int minValue[] = new int[columns];

        //tablica docelowa z zadania
        int matrix[][] = new int[records][columns];

        //inicjujemy obiekt pomocniczy Random do losowania zmiennych
        Random random = new Random();

        //Ustawiamay zakres najwyższych i najniższych wartości do wstawiania w matrixa
        int topBound = 5;
        int bottomBound = -5;

        //pętla w pętli zapisuje losowe wartości w matrixie
        for (int i = 0; i < records; i++) {
            //(random.nextInt(11)-5)
            for (int j = 0; j < columns; j++) {
                //obicza
                matrix[i][j] = (random.nextInt(topBound - bottomBound + 1) + bottomBound);
            }
        }
        //Zapisujemy w tablicy Max najniższą wartość (bottomBound) dla wszystkich indexów, a dla min najwyższą (topBound)
        for (int i = 0; i < columns; i++) {
            maxValue[i] = bottomBound;
            minValue[i] = topBound;
        }

        //sprawdzamy max i min
        for (int i = 0; i < records; i++) {
            for (int j = 0; j < columns; j++) {
                maxValue[j] = matrix[i][j] > maxValue[j] ? matrix[i][j] : maxValue[j];
                minValue[j] = matrix[i][j] < minValue[j] ? matrix[i][j] : minValue[j];

                System.out.print(matrix[i][j] + "\t\t");

            }
            System.out.println();
        }
        //Wyświetlamy maxy
        System.out.println("\nMAX");
        for (int e : maxValue) {
            System.out.print(e + "\t\t");
        }
        //Wyświetlamy minima
        System.out.println("\n\nMIN");
        for (int e : minValue) {
            System.out.print(e + "\t\t");
        }
    }
}


