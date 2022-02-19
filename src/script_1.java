public class script_1 {
    int[] numbers; // define an empty list

    // 1. to create a function first we need to show the type of the output (public int).
    // 2. and specify the type of the argument we need to pass.
    public int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Hello!");
        script_1 first = new script_1(); // create new instance

        int[] nuts = new int[]{1, 2, 3, 4, 5}; // create a new list with values
        first.numbers = new int[]{1, 2, 3, 4, 5, 6}; // add values to the empty list

        System.out.println(first.sum(nuts)); // call the sum function and pass a int list
        System.out.println(first.sum(first.numbers));

        Calculator c1 = new Calculator(); // create new instance of the module
        Calculator c2 = new Calculator();

        c1.numbers = new int[]{1, 2, 3, 4, 5};
        c2.numbers = new int[]{1, 2, 3, 4, 5, 6};

        c1.name = "Thread-One";
        c2.name = "Thread-Two";

        c1.run(); // call the run function in Calculator module
        c2.run();

    }
}
