import bagel.*;

public class Score {
    private static final int PERFECT_DISTANCE = 15;
    private static final int GOOD_DISTANCE = 50;
    private static final int BAD_DISTANCE = 100;
    private static final int MISS_DISTANCE = 200;
    private static final int PERFECT_SCORE = 10;
    private static final int GOOD_SCORE = 5;
    private static final int BAD_SCORE = -1;
    private static final int MISS_SCORE = -5;
    private final Font messageFont = new Font("res/FSO8BITR.TTF", 40);
    private final Font scoreFont = new Font("res/FSO8BITR.TTF", 30);
    private final String PERFECT_MESSAGE = "PERFECT";
    private final String GOOD_MESSAGE = "GOOD";
    private final String BAD_MESSAGE = "BAD";
    private final String MISS_MESSAGE = "MISS";
    private final int MESSAGE_DURATION = 30;
    protected final static int IMAGE_NORMAL_Y = 657;
    private int gameScore;

    public Score(int n) {
        this.gameScore = n;
    }

    public void setGameScore(int n) {
        this.gameScore = n;
    }

    public Font getScoreFont() {
        return scoreFont;
    }

    public int getTheScore() {
        return gameScore;
    }

    // The scoring for notes in the 4 different lanes
   protected void leftNormalNoteScoring(NormalNote givenNote, Input input) {
       int currScoreNo = this.getTheScore();
       if (input.wasPressed(Keys.LEFT)) {
           if (givenNote.getNoteDistance() <= PERFECT_DISTANCE) {
               givenNote.setIsScored(true);
               messageFont.drawString(PERFECT_MESSAGE, (Window.getWidth() / 2.0) -
                       (messageFont.getWidth(PERFECT_MESSAGE) / 2.0), 250);
               this.setGameScore(currScoreNo + PERFECT_SCORE);
           }
           if (givenNote.getNoteDistance() > PERFECT_DISTANCE && givenNote.getNoteDistance() <= GOOD_DISTANCE) {
               givenNote.setIsScored(true);
               messageFont.drawString(GOOD_MESSAGE, (Window.getWidth() / 2.0) -
                       (messageFont.getWidth(GOOD_MESSAGE) / 2.0), 250);
               this.setGameScore(currScoreNo + GOOD_SCORE);
           }
           if ((givenNote.getNoteDistance() > GOOD_DISTANCE) && (givenNote.getNoteDistance() <= BAD_DISTANCE)) {
               givenNote.setIsScored(true);
               messageFont.drawString(BAD_MESSAGE, (Window.getWidth() / 2.0) -
                       (messageFont.getWidth(BAD_MESSAGE) / 2.0), 250);
               this.setGameScore(currScoreNo + BAD_SCORE);
           }
           if (givenNote.getNoteDistance() > BAD_DISTANCE && givenNote.getNoteDistance() <= MISS_DISTANCE) {
               givenNote.setIsScored(true);
               messageFont.drawString(MISS_MESSAGE, (Window.getWidth() / 2.0) -
                       (messageFont.getWidth(MISS_MESSAGE) / 2.0), 250);
               this.setGameScore(currScoreNo + MISS_SCORE);
           }
       }
       else {
           // Didn't press the key at all
           if (givenNote.getNoteDistance() > MISS_DISTANCE && givenNote.getStartY() >= IMAGE_NORMAL_Y) {
               givenNote.setIsScored(true);
               messageFont.drawString(MISS_MESSAGE, (Window.getWidth() / 2.0) -
                       (messageFont.getWidth(MISS_MESSAGE) / 2.0), 250);
               this.setGameScore(currScoreNo + MISS_SCORE);
           }
       }
   }

