package com.qubiz.geojson.geometry;

import com.qubiz.geojson.features.GeoJsonObject;
import com.squareup.moshi.JsonWriter;

import java.io.IOException;

public class Point extends GeometryJsonObject {

    public final Position position;

    public Point(Position position) {
        super(GeoJsonObject.Type.Point);
        this.position = position;
    }

    @Override
    public JsonWriter writeTo(JsonWriter writer) throws IOException {
        writer = super.writeTo(writer);
        writer.name("coordinates");
        writer = position.writeTo(writer);
        return writer;
    }

}
