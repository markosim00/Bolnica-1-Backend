package raf.bolnica1.infirmary.config.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
@Configuration
public class RestServiceClientConfig {
    @Bean
    @Qualifier("departmentRestTemplate")
    public static RestTemplate departmentRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("http://localhost:8080/api/department"));
        return restTemplate;
    }

    @Bean
    @Qualifier("loginRestTemplate")
    public static RestTemplate loginRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("http://localhost:8080/api/auth/login"));
        return restTemplate;
    }

    @Bean
    @Qualifier("patientRestTemplate")
    public static RestTemplate patientRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("http://localhost:8081/api/patient"));
        return restTemplate;
    }

    @Bean
    @Qualifier("infoRestTemplate")
    public static RestTemplate infoRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("http://localhost:8081/api/info"));
        return restTemplate;
    }

    @Bean
    @Qualifier("diagnosisCodeRestTemplate")
    public static RestTemplate diagnosisCodeRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("http://localhost:8081/api/record/gather_diagnosis"));
        return restTemplate;
    }

    @Bean
    @Qualifier("labPrescriptionRestTemplate")
    public static RestTemplate labPrescriptionRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("http://localhost:8083/api/laboratory/prescription/get_patient"));
        return restTemplate;
    }

}

