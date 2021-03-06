package co.osg.bi.data.processing.loader.excel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BiDataProcessingLoaderExcelApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BiDataProcessingLoaderExcelApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(BiDataProcessingLoaderExcelApplication.class, args);
    }
}
