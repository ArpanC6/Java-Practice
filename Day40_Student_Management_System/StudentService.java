@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student save(StudentDTO dto) {
        Student s = new Student();
        s.setName(dto.getName());
        s.setAge(dto.getAge());
        return repo.save(s);
    }

    public List<Student> search(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }
}
