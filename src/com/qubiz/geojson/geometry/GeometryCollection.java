package com.qubiz.geojson.geometry;

import com.qubiz.geojson.features.GeoJsonObject;
import com.squareup.moshi.JsonWriter;

import java.io.IOException;

public class GeometryCollection extends GeometryJsonObject {

    public GeometryCollection() {
        super(GeoJsonObject.Type.GeometryCollection);
    }

    @Override
    public JsonWriter writeTo(JsonWriter writer) throws IOException {
        return super.writeTo(writer);
    }
}
