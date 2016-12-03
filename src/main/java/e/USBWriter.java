package e;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/3.
 */
@Component
public class USBWriter implements DeviceWriter {
    @Override
    public void saveDateToDevice() {
        System.out.println("save date to USB");
    }
}
