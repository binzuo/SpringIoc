package a;

/**
 * Created by Administrator on 2016/12/3.
 */
public class Business {
    private FloppyWriter floppyWriter;

    public Business(FloppyWriter floppyWriter) {
        this.floppyWriter = floppyWriter;
    }

    public void saveDate(){
        floppyWriter.saveDateToFloppy();

    }
}
