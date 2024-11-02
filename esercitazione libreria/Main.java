/*
    COSE DA AGGIUNGERE:
    4) aggiungere kay <-- tommaso
    5) aggiustare vari controlli ecc...
    7) abbellire il tutto <-- tommaso
    8) prendere 10 
*/

import java.util.*;

public class Main 
{
    static Scanner input_int = new Scanner(System.in);
    static Scanner input_string = new Scanner(System.in);
    static public void main(String[] args) 
    {
        Biblioteca biblioteca = new Biblioteca();

        int scelta;
        do 
        {
            System.out.println("INSERISCI OPZIONE");
            System.out.println("0) esci dal programma");
            System.out.println("1) aggiungi libro");
            System.out.println("2) rimuovi libro");
            System.out.println("3) visualizza tutti i libri");
            System.out.println("4) cerca un libro");
            System.out.println("5) restituisci un libro");
            System.out.println("6) pulisci terminale");
            scelta = input_int.nextInt();

            switch(scelta)
            {
                case 0 ->                   
                {
                    System.out.println("sei sicuro di voler uscire dal programma? si/no");
                    String sicuro = input_string.nextLine();
                    if(sicuro.equals("si"))
                    {
                        System.out.println("sei uscito dal programma");
                        caricamento();
                        pulisciTerminale();
                        return;
                    }
                }
                case 1 ->           
                {
                    Libro l = new Libro();

                    System.out.print("inserisci titolo: ");
                    l.setTitolo(input_string.nextLine());
                    System.out.print("inserisci autore: ");
                    l.setAutore(input_string.nextLine());
                    System.out.print("inserisci anno di pubblicazione: ");
                    l.setAnno_di_pubblicazione(input_string.nextLine());

                    biblioteca.aggiungiLibri(l);
                }
                case 2 ->
                {
                    biblioteca.rimuoviLibro();
                }
                case 3 ->             
                {
                    biblioteca.visualizzaLibri();
                }
                case 4 ->               
                {
                    biblioteca.cercaLibro();
                }
                case 5 ->
                {
                    biblioteca.restituisciLibro();
                }
                case 6 ->
                {
                    pulisciTerminale();
                }
                default ->
                {
                    System.out.println("opzione non valida");
                }
            }
        } while (true);
    }

    static void pulisciTerminale() 
    {
        try 
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) 
        {
            System.out.println("Impossibile pulire il terminale: " + e.getMessage());
        }
    }

    public static void caricamento() 
    {
        System.out.print("[");
        for (int i = 0; i < 7; i++) 
        {
            try 
            {
                Thread.sleep(400);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.print("===");
        }
        System.out.print("]");

        System.out.println("\nCaricamento completato!");
    }
}