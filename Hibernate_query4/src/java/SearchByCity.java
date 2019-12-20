    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    import POJOS.Employee;
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.util.List;
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import org.hibernate.Query;
    import org.hibernate.Session;
    import org.hibernate.SessionFactory;
    import org.hibernate.cfg.Configuration;

    /**
     *
     * @author studentadmin
     */
    public class SearchByCity extends HttpServlet {

        /**
         * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
         * methods.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");

              String CityName=request.getParameter("CityName");
            try (PrintWriter out = response.getWriter()) 
            {

                Configuration c=new Configuration();

                c.configure("hibernate.cfg.xml");

                SessionFactory sf=c.buildSessionFactory();
                Session s=sf.openSession();
                out.println("Session");


                String hql="FROM Employee E where E.address.cityName='"+CityName+"'";

                out.println("Query");
                Query query=s.createQuery(hql);
                List<Employee> results=query.list();
                out.println(results);
                
                if(results==null)
                {
                   out.println("No Data Found");
                }

                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet SearchByCity</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Search BY City"+CityName+"</h1>");
                out.println("<table border='1'>");
                for(Employee EMP:results)
                {
                  out.println("<tr>");
                  out.println("<td>");
                  out.println(EMP.getFirstName());
                  out.println("</td>");

                  out.println("<td>");
                  out.println(EMP.getLastName());
                  out.println("</td>");

                }    



                out.println("<table>");


                out.println("</body>");
                out.println("</html>");
            }
        }

        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo() {
            return "Short description";
        }// </editor-fold>

    }
