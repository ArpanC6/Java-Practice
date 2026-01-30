@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student add(@Valid @RequestBody StudentDTO dto) {
        return service.save(dto);
    }

    @GetMapping("/search")
    public List<Student> search(@RequestParam String name) {
        return service.search(name);
    }
}
