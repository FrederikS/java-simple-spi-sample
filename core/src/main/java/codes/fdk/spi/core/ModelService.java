package codes.fdk.spi.core;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ServiceLoader;

public class ModelService {

    private static final Logger LOGGER = System.getLogger(ModelService.class.getName());
    private final Codec codec;

    public ModelService() {
        ServiceLoader<Codec> codecLoader = ServiceLoader.load(Codec.class);

        codec = codecLoader.findFirst().orElseThrow();

        LOGGER.log(
                Level.INFO,
                "Found {0} codecs. Using codec: {1}.",
                codecLoader.stream().count(),
                codec
        );
    }

    public byte[] convert(Model model) throws IOException {
        return codec.encode(model);
    }

    public Model read(byte[] data) throws IOException {
        return codec.decode(data, Model.class);
    }

}
