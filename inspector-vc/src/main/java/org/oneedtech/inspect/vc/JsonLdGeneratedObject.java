package org.oneedtech.inspect.vc;

import org.oneedtech.inspect.core.probe.GeneratedObject;

public class JsonLdGeneratedObject extends GeneratedObject {
    private String json;

    public JsonLdGeneratedObject(String json) {
        super(ID, GeneratedObject.Type.INTERNAL);
        this.json = json;
    }

    public String getJson() {
        return json;
    }

    public static final String ID = JsonLdGeneratedObject.class.getCanonicalName();
}
