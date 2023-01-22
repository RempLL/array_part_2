public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int sum1 = 0;
        int [] array1 = generateRandomArray();
        for (int j : array1) {
            sum1+=j;
        }
        System.out.println("Сумма трат за месяц составила "+ sum1+" рублей.");
        System.out.println();

        System.out.println("Задача 2:");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int [] array2 = generateRandomArray();
        for (int j : array2) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+min
                +" рублей. Максимальная сумма трат за день составила "+max+" рублей.");
        System.out.println();

        System.out.println("Задача 3:");
        int[] array3 = generateRandomArray();
        double sum3 = 0;
        for(int j:array3){
            sum3+=j;
        }
        System.out.println("Средняя сумма трат за месяц составила "+ sum3/array3.length+" рублей.");
        System.out.println();

        System.out.println("Задача 4:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char words;
        int a = reverseFullName.length;
        /*for(int i = 0;i< reverseFullName.length;i++){
           System.out.print(reverseFullName[reverseFullName.length-i-1]);
        } Легкий вариант*/

        //Изменение массива
        for(int i = 0;i< a/2;i++){
            words=reverseFullName[a-i-1];
            reverseFullName[a-i-1]=reverseFullName[i];
            reverseFullName[i]=words;
        }
        for (char j : reverseFullName) {
            System.out.print(j);
        }
    }
}