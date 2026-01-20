import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertRecord {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO student VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setString(2, "Arpan");

            ps.executeUpdate();
            System.out.println("Record Inserted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
