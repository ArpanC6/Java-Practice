public class WordCount {
    public static void main(String[] args) {
        String str = "Java is very powerful";
        String[] words = str.split(" ");

        System.out.println("Word Count = " + words.length);
    }
}
