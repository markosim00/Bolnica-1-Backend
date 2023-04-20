package raf.bolnica1.laboratory.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@AllArgsConstructor
@Component
public class ExtractPageContentFromPageJson {

    private ObjectMapper objectMapper;

    public static ExtractPageContentFromPageJson getInstance(){
        return new ExtractPageContentFromPageJson(new ObjectMapper());
    }


    public <T> List<T> extractPageContentFromPageJson(String pageJson, Class<T> clazz) throws JsonProcessingException {
        JsonNode jsonNode=objectMapper.readTree(pageJson);
        String content=jsonNode.get("content").toString();
        List<T> result = objectMapper.readValue(content, objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));
        return result;
    }


}
