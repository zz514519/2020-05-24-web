import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//动态效果
//根据QueryString 的不同，显示不同的内容
//现实的内容实在运行时间决定的
public class HelloServlet extends HttpServlet {

    //对应HTTP中的get请求(处理逻辑)
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name  = req.getParameter("name");    //对于GET方法来说，就是从QueryString中获取
                                                                                                                //获取 QueryString 中 key 是 name 对应的value值
        if (name ==null){
            name = "世界";
        }
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("<h1>GET</h1>");
        resp.getWriter().println("<p>你好"+name+"</p>");
    }


    //对应HTTP中的post请求（处理逻辑）
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("<h1>POST</h1>");
        resp.getWriter().println("<p>你好世界</p>");

    }
}
