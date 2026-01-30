public class StudentDTO {

    @NotBlank
    private String name;

    @Min(1)
    private int age;

    // getters & setters
}
