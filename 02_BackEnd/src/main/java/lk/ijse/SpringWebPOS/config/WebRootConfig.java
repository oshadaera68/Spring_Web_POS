/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

package lk.ijse.SpringWebPOS.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
}
