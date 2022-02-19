public class Calculator extends Thread {
    public int[] numbers;
    public int sum;
    public String name;
    public void run() {
        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println(name + "\t" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
