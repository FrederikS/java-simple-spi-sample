package codes.fdk.spi.core;

import java.io.IOException;

public interface Codec {

    public <T> byte[] encode(T data) throws IOException;
    public <T> T decode(byte[] data, Class<T> clazz) throws IOException;

}