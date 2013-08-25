
public class ListTest {
    public static void main(String[] args) {
        IntList list1 = new IntList();
        IntList list2 = new IntList(10000);
        // IntList list3 = new IntList(-10);
        IntList list4 = new IntList(10000);
        
        for(int i = 0; i < 20; i++) {
            list1.add(i * 2);
            System.out.println(list1.size());
        }
        
        Stopwatch st = new Stopwatch();
        int n = 5000;
        for(int i = 0; i < 8; i++) {
            list1 = new IntList();
            st.start();
            for(int j = 0; j < n; j++)
                list1.add(j);
            st.stop();
            System.out.println(st);
            n *= 2;
        }
    }
}
