import java.util.ArrayList;

public class MulDiaArrayList {
    

    public static void main(String[] args) {

        // Multidimetional Arraylist Syntax
        ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>(); // multidimentional arraylist

        ArrayList<Integer> list1 = new ArrayList<>(); //first

       
        mainlist.add(list1);

        ArrayList<Integer> list2= new ArrayList<>(); // Second

        
        mainlist.add(list2);

        ArrayList<Integer> list3= new ArrayList<>(); // Third

        
        mainlist.add(list3);

        for (int i = 1; i <=5; i++) {
            list1.add(i*1); // 1 2 3 4 5
            list2.add(i*2); // 2 4 6 8 10
            list3.add(i*3); // 3 6 9 12 15
        }


        for (int i = 0; i <mainlist.size(); i++) {
            ArrayList<Integer> currlist= mainlist.get(i);
            for (int j = 0; j <currlist.size(); j++) {
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
            
        }
        System.out.println(mainlist);

    }
}
