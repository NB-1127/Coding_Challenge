public class CountDuplicates {

    //Given an integer array nums, return true 
    //if any value appears at least twice in the array, and return false if every element is distinct.

    public static boolean dublicateCaount(int nums[]){

        for (int i = 0; i < nums.length; i++) {
            
            for (int j = i+1; j < nums.length; j++) {

                if (nums[i]==nums[j]) {

                    return true;
                    
                }
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        int num[]={1,2,3,4};
        int numss[]={1,1,1,3,3,4,3,2,4,2};

       System.out.println(dublicateCaount(nums));
       System.out.println(dublicateCaount(num));
       System.out.println(dublicateCaount(numss));
    }
    
}
