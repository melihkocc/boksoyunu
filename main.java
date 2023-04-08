package nesneyonelimli.boks;

public class main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Hakan", 20, 100, 90, 50);
        Fighter f2 = new Fighter("Ahmet", 15, 120, 100, 40);
        Match match = new Match(f1, f2, 90, 150);
        match.MatchStart();
    }
    
}
