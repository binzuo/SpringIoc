package e;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/3.
 */
@Component//注册
public class Business {
    @Autowired//自动装备
    @Qualifier(value = "floppyWriter")
    private DeviceWriter deviceWriter;

   // public Business(DeviceWriter deviceWriter) {
   //     this.deviceWriter = deviceWriter;
   // }

    public void setDeviceWriter(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void saveDate(){
        deviceWriter.saveDateToDevice();
    }
}
