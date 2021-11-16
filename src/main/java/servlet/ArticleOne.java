package servlet;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

@WebServlet(urlPatterns ="/user-info") // declarer mon servlet via annotations
public class ArticleOne extends HttpServlet {
	
	public ArticleOne () {
		
	}
	@Override 
	protected void doGet(HttpServletRequest req, 
						HttpServletResponse resp) 
						throws ServletException, IOException{ 
		
		HttpSession session = req.getSession(); 
		User user = (User) session.getAttribute("USER");
		
		req.setAttribute("utilisateur", user.getUsername());
		req.setAttribute("nbArticles", user.getNbArticles());
		req.setAttribute("adresseMail", user.getEmailAdress());
		req.setAttribute("estAdmin", user.isAdmin());
		
		req.getRequestDispatcher("/WEB-INF/user-info.jsp").forward(req, resp);
		}
		
		
	
		
	
	
//		ServletOutputStream out = resp.getOutputStream();
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<h1> Informations user </h1>");
//		out.println("<p> Username : " + user.getUsername() + "<br></p>");
//		out.println("<p> Nombre d'articles : " + user.getNbArticles() + "<br></p>");
//		out.println("<p> Adresse mail  : " + user.getEmailAdress() + "<br></p>");
//		out.println("<p> Rôle : " + user.isAdmin() + "<br></p>");
//		out.println("<a href='logout'> Me déconnecter <br></a>");
//		out.println("</body>");
//		out.println("</html>");

	}



	

