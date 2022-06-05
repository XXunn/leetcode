package leetcode;

import java.util.Random;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/5 12:52
 **/
public class randPoint {
    Random random;
    double x,y,r;

    public randPoint(double radius, double x_center, double y_center) {
        random = new Random();
        x = x_center;
        y = y_center;
        r = radius;
    }

    public double[] randPoint() {
        while(true) {
            double xx = x - r + 2*r*random.nextDouble();
            double yy = y - r + 2*r*random.nextDouble();
            if(((xx-x)*(xx-x) + (yy-y)*(yy-y)) < r*r) {
                return new double[]{xx, yy};
            }
        }
    }
}
