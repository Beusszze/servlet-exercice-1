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
import model.Article;
import model.User;

@WebServlet(urlPatterns ="/first-article") // declarer mon servlet via annotations
public class ArticleOne extends HttpServlet {
	
	public ArticleOne () {
		
	}
	@Override 
	protected void doGet(HttpServletRequest req, 
						HttpServletResponse resp) 
						throws ServletException, IOException{ 
		
		HttpSession session = req.getSession(); 
		User user = (User) session.getAttribute("USER");
		
	
		User userFirstArticle = new User ("ye", 1, "ye@yezus.com", false); 
		Article firstArticle = new Article ("titre de mon article 1", "blablabla", userFirstArticle); // simule la récupération de données via bdd
		
		
		req.setAttribute("articleTitle", firstArticle.getTitre());
		req.setAttribute("articleContent", firstArticle.getContenu());
		req.setAttribute("articleUser", firstArticle.getUser());
		req.getRequestDispatcher("/WEB-INF/first-article.jsp").forward(req, resp);
		}

}


	

