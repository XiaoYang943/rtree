// automatically generated by the FlatBuffers compiler, do not modify

package com.github.davidmoten.rtree.fbs.generated;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class CircleFloat_ extends Struct {
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public CircleFloat_ __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float x() { return bb.getFloat(bb_pos + 0); }
  public float y() { return bb.getFloat(bb_pos + 4); }
  public float radius() { return bb.getFloat(bb_pos + 8); }

  public static int createCircleFloat_(FlatBufferBuilder builder, float x, float y, float radius) {
    builder.prep(4, 12);
    builder.putFloat(radius);
    builder.putFloat(y);
    builder.putFloat(x);
    return builder.offset();
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public CircleFloat_ get(int j) { return get(new CircleFloat_(), j); }
    public CircleFloat_ get(CircleFloat_ obj, int j) {  return obj.__assign(__element(j), bb); }
  }
}

