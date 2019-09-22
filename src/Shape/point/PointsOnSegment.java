package Shape.point;

public class PointsOnSegment {

    public boolean onSegment(Point p, Point q, Point r) {
        if (q.x <= Math.max(p.x, r.x) && q.x >= Math.min(p.x, q.x)
                && q.y <= Math.max(p.y, r.y) && q.y >= Math.min(p.y, r.y)) {
            return true;
        }
        return false;
    }

    public  boolean pointOnSegment(Point c, Point a, Point b) {
        //if c is on ab
        Point AC = new Point(c.x - a.x, c.y - a.y);
        Point BC = new Point(c.x - b.x, c.y - b.y);
        int res = AC.x * BC.y - AC.y - BC.x;
        return res == 0 && onSegment(a, c, b);

    }
}
