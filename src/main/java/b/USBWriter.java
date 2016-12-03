package b;

/**
 * Created by Administrator on 2016/12/3.
 */
public class USBWriter implements DeviceWriter {
    @Override
    public void saveDateToDevice() {
        System.out.println("save date to USB");
    }
}
