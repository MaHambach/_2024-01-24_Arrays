public class Main {
    public static void main(String[] args){
        // Step 1
        int[] numbers = new int[10];
        for(int i=1; i<11; i++){
            numbers[i-1]=i;
        }
        // Step 2
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }

        //Step 3
        int largestNumber;
        largestNumber = numbers[0];
        for(int number: numbers){
            if(largestNumber < number){
                largestNumber = number;
            }
        }

        //Step 4
        int[] numbers2 = {11,12,13,14,15,16,17,18,19,20};

        //Step 5
        int[] elementwiseSum = new int[10];

        for(int i=0; i<10 ; i++){
            elementwiseSum[i] = numbers[i] + numbers2[i];
        }

        System.out.println(   "1. Array  2. Array  3.Array");
        for(int i=0; i<numbers.length; i++){
            System.out.format(" %3d       %3d       %3d\n", numbers[i], numbers2[i], elementwiseSum[i]);
        }
        System.out.println("Sum of 1. Array: "+sum);
        System.out.println("Largest in 1. Array: "+largestNumber);


    }
}
