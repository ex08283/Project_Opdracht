package quarto.view.mainscreen;

import com.sun.javafx.geom.PathIterator;
import com.sun.javafx.geom.RectBounds;
import com.sun.javafx.geom.Shape;
import com.sun.javafx.geom.transform.BaseTransform;

public class ShapeX extends Shape {
    @Override
    public RectBounds getBounds() {
        return null;
    }

    @Override
    public boolean contains(float v, float v1) {
        return false;
    }

    @Override
    public boolean intersects(float v, float v1, float v2, float v3) {
        return false;
    }

    @Override
    public boolean contains(float v, float v1, float v2, float v3) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(BaseTransform baseTransform) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(BaseTransform baseTransform, float v) {
        return null;
    }

    @Override
    public Shape copy() {
        return null;
    }
}
