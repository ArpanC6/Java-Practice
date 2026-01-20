import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateRecord {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE student SET name=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "UpdatedName");
            ps.setInt(2, 1);

            ps.executeUpdate();
            System.out.println("Record Updated");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
