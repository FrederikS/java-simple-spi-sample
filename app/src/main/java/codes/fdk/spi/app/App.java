package codes.fdk.spi.app;

import java.io.IOException;
import codes.fdk.spi.core.Model;
import codes.fdk.spi.core.ModelService;

public class App {
    public static void main(String[] args) throws IOException {
        ModelService modelService = new ModelService();

        Model model = new Model("foo", "bar");

        byte[] encoded = modelService.convert(model);
        Model decoded = modelService.read(encoded);

        System.out.println("Encoded: " + new String(encoded));
        System.out.println("Decoded: " + decoded);
    }
}
