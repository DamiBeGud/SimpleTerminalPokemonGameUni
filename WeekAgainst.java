import java.util.ArrayList;


public class WeekAgainst{
    private ArrayList<String> weak;

    public WeekAgainst(String weak1, String weak2, String weak3){
        this.weak = new ArrayList<String>();

        this.weak.add(weak1);
        this.weak.add(weak2);
        this.weak.add(weak3);
    }
}