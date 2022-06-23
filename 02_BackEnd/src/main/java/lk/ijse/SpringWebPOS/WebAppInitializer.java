package lk.ijse.SpringWebPOS;

import lk.ijse.SpringWebPOS.config.WebAppConfig;
import lk.ijse.SpringWebPOS.config.WebRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
