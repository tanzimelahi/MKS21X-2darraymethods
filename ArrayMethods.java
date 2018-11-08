

public class ArrayMethods {
    public static int  rowSum(int[][] ary,int x) {
    	if(x>=ary.length) {
    		return 0;
    	}
    	int result=0;
    	for(int i=0;i<ary[x].length;i++) {
    		result+=ary[x][i];
    	}
    	return result;
    }
    private static int helperColumn(int[]ary,int x) {
    	if(x>=ary.length) {
    		return 0;
    	}
    	return ary[x];
    }
    public static int columnSum(int[][]ary,int x) {
    	int result=0;
    	for(int i=0;i<ary.length;i++) {
    		result+=helperColumn(ary[i],x);
    	}
    	return result;
    }
    public static int[] allRowSums(int[][]ary) {
    	int[]result=new int[ary.length];
    	for(int i=0;i<result.length;i++) {
    		result[i]=rowSum(ary,i);
    	}
    	return result;
    }
    public static int[] allColumnSums(int[][]ary) {
    	int maxLength=0;
    	for(int i=0;i<ary.length;i++) {// finds the highest column in 
    		if(ary[i].length>maxLength) {
    			maxLength=ary[i].length;
    		}
    	}
    	int[]result=new int[maxLength];
    	for(int i=0;i<maxLength;i++) {
    		result[i]=columnSum(ary,i);
    	}
    	return result;
    }
    public static boolean isRowMagic(int[][]ary) {
    	int[]comparison=allRowSums(ary);
    	int compare=comparison[0];
    	for(int i=0;i<comparison.length;i++) {
    		if(!(comparison[i]==compare)) {
    			return false;
    		}
    	}return true;
    }
    public static boolean isColumnMagic(int[][]ary) {
    	int[]comparison=allColumnSums(ary);
    	int compare=comparison[0];
    	for(int i=0;i<comparison.length;i++) {
    		if(comparison[i]==compare){
    			
    		}
    		else {
    			return false;
    		}
    	}return true;
    }

        
}

