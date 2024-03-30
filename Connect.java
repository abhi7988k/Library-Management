import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

    Connection co;
    Connect(){
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            co= DriverManager.getConnection("jdbc:mysql://localhost:3306/Login_page?useSSL=false","root","abhi@123");
            System.out.println("Sucess");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }


}
