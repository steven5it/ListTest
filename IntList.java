

public class IntList {
    
    // class constant
    private static final int DEFAULT_CAP = 10;
    
    // instance variables
    private int sizeOfList;
    private int[] values;
    
    // pre: none
    // post: create an empty list
    public IntList() {
        this(DEFAULT_CAP);
    }
    
    // pre: initialCap >= 0
    // post: create an empty list with
    // capacity = initialCap
    public IntList(int initialCap) {
        assert initialCap >= 0 : "initialCap must be >= 0, " 
            + initialCap;
        values = new int[initialCap];
        sizeOfList = 0;
    }
    
    // pre: none
    public int size() {
        return sizeOfList;
    }
    
    // default add
    // pre: none
    // post: size() = old size() + 1, 
    // newValue is the last element in the list
    public void add(int newValue) {
        if(sizeOfList == values.length) {
            // no extra capacity
            resize();
        }
        
        // general case
        values[sizeOfList] = newValue;
        sizeOfList++;
    }

    private void resize() {
        int[] temp = new int[values.length + 10];
        
        for(int i = 0; i < values.length; i++) 
            temp[i] = values[i];
        
        values = temp;
    }
}
