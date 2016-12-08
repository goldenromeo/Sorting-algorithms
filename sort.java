/**
 * Created by rommeltrejo on 2/24/16.
 *12/07/16 cleaned up extra spaces
 *12/07/16 added rules
 *
 *Conventions:
 *---------------------------------------------------------------------------------
 *                                  code:
 *functions must be static
 *
 *---------------------------------------------------------------------------------
 *                                 naming:
 *sort algorithms must be named:        <sort_name>_sort
 *helper functions must be named:       <sort_name>_<helper_function_name>_helper
 *---------------------------------------------------------------------------------
 */
public class sort  {
public static Comparable[] insertion_sort (Comparable[] array){

//initial loop on insertion sort  array= 0_1_2_3_4_5_6... i is place on array; array  starts at 0
    //if array is empty then length = o,so loop is never executed
    for (int i = 1; i < array.length;i++ ){
        /**
         * second loop; k is array index like above and > i
         * k goes down
         * this part of the method starts at i and checks that everything below(inclusive)
         * it is in decresing order
         *
         * e.g.  2,3,1
         * pass i=1: 2<3 : do nothing
         * pass i=2: 3 !<1
         *  k=2:  swap(3,1), 2,1,3,k--
         *  k=1:  2 !< 1; swap(2,1), 1,2,3
         *  (k !>= 1) exit loop
         */

        for ( int k = i; k>=1 && array[k].compareTo(array[k-1]) <0 ;k-- )
        {
            Comparable temp = array[k];
            array[k]=array[k-1];
            array[k-1]=temp;
            temp=null;
            }
        }

    return array;

    }
    
    
    

}
