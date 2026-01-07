public class CompareStringTypes {
    public static void main(String[] args) {

        String s1 = "Java";
        s1.concat(" Programming");
        System.out.println("String: " + s1);

        StringBuilder sb1 = new StringBuilder("Java");
        sb1.append(" Programming");
        System.out.println("StringBuilder: " + sb1);

        StringBuffer sb2 = new StringBuffer("Java");
        sb2.append(" Programming");
        System.out.println("StringBuffer: " + sb2);
    }
}
