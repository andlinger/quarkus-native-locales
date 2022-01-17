package io.i15s.quarkus;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Locale;

@Path("/translation")
@RequestScoped
public class TranslationResource {

    @GET
    public Translation get() {
        var translation = new Translation();

        translation.setEn(Locale.FRANCE.getDisplayCountry(Locale.ENGLISH));
        translation.setIt(Locale.FRANCE.getDisplayCountry(Locale.ITALIAN));

        return translation;
    }
}
