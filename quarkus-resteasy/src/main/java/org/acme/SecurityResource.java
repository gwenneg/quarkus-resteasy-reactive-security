package org.acme;

import javax.annotation.security.RolesAllowed;
import javax.validation.constraints.NotNull;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/security")
public class SecurityResource {

    @POST
    @RolesAllowed("admin")
    @Path("/json-body")
    public void jsonBody(@NotNull Body body) {
    }

    @POST
    @RolesAllowed("admin")
    @Path("/string-body")
    public void stringBody(@NotNull String body) {
    }

    public static class Body {
        public String content;
    }
}