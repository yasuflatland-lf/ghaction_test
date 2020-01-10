package studio.admin.test2;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
    info = @Info(
            title = "studio-admin-test2",
            version = "0.0"
    )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}