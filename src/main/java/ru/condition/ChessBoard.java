package ru.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        if (checkAllRangeCoordinates(x1, y1, x2, y2)) {
            return movePossibility(x1, y1, x2, y2);
        } else {
            return 0;
        }
    }

    private static int movePossibility(int x1, int y1, int x2, int y2) {
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            return Math.abs(x2 - x1);
        } else {
            return 0;
        }
    }

    private static boolean checkAllRangeCoordinates(int x1, int y1, int x2, int y2) {
        return isValidRange(x1) && isValidRange(y1) && isValidRange(x2) && isValidRange(y2);
    }

    private static boolean isValidRange(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
