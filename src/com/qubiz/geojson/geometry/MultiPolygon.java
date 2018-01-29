package com.qubiz.geojson.geometry;

import com.qubiz.geojson.features.GeoJsonObject;
import com.squareup.moshi.JsonWriter;

import java.io.IOException;

public class MultiPolygon extends GeometryJsonObject {

    public MultiPolygon() {
        super(GeoJsonObject.Type.MultiPolygon);
    }

    @Override
    public JsonWriter writeTo(JsonWriter writer) throws IOException {
        return super.writeTo(writer);
    }
}
