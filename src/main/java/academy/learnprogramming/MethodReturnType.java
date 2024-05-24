package academy.learnprogramming;

public class MethodReturnType {

    public void jump() {
    } // return type void

    public void jump2() {
        return;
    }

    public String jump3() {
        return "";
    }

    // public String jump4(){return;} // does not compile because no return statement
    // public jump5(){} // does not compile, no return type specified
    /* Does not compile
    String jump6(int a){
        if(a==0)return "";
    }*/
    String jump6(int a) {
        if (a == 0) return "";
        return "abc";
    }

    int getInt(){
        return 9;
    }

    int getLong(){
        return (int) 9L;
    }

    int expanded(){
        // int temp = 10;
        // return temp;
        return 10;
    }

    boolean isTrue(){
        return 5 < 10;
    }

    // public void 2test(){} // does not compile
    // public void void(){} // does not compile
    public void $test(){}
    public void _test(){}
}
