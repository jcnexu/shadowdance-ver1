import bagel.*;
import java.util.ArrayList;
public class Lane {
    // Constant for the y-coordinate of all lanes
    private final static int CENTRE_Y = 384;
    private final static int MAX_NORMAL_NOTES = 100;
    private final static int MAX_HOLD_NOTES = 20;
    private final String laneType;
    private final int centreX;
    private final int centreY;
    private boolean isScored;

    public Lane(String type, int centreX) {
        this.laneType = type;
        this.centreX = centreX;
        this.centreY = CENTRE_Y;
    }

    public String getLaneType() {
        return laneType;
    }

    public int getLaneX() {
        return centreX;
    }
    public int getLaneY() {
        return centreY;
    }


    public void laneDraw(ArrayList<Note> noteArray, int frameCounter) {
        int i;
        for(i = 0; i < noteArray.size(); i++) {
            if(noteArray.get(i).getFrameNumber() <= frameCounter) {
                noteArray.get(i).drawNote();
            }
        }
    }

}
