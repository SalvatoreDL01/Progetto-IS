package LogicaApplicazione.GestioneUtente.Service;

import ServiziEStorage.DAO.EliminazioneDAO;
import ServiziEStorage.DAO.UtenteRegistratoDAO;
import ServiziEStorage.Entry.Discussione;
import ServiziEStorage.Entry.Eliminazione;
import ServiziEStorage.Entry.UtenteRegistrato;

import java.util.ArrayList;

public class AutenticazioneService {

    static public void banUtente(int idUserToBan){
        ArrayList<UtenteRegistrato> listU= UtenteRegistratoDAO.retriveAll();

        for (UtenteRegistrato u: listU) {
            if(u.getId()==idUserToBan){
                Eliminazione e=new Eliminazione(u.getId(), u.getUsername(), u.getEmail());
                EliminazioneDAO.doSave(e);
                UtenteRegistratoDAO.remove(idUserToBan);
                System.out.println("L'utente è stato rimosso correttamente");
            }
        }
    }

    static public void kickUtente(int idUserToKick, Discussione discussione){
        ArrayList<UtenteRegistrato> listU=UtenteRegistratoDAO.retriveAll();

        for (UtenteRegistrato u: listU) {
            if(u.getId()==idUserToKick){
                UtenteRegistratoDAO.removeUtente(discussione, u);
                System.out.println("L'utente è stato kickato dalla conversazione");
            }
        }
    }
}
