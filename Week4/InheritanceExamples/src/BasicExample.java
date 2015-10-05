
//Example 1

//Just a regular class, it will be a SubClassEx1 once another Class extends it.
class SubClassEx1 {
    
    //Fields
    boolean subClassField;

    //Constructor
    public SubClassEx1(boolean subClassField) {
        this.subClassField = subClassField;
    }
    
    //A method
    boolean subClassMethod() {
        return true;
    }
}

/*This is a class that extend another class.
* 
* The class extending is the Super/Parent class
* The class being extended is the Sub  /Child  class
* 
* It will contain fields and methods from the child class 
* + new added fields and methods
* 
* NOTE: fields and methods can be defined as "available for extended classes" or not.
*
* */
class SupClassEx1 extends SubClassEx1 {

    //Fields and Methods from SubClassEx1 are available here.

    //Define new fields and methods, like in any normal class
    boolean supClassField;

    public SupClassEx1(boolean subClassField, boolean supClassField) {
        super(subClassField);
        this.supClassField = subClassField;
    }

    boolean supClassMethod() {
        //this contains variables from the sub class
        return subClassMethod() || this.subClassField;
    }
}

//NOTE: You cannot extend into two classes in Java unfortunately. (Multiple inheritance)

//Example2

class SubClassEx2 {

    //Fields
    private boolean pivateSubClassField;
    boolean defaultSubClassField;
    protected boolean protectedSubClassfield;
    public boolean publicSubClassField;
    
    //Methods
    private boolean privateSubClassMethod() {
        return true; 
    }
    
    boolean defaultSubClassMethod() {
        return true;
    }
    
    protected boolean protectedSubClassMethod() {
        return true;
    }
    
    public boolean publicSubClassMethod() {
        return true;
    }
}

class SupClassEx2 extends SubClassEx2 {}

//Example Interface

interface NaiveList {
    void add(int i);
    int get(int i);
}

class NaiveArrayList implements NaiveList {

    private int[] repr = new int[100];
    private int currIndx = 0;
    
    @Override
    public void add(int i) {
        repr[currIndx] = i;
        currIndx++;
    }

    @Override
    public int get(int i) {
        try {
            return repr[i];
        } catch (IndexOutOfBoundsException e) {
            return Integer.MAX_VALUE;
        }
    }
}

class NaiveLinkedList implements NaiveList {

    //Implementation details
    
    @Override
    public void add(int i) {
        //Implementation details
    }

    @Override
    public int get(int i) {
        //Implementation details
        return 0;
    }
}

class SummingClass {
    
    static int sum(NaiveList naiveList) {
        int sum = 0;
        int val;
        for (int i = 0; i < 100; i++) {
            val = naiveList.get(i);
            if (val == Integer.MAX_VALUE) {
                break;
            }
            sum += val;
        }
        return sum;
    }
    
}

//Example Abstract class
abstract class AbstractAdder {

    //Defined behaviour
    int addTwoInts(int a, int b) {
        return a + b;
    }

    //Undefined behaviour
    abstract double addTwoDoubles(double a, double b);

}

class Adder extends AbstractAdder {

    @Override
    double addTwoDoubles(double a, double b) {
        return a + b;
    }
}

public class BasicExample {

    public static void main(String[] args) {
        
        boolean val;
        
        //Example1 Basic inheritance
        
        //Instance creation as normal for both classes
        SubClassEx1 subCls = new SubClassEx1(true);
        SupClassEx1 supCls = new SupClassEx1(true, true);
        
        //SubClassEx1 works as expected
        val = subCls.subClassField;
        val = subCls.subClassMethod();
        
        //SupClassEx1 does what SubClassEx1 can do
        val = supCls.subClassField;
        val = supCls.subClassMethod();
        
        //SupClassEx1 also has the new functionality
        val = supCls.supClassField;
        val = supCls.supClassMethod();

        //Example2
        //http://stackoverflow.com/questions/215497/in-java-whats-the-difference-between-public-default-protected-and-private
        
        SubClassEx2 subCls2 = new SubClassEx2();
        SupClassEx2 supCls2 = new SupClassEx2();
        
        //Availability of SubClassEx2 fields and methods.
        val = subCls2.publicSubClassField;
        val = subCls2.protectedSubClassfield;
        val = subCls2.defaultSubClassField;
        val = subCls2.publicSubClassMethod();
        val = subCls2.protectedSubClassMethod();
        val = subCls2.defaultSubClassMethod();
        
        //Availability of SuClassEx2 fields and methods.
        val = supCls2.publicSubClassField;
        val = supCls2.protectedSubClassfield;
        val = supCls2.publicSubClassMethod();
        val = supCls2.protectedSubClassMethod();

        //Only available because in same package! Not regular usage.
        val = supCls2.defaultSubClassField;
        val = supCls2.defaultSubClassMethod();

        //Example Interface and generics
        
        //Two classes that implement the same interface. Type is Interface Type
        NaiveList naiveArrayList = new NaiveArrayList();
        NaiveList naiveLinkedList = new NaiveLinkedList();
        
        //Both have the same interface for usage, yet different implementation details.
        naiveArrayList.add(1);
        naiveArrayList.get(1);
        naiveLinkedList.add(1);
        naiveLinkedList.get(1);
        
        //Through generics any class that Implements NaiveList can be entered into this method.
        SummingClass.sum(naiveArrayList);
        SummingClass.sum(naiveLinkedList);
    }
}
