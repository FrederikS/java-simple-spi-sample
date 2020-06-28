package codes.fdk.spi.core;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonCodec implements Codec {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> byte[] encode(T data) throws JsonProcessingException {
        return objectMapper.writeValueAsBytes(data);
    }

    @Override
    public <T> T decode(byte[] data, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        return objectMapper.readValue(data, clazz);
    }

}