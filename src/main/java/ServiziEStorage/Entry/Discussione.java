package ServiziEStorage.Entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**Oggetto che rappresenta una Discussione. Contiene parametri int sezione e creatore, String titolo e immagine,
 Data dataCreazione e Liste listaTag(rappresenta i tag della discussione),
  listaIscritti(rappresenta gli iscritti alla discussione), listaModeratori(rappresenta i moderatori della discussione),
   listaKickati(rappresenta gli utenti kickati dalla discussione) e listaCommenti(rappresenta i commenti presenti sulla discussione)*/
public class Discussione {
    private int sezione,creatore;
    private String titolo, immagine;

    private String dataCreazione;
    private List<?> listaTag, listaIscritti,listaModeratori, listaKickati, listaCommenti;

    /**Costruttore che prende in input int sezione, String titolo, int creatore, String immagine, Listuser listaTag, String dataCreazione
     *
     * @param sezione
     * @param titolo
     * @param creatore
     * @param immagine
     * @param listaTag
     * @param dataCreazione
     */
    public Discussione(int sezione, String titolo, int creatore, String immagine, List<?> listaTag, String dataCreazione)
    {
        this.sezione = sezione;
        this.creatore = creatore;
        this.titolo = titolo;
        this.immagine = immagine;
        this.dataCreazione = dataCreazione;
        this.listaTag = listaTag;
        listaIscritti = new ArrayList<UtenteRegistrato>();
        listaModeratori = new ArrayList<UtenteRegistrato>();
        listaKickati = new ArrayList<UtenteRegistrato>();
        listaCommenti = new ArrayList<Commento>();
    }

    /**Costruttore che prende in input int sezione, int creatore, String titolo, String immagine, String dataCreazione,
     * Listuser listaTag, Listuser listaIscritti, Listuser listaKickati
     *
     * @param sezione
     * @param creatore
     * @param titolo
     * @param immagine
     * @param dataCreazione
     * @param listaTag
     * @param listaIscritti
     * @param listaKickati
     */
    public Discussione(int sezione, int creatore, String titolo, String immagine, String dataCreazione, List<?> listaTag,
                       List<?> listaIscritti, List<?> listaKickati) {
        this.sezione = sezione;
        this.creatore = creatore;
        this.titolo = titolo;
        this.immagine = immagine;
        this.dataCreazione = dataCreazione;
        this.listaTag = listaTag;
        this.listaIscritti = listaIscritti;
        this.listaKickati = listaKickati;
        listaModeratori = new ArrayList<UtenteRegistrato>();
        listaCommenti = new ArrayList<Commento>();
    }

    /**Costruttore che prende in input int sezione, int creatore, String titolo, String immagine, String dataCreazione,
     *  Listuser listaTag, Listuser listaIscritti, Listuser listaModeratori, Listuser listaKickati, Listuser listaCommenti
     *
     * @param sezione
     * @param creatore
     * @param titolo
     * @param immagine
     * @param dataCreazione
     * @param listaTag
     * @param listaIscritti
     * @param listaModeratori
     * @param listaKickati
     * @param listaCommenti
     */
    public Discussione(int sezione, int creatore, String titolo, String immagine, String dataCreazione,
                       List<?> listaTag, List<?> listaIscritti, List<?> listaModeratori, List<?> listaKickati,
                       List<?> listaCommenti) {
        this.sezione = sezione;
        this.creatore = creatore;
        this.titolo = titolo;
        this.immagine = immagine;
        this.dataCreazione = dataCreazione;
        this.listaTag = listaTag;
        this.listaIscritti = listaIscritti;
        this.listaModeratori = listaModeratori;
        this.listaKickati = listaKickati;
        this.listaCommenti = listaCommenti;
    }

    /**
     * Costruttore base di Discussione
     */
    public Discussione() {

    }

    /**ritorna un numero intero sezione
     *
     * @return int
     */
    public int getSezione() {
        return sezione;
    }

    /**setta il parametro intero sezione
     *
     * @param sezione
     */
    public void setSezione(int sezione) {
        this.sezione = sezione;
    }

    /**ritorna un numero intero creatore
     *
     * @return int
     */
    public int getCreatore() {
        return creatore;
    }

    /**setta il parametro intero creatore
     *
     * @param creatore
     */
    public void setCreatore(int creatore) {
        this.creatore = creatore;
    }

    /**ritorna un oggetto Stringa titolo
     *
     * @return String
     */
    public String getTitolo() {
        return titolo;
    }

    /**setta un oggetto Stringa titolo
     *
     * @param titolo
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**ritorna un oggetto Stringa immagine
     *
     * @return String
     */
    public String getImmagine() {
        return immagine;
    }

    /**setta un oggetto Stringa immagine
     *
     * @param immagine
     */
    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

    /**ritorna un oggetto String dataCreazione
     *
     * @return String
     */
    public String getDataCreazione() {
        return dataCreazione;
    }

    /**setta un oggetto String dataCreazione
     *
     * @param dataCreazione
     */
    public void setDataCreazione(String dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    /**ritorna un oggetto List listaTag
     *
     * @return Listuser
     */
    public List<?> getListaTag() {
        return listaTag;
    }

    /**setta un oggetto List listaTag
     *
     * @param listaTag
     */
    public void setListaTag(List<?> listaTag) {
        this.listaTag = listaTag;
    }

    /**ritorna un oggetto List listaIscritti
     *
     * @return Listuser
     */
    public List<?> getListaIscritti() {
        return listaIscritti;
    }

    /**setta un oggetto List listaIscritti
     *
     * @param listaIscritti
     */
    public void setListaIscritti(List<?> listaIscritti) {
        this.listaIscritti = listaIscritti;
    }

    /**ritorna un oggetto List listaModeratori
     *
     * @return Listuser
     */
    public List<?> getListaModeratori() {
        return listaModeratori;
    }

    /**setta un oggetto List listaModeratori
     *
     * @param listaModeratori
     */
    public void setListaModeratori(List<?> listaModeratori) {
        this.listaModeratori = listaModeratori;
    }

    /**ritorna un oggetto List listaKickati
     *
     * @return Listuser
     */
    public List<?> getListaKickati() {
        return listaKickati;
    }

    /**setta un oggetto List listaKickati
     *
     * @param listaKickati
     */
    public void setListaKickati(List<?> listaKickati) {
        this.listaKickati = listaKickati;
    }

    /**ritorna un oggetto List listaCommenti
     *
     * @return Listuser
     */
    public List<?> getListaCommenti() {
        return listaCommenti;
    }

    /**setta un oggetto List listaCommenti
     *
     * @param listaCommenti
     */
    public void setListaCommenti(List<?> listaCommenti) {
        this.listaCommenti = listaCommenti;
    }

    /**
     * Controlla che due oggetti siano uguali, se sì ritorna true
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Discussione)) return false;
        Discussione that = (Discussione) o;
        return getSezione() == that.getSezione() && getTitolo().equals(that.getTitolo());
    }

    /**
     *
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(getSezione(), getTitolo());
    }
}
