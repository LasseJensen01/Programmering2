import java.util.concurrent.TimeUnit;

public class Main {

    // Tjek Projects for TeamGitWorkFlow
    public static void main(String[] args) throws InterruptedException {
        String s = "Nightmare ".repeat(50);
        while (true){
            System.out.println(s);
            TimeUnit.MILLISECONDS.sleep(500);
        }
    }
}