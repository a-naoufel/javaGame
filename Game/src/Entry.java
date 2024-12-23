import java.awt.Color;
import java.awt.Graphics;

public class Entry extends EmptySquare {

    private int x;
    private int y;

    public Entry(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Entry() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw(int i, int j, Graphics g, View view) {
        super.draw(i, j, g, view);
        g.setColor(Color.GREEN);
        int X = view.frame.getWidth() * x / view.game.gridSizeX();
        int Y = (view.frame.getHeight() - 35) * (y - 1) / view.game.gridSizeY();
        int[] Xs = { X, X + 20, X + 10 };
        int[] Ys = { Y, Y, Y + 20 };
        g.fillPolygon(Xs, Ys, 3);

    }

}
