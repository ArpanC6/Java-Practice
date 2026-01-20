import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteRecord {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "DELETE FROM student WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 1);

            ps.executeUpdate();
            System.out.println("Record Deleted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
