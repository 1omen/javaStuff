public abstract class Text implements Print {
    protected String textContent;
    protected String defaultTextContent;
    protected String textColor = None;
    protected String bgColor = None;

    public void print() {
        if (textContent != null){
            System.out.println("");
            System.out.println(bgColor + textColor + textContent + None);
        }
    }

    public void reset() {
        System.out.println("Default style set.");
        textContent = None + defaultTextContent;
    }

    public void setColor(Color color) {
        if (textContent != null) {
            switch (color) {
                case Red:
                    textColor = Red;
                    break;
                case Blue:
                    textColor = Blue;
                    break;
                case Cyan:
                    textColor = Cyan;
                    break;
                case Black:
                    textColor = Black;
                    break;
                case Green:
                    textColor = Green;
                    break;
                case White:
                    textColor = White;
                    break;
                case Purple:
                    textColor = Purple;
                    break;
                case Yellow:
                    textColor = Yellow;
                    break;
            }
        } else {
            System.out.println(Red + "PRINT ERROR: No string provided." + None);
        }
    }

    public void setBackgroundColor(Color backgroundColor) {
        if (textContent != null) {
            switch (backgroundColor) {
                case Red:
                    bgColor = bgRed;
                    break;
                case Blue:
                    bgColor = bgBlue;
                    break;
                case Cyan:
                    bgColor = bgCyan;
                    break;
                case Black:
                    bgColor = bgBlack;
                    break;
                case Green:
                    bgColor = bgGreen;
                    break;
                case White:
                    bgColor = bgWhite;
                    break;
                case Purple:
                    bgColor = bgPurple;
                    break;
                case Yellow:
                    bgColor = bgYellow;
                    break;
            }
        } else {
            System.out.println(Red + "PRINT ERROR: No string provided." + None);
        }
    }
}
