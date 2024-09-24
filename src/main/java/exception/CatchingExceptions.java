package exception;

public class CatchingExceptions {

    static class MuseumClosed extends RuntimeException{

    }

    static class MuseumClosedForLunch extends MuseumClosed{

    }
    public static void main(String[] args) {

        try {
            visitMuseum();
        }catch (MuseumClosedForLunch mc){ // first subclass
            System.out.println("Closed for lunch");
        }catch (MuseumClosed mc){ // second super class
            System.out.println("Closed");
        }
    }

    public static void visitMuseum(){
        boolean b = Math.random() < 0.5;

        if(b){
            throw new MuseumClosed();
        }
        throw new MuseumClosedForLunch();
    }
}
