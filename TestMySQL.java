import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;

public class TestMySQL {

    public static void main(String[] args)
        throws InterruptedException {
            int i;

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            for (i = 1; i <= 18000; i++) {
                Date date = new Date(System.currentTimeMillis());

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.0.50:3306/demo?useSSL=false","root","Huawei@12");

			Statement stmt = con.createStatement();

			stmt.executeUpdate("insert into logs values ('" + formatter.format(date) + "')");

			con.close();

		} catch(Exception e) {
			System.out.println(e);
		}

                System.out.println("Event sent to the database at " + formatter.format(date));
                Thread.sleep(2000);
            }
    }
}

