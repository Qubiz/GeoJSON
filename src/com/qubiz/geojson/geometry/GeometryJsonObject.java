package com.qubiz.geojson.geometry;

import com.qubiz.geojson.features.GeoJsonObject;
import com.squareup.moshi.JsonWriter;

import java.io.IOException;

public abstract class GeometryJsonObject {

    public final GeoJsonObject.Type type;

    public GeometryJsonObject(GeoJsonObject.Type type) {
        this.type = type;
    }

    public JsonWriter writeTo(JsonWriter writer) throws IOException {
        writer.name("type").value(type.toString());
        return writer;
    }
}
