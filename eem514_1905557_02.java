import org.jfugue.Pattern;
import org.jfugue.Player;
import java.io.File;
import java.io.IOException;

public class eem514_1905557_02 {
    public static void main(String[] args) throws IOException {
        Player player = new Player();
        Pattern vocals = new Pattern();
        vocals.add("C4i A5q G5isa50d0 Rs A5s E5i D5is Rs C5qis");
        vocals.add("Rqi A4s G5i E5i Rs | G5is Rs E5q | D5is C5i Rs C5q G4q Ri");
        vocals.add("G3is A3s C4is D4s C4is D4s G4is A4s G4is A4s | E4q rs F4h");
        vocals.add("G5is E5i Ri | G5s Ris E5q Rs | G5q E5i Rs A5is rs G5q A5s E5i D5i ri C5h Ri");
        vocals.add("C5s A3q C5i Rs | D5i Rs Eb5qs Rs | D5q Eb5i Rs D5is Eb5s D4q Rs | C5i A4q C5h");

        player.play(vocals);
        vocals.add("Rh G5is E5i Ri | G5s Ris E5q Rs | G5q E5i Rs D5q rs C5h Rs");

        player.saveMidi(vocals, new File("eem514_1905557_02_output.mid"));
    }
}
