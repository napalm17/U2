package C;

public class Main {
    public static void main(String[] args) {
        Director myDirector = new Director("David","Fincher", new Date(1971, 23, Month.APRIL));
        Studio myStudio = new Studio("Warner Bros", new Address("a","a", 1), new Date(1971, 23, Month.AUGUST));
        //Actor[] myCast = {myDirector};
        //Film myFilm = new Film("Se7en", myDirector, myCast, new Date(1995, 15, Month.APRIL), new Duration(120, 55), myStudio);

    }
}
