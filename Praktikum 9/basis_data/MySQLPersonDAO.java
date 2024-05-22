import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(person person) throws Exception{
        String name = person.getName();

        //koneksi ke db
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo","root","");

        //quey
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi
        con.close();
    }
}