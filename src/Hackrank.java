import java.util.*;

public class Hackrank {

    public static void main(String[] args) {

        List<Integer> arr=new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(6);
        arr.add(1);
        arr.add(10);


        System.out.println( workbook( 5,  3, arr));

    }

    public static int workbook(int n, int k, List<Integer> arr) {
            int pageNo=1;
            int count=0;

            for(int i=0; i<arr.size(); i++){
                for(int j=1; j<=arr.get(i); j++){

                    if(j==pageNo)
                        count ++;
                    if(j==arr.get(i) || j%k==0)
                        pageNo++;
                }
            }
            return count;
        }


}
