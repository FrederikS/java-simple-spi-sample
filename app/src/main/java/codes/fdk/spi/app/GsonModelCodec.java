package codes.fdk.spi.app;

import java.io.IOException;
import com.google.gson.Gson;
import codes.fdk.spi.core.Codec;

public class GsonModelCodec implements Codec {

    private final Gson gson = new Gson();

    @Override
    public <T> byte[] encode(T data) throws IOException {
        return gson.toJson(data).getBytes();
    }

    @Override
    public <T> T decode(byte[] data, Class<T> clazz) throws IOException {
        return gson.fromJson(new String(data), clazz);
    }

}