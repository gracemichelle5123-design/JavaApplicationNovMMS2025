
public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet setA = new IntegerSet();
        setA.insertElement(1);
        setA.insertElement(3);
        setA.insertElement(5);
 
        IntegerSet setB = new IntegerSet();
        setB.insertElement(3);
        setB.insertElement(4);
        setB.insertElement(5);
 
        System.out.println("setA: " + setA);
        System.out.println("union: " + IntegerSet.union(setA, setB));
        System.out.println("intersection: " + IntegerSet.intersection(setA, setB));
        setA.deleteElement(3);
        System.out.println("setA after delete: " + setA);
    }
}

