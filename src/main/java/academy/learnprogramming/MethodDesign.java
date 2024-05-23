package academy.learnprogramming;

public class MethodDesign {

    public void jump(){}
    void jump2(){}
    public final void jump3(){}
    public static final void jump4(){}
    public final static void jump5(){} // good practice
    final public static void jump6(){}
    final static public void jump7(){}
    static final public void jump8(){}

    // !!!!!!!!!!!! Do not touch the return type !!!!!!!!!
    // void public jump(){} // does not compile
    // void public void jump(){} // does not compile
    // static final void public jump // does not compile
    // public String void jump // does not compile
    // public array void jump // does not compile

}
