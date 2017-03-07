package com.katana.sdk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.katana.api.component.Constants;
import com.katana.api.component.Key;

/**
 * Created by juan on 3/01/17.
 */
public class ValueSchema {

    @JsonProperty(Key.VALUE_SCHEMA_TYPE)
    private String type;

    @JsonProperty(Key.VALUE_SCHEMA_VALUE)
    private Object value;

    public ValueSchema() {
        this.type = Constants.TYPE_STRING;
    }

    public ValueSchema(ValueSchema other) {
        this.type = other.type;
        this.value = other.value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ValueSchema that = (ValueSchema) o;

        if (type != null ? !type.equals(that.type) : that.type != null) {
            return false;
        }
        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ValueSchema{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
