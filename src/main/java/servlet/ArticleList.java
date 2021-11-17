package servlet;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Article;

@WebServlet(urlPatterns= "/liste-articles")
public class ArticleList extends HttpServlet {
	
	private String nomArticle;

	public ArticleList () {}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		
		
	
		req.getRequestDispatcher("/WEB-INF/article-list.jsp").forward(req, resp);
	}
	
	
	}
	
	
	