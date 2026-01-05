public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int target = 50;
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Found at position: (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
