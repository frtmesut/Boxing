package Boxing;

public class Main {
    public static void main(String[] args){
        Fighter f1 = new Fighter("Elon", 11, 120, 100,47);
        Fighter f2 = new Fighter("Mark", 18, 85 ,85,30);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
