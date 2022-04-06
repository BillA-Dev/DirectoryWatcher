import java.util.ArrayList;
import java.util.Arrays;

public class addingCommas {

    public static void main(String[] args) {

//< 0
        String[] arr = {"Bob", "Ding", "Apple", "Forsaken", "Zenith"};
        for(int i = 0; i < arr.length; i++){
                String low = arr[i];
                int index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j].compareTo(low) < 0){
                    low = arr[j];
                    index = j;
                }
            }

            if(index != i) {

                String temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }

System.out.println(Arrays.toString(arr));


       }


    }

