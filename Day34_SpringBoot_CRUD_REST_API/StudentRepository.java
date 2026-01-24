@Repository
public class StudentRepository {

    private final JdbcTemplate jdbcTemplate;

    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Student> findAll() {
        return jdbcTemplate.query(
            "SELECT * FROM student",
            (rs, i) -> new Student(rs.getInt("id"), rs.getString("name"))
        );
    }

    public int save(Student s) {
        return jdbcTemplate.update(
            "INSERT INTO student VALUES (?, ?)",
            s.getId(), s.getName()
        );
    }

    public int update(Student s) {
        return jdbcTemplate.update(
            "UPDATE student SET name=? WHERE id=?",
            s.getName(), s.getId()
        );
    }

    public int delete(int id) {
        return jdbcTemplate.update(
            "DELETE FROM student WHERE id=?",
            id
        );
    }
}
