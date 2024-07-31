package tms.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 
@Configuration
public class WebConfig implements WebMvcConfigurer {
 
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // This applies CORS settings to all endpoints
            .allowedOrigins("*")    // Allow all origins
            .allowedMethods("GET", "POST", "PUT", "DELETE") // Specify allowed methods
            .allowedHeaders("*")    // Allow all headers
            .allowCredentials(true).maxAge(3600);  // Allow credentials and set max age
    }
}
