// import java.util.*;
public class Array_12 {
     public static int linearsearch(int numbers[],int key){

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
            
        }
        public static int getlargest(int numbers[]){
            int largest=Integer.MIN_VALUE;
            int smallest=Integer.MAX_VALUE;

            for(int i=0;i<numbers.length;i++){
                if(largest<numbers[i]){
                    largest=numbers[i];

                }
                if(smallest>numbers[i]){
                    smallest=numbers[i];
                }
            }
            System.out.println("smallest no is "+smallest); 
            return largest;
        }

        public static int binarysearch(int numbers[],int key){
            int start=0;
            int end=numbers.length-1;
            while(start<=end){

                int mid=(start+end)/2;
                if(numbers[mid]==key){
                    return mid;
                }
                if(numbers[mid]>key){
                    end=mid-1;
                }
                if(numbers[mid]<key){
                    start=+1;
                }
            }
            return -1;
        }

        public static void reverse(int numbers[]){
            int first=0,last=numbers.length-1;
            while(first<last){
                // swap
                int temp=numbers[last];
                numbers[last]=numbers[first];
                numbers[first]=temp;

                first++;
                last--;


            }
        }

        public static void printpairs(int numbers[]){
            for(int i=0;i<numbers.length;i++){
                int curr=numbers[i];//2,4...
                for (int j=i+1;j<numbers.length;j++){
                    System.out.print("("+curr+","+numbers[j]+") ");

                }
                System.out.println();
            }
        }
        public static void printsubarray(int numbers[]){
            int maxsum=Integer.MIN_VALUE;
            int minsum=Integer.MAX_VALUE;
            int ts=0;
            for (int i=0;i<numbers.length;i++){
                int start=i;
                for (int j=i;j<numbers.length;j++){
                    int end=j;
                      int subarraysum=0;
                    for(int k=start;k<=end;k++){
                        System.out.print(numbers[k]+" "); 
                        subarraysum=subarraysum+numbers[k];
                        ts++;
                    }
                    if (subarraysum>maxsum){
                        maxsum=subarraysum;
                    }
                    if(subarraysum<minsum){
                        minsum=subarraysum;
                    }
                    System.out.println();   
                    System.out.print("subarray sum"+subarraysum);    
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("total subarray "+ts);
            System.out.println("max subarray sum"+maxsum);
            System.out.println("min subarray sum"+minsum);
        }
        public static void prifixmaxsum(int numbers[]){
            int currsum=0;
            int maxsum=Integer.MIN_VALUE;
            int prefix[]=new int[numbers.length];

            prefix[0]=numbers[0];
            //calculate prefix array
            for(int i=1;i<prefix.length;i++){
                prefix[i]=prefix[i-1]+numbers[i];
            }

            for (int i=0;i<numbers.length;i++){
                int start=i;
                for (int j=i;j<numbers.length;j++){
                    int end=j;
                    
                    currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];

                    if (currsum>maxsum){
                        maxsum=currsum;
                    }
                    
                }
            }
            System.out.println("max subarray sum "+maxsum);
        }
        public static void kadanemaxsum(int numbers[]){
            int currsum=0;
            int maxsum=Integer.MIN_VALUE;
            for(int i=0;i<numbers.length;i++){
                currsum+=numbers[i];

                // if (currsum>maxsum){
                //     maxsum=currsum;
                // }
                maxsum=Math.max(maxsum,currsum);
                if(currsum<0){
                    currsum=0;
                }
            }
            System.out.println("max kanes subarray sum"+maxsum);

            }
        
    public static void main(String arg[]){
        // int marks[]=new int[100];
        // Scanner sc=new Scanner(System.in);
        // //int phy;
        // // phy=sc.nextInt();

        // marks[0]=sc.nextInt();//phy
        // marks[1]=sc.nextInt();//chem
        // marks[2]=sc.nextInt();//math

        // System.out.println("phy :"+marks[0]);
        // System.out.println("chem :"+marks[1]);
        // System.out.println("math :"+marks[2]);

        // // we can update value simply by
        // marks[0]=69;//like this

        // // for array length
        // System.out.print(marks.length);

       int numbers[]={2,4,6,8,10,12,14,16};
    //    int key=10;

        //    int index=linearsearch(numbers, key);
        //    if(index==-1){
        //     System.out.println("not found");
        //    }
        //    else{
        //     System.out.println("found"+index);
        //    }

        //    int largeno=getlargest(numbers);
        //    System.out.println("largest no in array "+largeno);

        //    int bn=binarysearch(numbers, key);
        //    System.out.println("bin search "+bn);

        //     reverse(numbers);
        //     //print
        //     for( int i=0;i<numbers.length;i++){
        //         System.out.print(numbers[i]+" ");
        //    }

        // printpairs(numbers);

        printsubarray(numbers);
        // prifixmaxsum(numbers);
        kadanemaxsum(numbers);
        
    }
}

