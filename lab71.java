import java.util.*;



class lab71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] b = new int[4];
            for (int i = 0; i <= b.length; i++) {
                int x = scanner.nextInt();
                if (i == b.length) {
                    throw new ArrayIndexOutOfBoundsException("Array index exceeded");
                }else{
                b[i] = x;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" " + e);
        }
    }
}
