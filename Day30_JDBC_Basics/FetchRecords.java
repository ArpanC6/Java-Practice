import java.sql.*;

public class FetchRecords {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " + rs.getString("name")
                );
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
