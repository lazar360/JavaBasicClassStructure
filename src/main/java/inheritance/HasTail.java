package inheritance;

public interface HasTail {//always public abstract
    public static final int DEFAULT_TAIL_LENGTH2 = 2;
    int DEFAULT_TAIL_LENGTH = 2;

    int getTailLength();
    // int getTailLength2(){}; // does not compile because abstract method can not have a body

}
