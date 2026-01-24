@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository repo;

    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Student> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public String add(@RequestBody Student s) {
        repo.save(s);
        return "Student added";
    }

    @PutMapping
    public String update(@RequestBody Student s) {
        repo.update(s);
        return "Student updated";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repo.delete(id);
        return "Student deleted";
    }
}
