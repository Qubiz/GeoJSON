package com.qubiz.geojson;

import com.qubiz.geojson.features.Feature;
import com.qubiz.geojson.features.FeatureCollection;
import com.qubiz.geojson.geometry.*;
import com.qubiz.geojson.geometry.exceptions.InvalidGeometryException;
import com.squareup.moshi.JsonWriter;
import okio.Buffer;

import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException, InvalidGeometryException {
        HashMap<String, String> properties = new HashMap<>();

        LineString lineString1 = new LineString(
                new Position(1.0, 3.0),
                new Position(2.0, 3.0),
                new Position(1.0, 3.0),
                new Position(1.0, 3.0)
        );

        LineString lineString2 = new LineString(
                new Position(1.0, 3.0),
                new Position(2.0, 3.0),
                new Position(1.0, 3.0),
                new Position(1.0, 3.0)
        );

        Polygon polygon = new Polygon(lineString1, lineString2);

        Feature<Polygon> polygonFeature = new Feature<>(polygon, properties);
//
//        FeatureCollection featureCollection = new FeatureCollection();
//
//        Buffer buffer = new Buffer();
//        JsonWriter writer = JsonWriter.of(buffer);
//        polygonFeature.writeTo(writer);
//        buffer.writeTo(System.out);


    }
}