    protected void upNormalNoteScoring(NormalNote givenNote, Input input) {
        int currScoreNo = this.getTheScore();
        if (input.wasPressed(Keys.UP)) {
            if (givenNote.getNoteDistance() <= PERFECT_DISTANCE) {
                givenNote.setIsScored(true);
                messageFont.drawString(PERFECT_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(PERFECT_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + PERFECT_SCORE);
            }
            if (givenNote.getNoteDistance() > PERFECT_DISTANCE && givenNote.getNoteDistance() <= GOOD_DISTANCE) {
                givenNote.setIsScored(true);
                messageFont.drawString(GOOD_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(GOOD_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + GOOD_SCORE);
            }
            if ((givenNote.getNoteDistance() > GOOD_DISTANCE) && (givenNote.getNoteDistance() <= BAD_DISTANCE)) {
                givenNote.setIsScored(true);
                messageFont.drawString(BAD_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(BAD_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + BAD_SCORE);
            }
            if (givenNote.getNoteDistance() > BAD_DISTANCE && givenNote.getNoteDistance() <= MISS_DISTANCE) {
                givenNote.setIsScored(true);
                messageFont.drawString(MISS_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(MISS_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + MISS_SCORE);
            }
        }
        else {
            // Didn't press the key at all
            if (givenNote.getNoteDistance() > MISS_DISTANCE && givenNote.getStartY() >= IMAGE_NORMAL_Y) {
                givenNote.setIsScored(true);
                messageFont.drawString(MISS_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(MISS_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + MISS_SCORE);
            }
        }
    }

    protected void downNormalNoteScoring(NormalNote givenNote, Input input) {
        int currScoreNo = this.getTheScore();
        if (input.wasPressed(Keys.DOWN)) {
            if (givenNote.getNoteDistance() <= PERFECT_DISTANCE) {
                givenNote.setIsScored(true);
                messageFont.drawString(PERFECT_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(PERFECT_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + PERFECT_SCORE);
            }
            if (givenNote.getNoteDistance() > PERFECT_DISTANCE && givenNote.getNoteDistance() <= GOOD_DISTANCE) {
                givenNote.setIsScored(true);
                messageFont.drawString(GOOD_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(GOOD_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + GOOD_SCORE);
            }
            if ((givenNote.getNoteDistance() > GOOD_DISTANCE) && (givenNote.getNoteDistance() <= BAD_DISTANCE)) {
                givenNote.setIsScored(true);
                messageFont.drawString(BAD_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(BAD_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + BAD_SCORE);
            }
            if (givenNote.getNoteDistance() > BAD_DISTANCE && givenNote.getNoteDistance() <= MISS_DISTANCE) {
                givenNote.setIsScored(true);
                messageFont.drawString(MISS_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(MISS_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + MISS_SCORE);
            }
        }
        else {
            // Didn't press the key at all
            if (givenNote.getNoteDistance() > MISS_DISTANCE && givenNote.getStartY() >= IMAGE_NORMAL_Y) {
                givenNote.setIsScored(true);
                messageFont.drawString(MISS_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(MISS_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + MISS_SCORE);
            }
        }
    }

    protected void rightNormalNoteScoring(NormalNote givenNote, Input input) {
        int currScoreNo = this.getTheScore();
        if (input.wasPressed(Keys.RIGHT)) {
            if (givenNote.getNoteDistance() <= PERFECT_DISTANCE) {
                givenNote.setIsScored(true);
                messageFont.drawString(PERFECT_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(PERFECT_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + PERFECT_SCORE);
            }
            if (givenNote.getNoteDistance() > PERFECT_DISTANCE && givenNote.getNoteDistance() <= GOOD_DISTANCE) {
                givenNote.setIsScored(true);
                messageFont.drawString(GOOD_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(GOOD_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + GOOD_SCORE);
            }
            if ((givenNote.getNoteDistance() > GOOD_DISTANCE) && (givenNote.getNoteDistance() <= BAD_DISTANCE)) {
                givenNote.setIsScored(true);
                messageFont.drawString(BAD_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(BAD_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + BAD_SCORE);
            }
            if (givenNote.getNoteDistance() > BAD_DISTANCE && givenNote.getNoteDistance() <= MISS_DISTANCE) {
                givenNote.setIsScored(true);
                messageFont.drawString(MISS_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(MISS_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + MISS_SCORE);
            }
        }
        else {
            // Didn't press the key at all
            if (givenNote.getNoteDistance() > MISS_DISTANCE && givenNote.getStartY() >= IMAGE_NORMAL_Y) {
                givenNote.setIsScored(true);
                messageFont.drawString(MISS_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(MISS_MESSAGE) / 2.0), 250);
                this.setGameScore(currScoreNo + MISS_SCORE);
            }
        }
    }

    /* An attempt to try draw the note scoring messages properly, but was not able to
       correctly draw it for 30 frames.
    private void drawNormalNoteMessage(NormalNote givenNote, int frameNumber, String messageType) {
        int initialFrameNumber = frameNumber;
        if (frameNumber > (initialFrameNumber + MESSAGE_DURATION)) {
            // stop drawing the message
        }
        else if(frameNumber <= (initialFrameNumber + MESSAGE_DURATION)) {
            if(messageType.equals("Perfect")) {
                messageFont.drawString(PERFECT_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(PERFECT_MESSAGE) / 2.0), 250);
            }
            if(messageType.equals("Good")) {
                messageFont.drawString(GOOD_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(GOOD_MESSAGE) / 2.0), 250);
            }
            if(messageType.equals("Bad")) {
                messageFont.drawString(BAD_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(BAD_MESSAGE) / 2.0), 250);
            }
            if(messageType.equals("Miss")) {
                messageFont.drawString(MISS_MESSAGE, (Window.getWidth() / 2.0) -
                        (messageFont.getWidth(MISS_MESSAGE) / 2.0), 250);
            }
        }
    }

     */

}
