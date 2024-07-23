class MultiCatchExample {

    public static void main(String[] args) {
        int[] array = new int[5];
        int result = 0;

        try {
            // Trigger ArithmeticException
            result = 10 / 0;

            // Trigger ArrayIndexOutOfBoundsException
            array[10] = 50;

            // Trigger NullPointerException
            String str = null;
            System.out.println(str.length());

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
    }
}