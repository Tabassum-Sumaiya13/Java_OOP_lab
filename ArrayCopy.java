public class ArrayCopy {
    public static void main(String[] args) {
        
        int[] arr1 = new int[]{10,11,12,13,14};
        int[] arr2 = new int[]{1, 2, 3};
        System.arraycopy(arr2, 1, arr1, 0, 3);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}

