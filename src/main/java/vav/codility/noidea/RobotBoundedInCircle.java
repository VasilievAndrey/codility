package vav.codility.noidea;

public class RobotBoundedInCircle {

    int[][] dir = new int[][]{{0,1}, {1,0}, {0, -1}, {-1,0}};
    public boolean isRobotBounded(String instructions) {
        int x =0;
        int y =0;
        int indx = 0;
        for (char ch: instructions.toCharArray()) {
            if (ch == 'L') {
                indx = (indx + 3) % 4;
            } else if (ch == 'R') {
                indx = (indx + 1) %4;
            } else {
                x += dir[indx][0];
                y += dir[indx][1];
            }
        }
        return (x == 0 && y ==0) || (indx != 0);
    }
}
