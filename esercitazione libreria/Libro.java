public class Libro
{
    private String titolo;
    private String autore;
    private String anno_di_pubblicazione;
    private boolean disponibile = true;

    public Libro(String titolo, String autore, String anno_di_pubblicazione) 
    {
        this.titolo = titolo;
        this.autore = autore;
        this.anno_di_pubblicazione = anno_di_pubblicazione;
    }

    public Libro() 
    {
        
    }

    //----TITOLO----
    public void setTitolo(String titolo) 
    {
        this.titolo = titolo;
    }
    public String getTitolo() 
    {
        return this.titolo;
    }
    //----AUTORE-----
    public void setAutore(String autore) 
    {
        this.autore = autore;
    }
    public String getAutore() 
    {
        return this.autore;
    }
    //----ANNO_DI_PUBBLICAZIONE-----
    public void setAnno_di_pubblicazione(String anno_di_pubblicazione) 
    {
        this.anno_di_pubblicazione = anno_di_pubblicazione;
    }
    public String getAnno_di_pubblicazione() 
    {
        return this.anno_di_pubblicazione;
    }
    //-----DISPONIBILE----
    public void setDisponibile(boolean disponibile) 
    {
        this.disponibile = disponibile;
    }
    public boolean getDisponibile() 
    {
        return this.disponibile;
    }
}