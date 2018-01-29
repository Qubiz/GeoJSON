package com.qubiz.geojson.geometry;

import com.qubiz.geojson.features.GeoJsonObject;
import com.qubiz.geojson.geometry.exceptions.InvalidGeometryException;
import com.squareup.moshi.JsonWriter;
import com.sun.istack.internal.Nullable;

import java.io.IOException;
import java.util.List;

public class Polygon extends GeometryJsonObject {

//    private final List<LineString> lineStrings;

    public Polygon(LineString linearRing) throws InvalidGeometryException {
        this(linearRing, null);
    }

    public Polygon(LineString exteriorRing, @Nullable LineString ... interiorRings) throws InvalidGeometryException {
        super(GeoJsonObject.Type.Polygon);
        if (!Utils.isLinearRing(exteriorRing)) {
            if (!(exteriorRing.getSize() >= 4)) {
                throw new InvalidGeometryException(this, "The given LineString(s) should contain at least four Position elements (Currently " + exteriorRing.getSize() + ").");
            } else {
                throw new InvalidGeometryException(this, "The first and last Position of the given LineString should be equivalent, they must contain identical values.");
            }
        }

        if (interiorRings != null) {
            for (LineString ring : interiorRings) {
                if (!(ring.getSize() >= 4)) {
                    throw new InvalidGeometryException(this, "The given LineString(s) should contain at least four Position elements (Currently " + ring.getSize() + ").");
                } else {
                    throw new InvalidGeometryException(this, "The first and last Position of the given LineString should be equivalent, they must contain identical values.");
                }
            }
        }
    }

    @Override
    public JsonWriter writeTo(JsonWriter writer) throws IOException {
        return super.writeTo(writer);
    }
}
