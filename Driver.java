
public class Driver{

    public static void main(String[]args) {
    	int[][]a= {{1,1,1},{1,1,1},{1,1,1}};
    	int[][] test= {{1,2,34},{1,2,3,4,5},{1,3,4,3,343,343}};
    	System.out.println(ArrayMethods.rowSum(test,0));
    	System.out.println(ArrayMethods.rowSum(test,1));
    	System.out.println(ArrayMethods.rowSum(test,2));
    	System.out.println("this is the predictions of allRowSums");
    	for(int i=0;i<test.length;i++) {
    		System.out.println(ArrayMethods.allRowSums(test)[i]);
    	}
    	System.out.println("test for allColumnSums");
    	for(int i=0;i<6;i++) {
    		System.out.println(ArrayMethods.columnSum(test,i));
    	}
    	System.out.println("this is the prediction of allcolumnSums");
    	for(int i=0;i<6;i++) {
    		System.out.println(ArrayMethods.allColumnSums(test)[i]);
    	}
    	System.out.println("here is the test for magicRow");
    	System.out.println(ArrayMethods.isRowMagic(a));
    	System.out.println("here is the test for magicColumn");
    	System.out.println(ArrayMethods.isColumnMagic(test));
    }
}
