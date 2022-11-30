public enum Rotation {
    LEFT(-45, "left"),
    RIGHT(45, "right");

    private int angle;
    private String textform;

    Rotation(int angle, String textform) {
        this.angle = angle;
        this.textform = textform;
    }

    public int getAngle() {
        return this.angle;
    }

    public String getTextForm() {
        return textform;
    }
}
