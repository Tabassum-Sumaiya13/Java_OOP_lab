public class AdvancedCalculator extends Calculator// is a Child of Calculator class
{
    public int[] numbers;

    public AdvancedCalculator(int i, int j, int[] numbers) {
        super();

        this.numbers = numbers;
    }

    @Override
    public int sum() {
        int sum = super.sum();
        for (int i : numbers) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        AdvancedCalculator c = new AdvancedCalculator(1, 2, new int[]{3, 4, 5});
        System.out.println(c.subtract());
        System.out.println(c.sum());
    }
}
