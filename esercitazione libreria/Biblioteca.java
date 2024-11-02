import java.util.*;

public class Biblioteca
{
    static private ArrayList<Libro> libri;

    public Biblioteca()
    {
        Biblioteca.libri = new ArrayList<>();
    }
    
    public void aggiungiLibri(Libro l)
    {
        libri.add(l);
    }

    public void visualizzaLibri()
    {
        if(!Biblioteca.libri.isEmpty())
        {
            for (Libro l : libri)
            {
                System.out.println("titolo: " + l.getTitolo());
                System.out.println("autore: " + l.getAutore());
                System.out.println("anno di pubblicazione: " + l.getAnno_di_pubblicazione());
                if(l.getDisponibile())
                {
                    System.out.println("libro disponibile");
                }
                else
                {
                    System.out.println("libro non disponibile");
                }
            }
        }
        else
        {
            System.out.println("non ci sono libri nella biblioteca");
        }
    }

    public void rimuoviLibro()
    {
        Scanner input = new Scanner(System.in);
        String cercaLibro;
        System.out.println("inserisci titolo del libro che vuoi rimuovere");
        cercaLibro = input.nextLine();
        boolean trovato = false;

        int i = 0;
        for(Libro l : libri)
        {
            if(cercaLibro.equals(l.getTitolo()))
            {
                trovato = true;
                break;
            }
            i++;
        }
        if(trovato == true)
        {
            libri.remove(libri.get(i));
        }
        else
        {
            System.out.println("libro inserito inesistente");
        }
    }

    public void cercaLibro()
    {
        if(!Biblioteca.libri.isEmpty())
        {
            Scanner input = new Scanner(System.in);
            String cercaLibro;
            System.out.println("inserisci titolo del libro che vuoi cercare");
            cercaLibro = input.nextLine();

            boolean trovato = false;

            for(Libro l : libri)
            {
                if(cercaLibro.equals(l.getTitolo()))
                {
                    trovato = true;
                    System.out.println("LIBRO TROVATO");
                    System.out.println("titolo: " + l.getTitolo());
                    System.out.println("autore: " + l.getAutore());
                    System.out.println("anno di pubblicazione: " + l.getAnno_di_pubblicazione());
                    if(l.getDisponibile() == true)
                    {
                        String disp;
    
                        System.out.println("libro disponibile");
                        System.out.println("vuoi prenderlo in prestito? si/no");
                        disp = input.nextLine();
                        if(disp.equals("si"))
                        {
                            System.out.println("Libro preso in prestito! libro non piu' disponibile");
                            l.setDisponibile(!l.getDisponibile());
                        }
                        else
                        {
                            System.out.println("Libro non preso in prestito! libro ancora disponibile");
                        }
                    }
                    else
                    {
                        System.out.println("libro non disponibile");
                    }
                }
            }
            if(trovato == false)
            {
                System.out.println("libro inesistente");
            }
        }
        else
        {
            System.out.println("non ci sono libri nella biblioteca");
        }
    }

    public void restituisciLibro()
    {
        Scanner input = new Scanner(System.in);
        String cercaLibro;
        System.out.println("inserisci titolo del libro che vuoi restituire");
        cercaLibro = input.nextLine();

        boolean trovato = false;
        for(Libro l : libri)
        {
            if(cercaLibro.equals(l.getTitolo()))
            {
                trovato = true;
                System.out.println("LIBRO TROVATO");
                System.out.println("titolo: " + l.getTitolo());
                System.out.println("autore: " + l.getAutore());
                System.out.println("anno di pubblicazione: " + l.getAnno_di_pubblicazione());
                if(l.getDisponibile() == false)
                {
                    String disp;

                    System.out.println("libro non disponibile");
                    System.out.println("vuoi restituirlo? si/no");
                    disp = input.nextLine();
                    if(disp.equals("si"))
                    {
                        System.out.println("Libro restituito! libro disponibile");
                        l.setDisponibile(!l.getDisponibile());
                    }
                    else
                    {
                        System.out.println("Libro non restituito! libro ancora non disponibile");
                    }
                }
                else
                {
                    System.out.println("libro gia' disponibile");
                }
            }
        }
        if(trovato == false)
        {
            System.out.println("libro inesistente");
        }
    }
}