// 8.13  Create class IntegerSet backed by a boolean array (indices 0-100). Implement union and intersection (static), insertElement, deleteElement, toString, and isEqualTo.
public class IntegerSet {
    private boolean[] set;
 
    public IntegerSet() {
        set = new boolean[101];
    }
 
    public static IntegerSet union(IntegerSet a, IntegerSet b) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.set.length; i++) {
            result.set[i] = a.set[i] || b.set[i];
        }
        return result;
    }
 
    public static IntegerSet intersection(IntegerSet a, IntegerSet b) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.set.length; i++) {
            result.set[i] = a.set[i] && b.set[i];
        }
        return result;
    }
 
    public void insertElement(int k) { set[k] = true; }
    public void deleteElement(int m) { set[m] = false; }
 
    public boolean isEqualTo(IntegerSet other) {
        for (int i = 0; i < set.length; i++) {
            if (set[i] != other.set[i]) return false;
        }
        return true;
    }
 
    public String toString() {
        StringBuilder result = new StringBuilder();
        boolean any = false;
        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                result.append(i).append(" ");
                any = true;
            }
        }
        return any ? result.toString().trim() : "---";
    }
}

