/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

package lk.ijse.SpringWebPOS.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "lk.ijse.SpringWebPOS")
public class WebAppConfig {
}
