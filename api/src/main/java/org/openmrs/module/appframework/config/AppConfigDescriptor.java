package org.openmrs.module.appframework.config;

import org.codehaus.jackson.annotate.JsonProperty;

public class AppConfigDescriptor {

    @JsonProperty
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public Boolean isEnabled() {
        return enabled;
    }
}
