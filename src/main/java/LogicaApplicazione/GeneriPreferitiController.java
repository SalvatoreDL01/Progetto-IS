package LogicaApplicazione;

import ServiziEStorage.UtenteRegistrato;
import ServiziEStorage.UtenteRegistratoDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "GeneriPreferitiController", value = "/GeneriPreferitiController")
public class GeneriPreferitiController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String genere = request.getParameter("genere");
        String azione = request.getParameter("azione");
        HttpSession session = request.getSession();
        if(azione.equals("rimuovi")){
            UtenteRegistratoDAO.removeGenere((UtenteRegistrato) session.getAttribute("user"), genere);
        }
        else{
            UtenteRegistratoDAO.addGenere((UtenteRegistrato) session.getAttribute("user"), genere);
        }

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("UserPage.jsp");
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
