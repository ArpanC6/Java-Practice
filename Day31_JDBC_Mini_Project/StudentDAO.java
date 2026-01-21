import java.sql.*;

public class StudentDAO {

    public void insertStudent(Student s) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO student VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());

            ps.executeUpdate();
            con.close();

            System.out.println("Student Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {
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
