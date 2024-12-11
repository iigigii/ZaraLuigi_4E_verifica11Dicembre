//Zara Luigi
//Classe 4E
//Verifica 11 dicembre 2024

//importazione librerie
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        /*------------------------rettangolo------------------------*/
        //dichiarazione delle variabili
        double base = 0, altezza = 0;

        //chiedo all'utente di inserire in input la misura della base
        System.out.println("Inserisci la misura della base: ");
        base = keyboard.nextDouble();

        //controllo che la base sia positiva
        while(base < 0){
            System.out.println("Attenzione!! la base non può essere negativa");
            base = keyboard.nextDouble();
        }

        //chiedo all'utente di inserire in input la misura dell'altezza
        System.out.println("Inserisci la misura dell'altezza: ");
        altezza = keyboard.nextDouble();

        //controllo che l'altezza sia positiva
        while(altezza < 0){
            System.out.println("Attenzione!! l'altezza non può essere negativa");
            altezza = keyboard.nextDouble();
        }

        //creo un nuovo oggetto rettangolo
        Rettangolo rettangolo1 = new Rettangolo(base, altezza);

        //invoco il metodo calcolaPerimetro e mostro il risultato in output
        System.out.println("La misura del perimetro del rettangolo è: " + rettangolo1.calcolaPerimetro());


        /*------------------------Punto------------------------*/
        //dichiarazione e inizializzazione variabili
        double x = 0;
        double y = 0;

        //chiedo all'utente di inserire in input l'ascissa della base
        System.out.println("Inserisci l'ascissa': ");
        x = keyboard.nextDouble();

        //controllo che l'ascissa sia positiva
        while(x < 0){
            System.out.println("Attenzione!! la X non può essere negativa");
            x = keyboard.nextDouble();
        }

        //chiedo all'utente di inserire in input la misura dell'altezza
        System.out.println("Inserisci l'ordinata: ");
        y = keyboard.nextDouble();

        //controllo che l'altezza sia positiva
        while(y < 0){
            System.out.println("Attenzione!! La Y non può essere negativa");
            y = keyboard.nextDouble();
        }

        //creazione nuovo oggetto punto
        Punto punto = new Punto(x, y);

        //invoco il metodo distanza  e mostro il risultato in output
        System.out.println(punto.distanza(x, y, punto.xParametro, punto.yParametro));


        /*------------------------Poligono------------------------*/
        //dichiarazione e inizializzazione variabili
        int numeroLati = 0;
        double lunghezzaLato = 0;

        //chiedo all'utente di inserire in input il numero di latid el poligono
        System.out.println("Inserisci il numero di lati: ");
        numeroLati = keyboard.nextInt();

        //controllo che l'ascissa sia positiva
        while(numeroLati < 0){
            System.out.println("Attenzione!! il numero di lati non può essere negativa");
            numeroLati = keyboard.nextInt();
        }

        //chiedo all'utente di inserire in input la misura della lunghezzaLato
        System.out.println("Inserisci la lunghezzaLato: ");
        lunghezzaLato = keyboard.nextDouble();

        //controllo che l'altezza sia positiva
        while(lunghezzaLato < 0){
            System.out.println("Attenzione!! la lunghezza del lato non può essere negativa");
            lunghezzaLato = keyboard.nextDouble();
        }

        //creazione nuovo oggetto punto
        Poligono poligono = new Poligono(numeroLati, lunghezzaLato);

        //invoco il metodo calcolaPerimetro e mostro il risultato in output
        System.out.println(poligono.toStrimg());


        /*------------CREEPY MAIN-------------*/
        Rettangolo rettangolo = new Rettangolo(15, 18);
        Quadrato quadrato = new Quadrato(6);
        TriangoloRettangolo triangolo = new TriangoloRettangolo(3, 4);
        System.out.println(rettangolo.getInformazioni());
        System.out.println(quadrato.getInformazioni());
        System.out.println(triangolo.getInformazioni());

        //ho sistemato il metodo getInformazioni creando nelle Classi un metodo public di tipo String dove ritorno una stringa
        /*
        if (rettangolo.compareTo(quadrato) > 0) {
            System.out.println("Il rettangolo ha un'area minore del quadrato.");
        } else {
            System.out.println("Il quadrato ha un'area minore o uguale a quella del rettangolo.");
        }*/



    }
}