public class StringBuilderOperations {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        sb.insert(5, "Language ");
        sb.delete(5, 14);

        System.out.println(sb);
    }
}
