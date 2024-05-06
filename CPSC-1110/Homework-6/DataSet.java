/**
 * 
 * Author: Noah Winn
 * ID: QWX746
 * Version: 4/13/2022
 * 
 */

/**
   Computes the maximum of a set of data values.
*/
public class DataSet{
    private int[] values;
    private int first;
    private int last;
    /**
        Constructs a DataSet object.
        @param values the data values
        @param first the first value in the data set
        @param last the last value in the data set
    */
    public DataSet(int[] values, int first, int last){
        this.values = values; 
        this.first = first;
        this.last = last;
    }
    /**
        Gets the maximum in the set of data values
        @return the maximum value in the set
    */
    public int getMaximum(){
        DataSet data = new DataSet(values, first+1, last);
        int max = last;
        while(data.first < values.length){
            if(data.first - 1 == 0){
                data.last = values[0];
            }
            if(data.last < values[data.first]){
                data.last = values[data.first];
            }
            return data.getMaximum();
        }
        return max;
    }
}