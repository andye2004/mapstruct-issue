package com.example;

import java.util.HashMap;
import java.util.Map;

public class Target {
    private final Map<String, String> attributes = new HashMap<>();
    private String targetField;

    public Target() {
        // no-op
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public String getTargetField() {
        return targetField;
    }

    public void setTargetField(String targetField) {
        this.targetField = targetField;
    }
}
