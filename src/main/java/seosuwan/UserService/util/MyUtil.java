package seosuwan.UserService.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {
    public String now() {
        return new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss").format(new Date());
    }
}
