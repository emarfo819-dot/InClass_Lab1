import java.util.Scanner;
import java.util.Arrays;


public class DiscussionClassOne {
    public static void main(String[]  args){
        Scanner input=new Scanner(System.in);
        int[] numbers={2,5,8,3,4,6,10,15,20,1,11};
        // TASK 1
        System.out.println("Enter a value: ");
        int value=input.nextInt();//Let i represent the value entered
        int index=-1;//default index for  a value not in array
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] == value) {
                index = i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Number not in array");
        }
        else{
            System.out.println("The index of the number " + value + " is "+ index );
        }


        // TASK 2
        System.out.println("Please enter first value: ");
        int num1=input.nextInt();
        System.out.println("Please enter second value: ");
        int num2=input.nextInt();
        int index1=0;
        int index2=0;
        boolean swappedValues=false;
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] == num1) {
                index1 = i;
                swappedValues=true;

            }
            else if(numbers[i]==num2){
                index2 = i;
                swappedValues=true;


            }
        }
        if(swappedValues){
            numbers[index1]=num2;
            numbers[index2]=num1;
        }

        System.out.println(Arrays.toString(numbers));


//    TASK 3 (Ascending order)
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    int tempNumber=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=tempNumber;
                }
            }
        }
        System.out.println("The sorted array of numbers in ascending order is "+Arrays.toString(numbers));

//        (Descending order)
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]>numbers[i]){
                    int tempNumber2=numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=tempNumber2;
                }
            }
        }
        System.out.println("The sorted array of numbers in descending order is "+Arrays.toString(numbers));


//      TASK 4
        System.out.println("Enter a number you want to find in the array: ");
        int num3=input.nextInt();

        boolean found=false;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==num3){
                found=true;
                System.out.println("The number "+num3+ " is found at "+i);
                break;
            }

        }
        if(!found){
            System.out.println("The number is not found in array.");
        }


//        TASK 5
        int[] numbers1={1, 2, 3, 4, 5, 6, 8, 10, 11, 15, 20};
        System.out.println("Please enter a number to be found: ");
        int num4=input.nextInt();
        int low=0;
        int high=numbers1.length-1;
        boolean found1=false;

        while(low <= high){
            int mid=(low+high)/2;
            if(numbers1[mid] == num4){
                System.out.println("Number "+num4+ " found at index "+mid);
                found1=true;
                break;
            }else if(numbers1[mid] < num4){
               low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(!found){
            System.out.println("Value not found");
        }
        input.close();

    }

}


