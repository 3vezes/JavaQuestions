import com.google.common.base.Preconditions;
import java.util.Arrays;

/**
 * A monochrome screen is stored as a single array of bytes, allowing eight
 * consecutive pixels to be stored in one byte. The screen has width w, where w is divisible by
 * 8. The height of the screen, of course can be derived from the length of the array and the width.
 * Implement a function drawHorizontalLine(byte[] screen, int width, int x1, int x2, int y) which
 * draws a horizontal line from (x1,y) to (x2,y)
 */
public final class DrawLine {

    private static final byte ON = Byte.MAX_VALUE;

    public static byte[] drawHorizontalLine(byte[] screen, int width, int x1, int x2, int y){
        byte[] screenCopy = Arrays.copyOf(screen,screen.length);
        Preconditions.checkArgument(screen.length > width,"The screen must be greater than the width.");

        //Make sure the coordinates are valid. It does overlap multiple rows.
        Preconditions.checkArgument((x2 - x1) <= width,"The X1 and X2 provided will overlap multiple rows.",x1,x2,width);

        //Calculate the row and column value.
        final int startingPoint = (y * width) + x1;
        final int endPoint = (startingPoint +  (x2 - x1));
        for(int i = startingPoint; i <=  endPoint; i++){
              screenCopy[i] = ON;
        }

        return screenCopy;
    }
}
