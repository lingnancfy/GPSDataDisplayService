
import com.icbc.dataDisplayService.bean.GPS;
import com.icbc.dataDisplayService.service.GPSdataService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:xml/mybatis/applicationContext-MFBean.xml");
        GPSdataService gpSdataService = (GPSdataService) ac.getBean("gpsService");
        List<GPS> gpsDataList = gpSdataService.getAllGPSData();
        System.out.println(gpsDataList);
    }
}
