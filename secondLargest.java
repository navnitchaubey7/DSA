package arrayQuestion;
// ----------------------------QUESTION FIND THE SECOND LARGEST ELEMENT IN AN ARRAY

public class secondLargest {
    public static int secondLargestt(int[]arr,int n){
        // HERE WE TRAVERSE THE ARRAY AND FIND THE FIRST MAXIMA 
        // APPROCH
        // ASSUME first as the largest TRAVERSE the array apply concdition arr[i]>largest GET the largest
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }
        }
        // MAKE COMPARISON WITH LARGEST AND GET THE SECOND LARGEST
        int secondLargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest&&arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==secondLargest){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[]arr={1,5,2,4,8,6,6};
        int n=arr.length;
        int result=secondLargestt(arr, n);
        System.out.println(result);
        
    }
    
}
