package org.joml.test;

import org.joml.Intersection;
import org.joml.Vector3f;

import junit.framework.TestCase;

/**
 * Tests for the {@link Intersection} class.
 * 
 * @author Kai Burjack
 */
public class IntersectionTest extends TestCase {

    public static void testIntersectRayTrianglePX() {
        Vector3f origin = new Vector3f();
        Vector3f dir = new Vector3f(1, 0, 0);
        Vector3f v0 = new Vector3f(1, -1, -1);
        Vector3f v1 = new Vector3f(1, -1, 1);
        Vector3f v2 = new Vector3f(1, 1, 0);
        float t = Intersection.intersectRayTriangle(origin, dir, v0, v1, v2, 0.0f);
        assertEquals(1.0f, t, 0.0f);
    }

}