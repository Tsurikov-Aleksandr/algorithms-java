package all.easy;

public class Easy733FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    private void fill(int[][] image, int sr, int sc, int color, int startColor) {
        if (sr < 0 || sr > image.length - 1 ||
                sc < 0 || sc > image[0].length - 1 ||
                image[sr][sc] != startColor || image[sr][sc] == color) {
            return;
        }

        image[sr][sc] = color;

        fill(image, sr - 1, sc, color, startColor);
        fill(image, sr + 1, sc, color, startColor);
        fill(image, sr, sc - 1, color, startColor);
        fill(image, sr, sc + 1, color, startColor);
    }

}
