public interface Print {
    void print();

    void setColor(Color color);

    void setBackgroundColor(Color backgroundColor);

    String None = "\u001B[0m";
    String Bold = "\033[1m";
    String Italic = "\033[3m";
    String Underline = "\033[4m";
    String Selected = "\033[7m";
    String Striked = "\033[9m";
    String Black = "\u001B[30m";
    String Red = "\u001B[31m";
    String Green = "\u001B[32m";
    String Yellow = "\u001B[33m";
    String Blue = "\u001B[34m";
    String Purple = "\u001B[35m";
    String Cyan = "\u001B[36m";
    String White = "\u001B[37m";


    String bgBlack = "\u001B[40m";
    String bgRed = "\u001B[41m";
    String bgGreen = "\u001B[42m";
    String bgYellow = "\u001B[43m";
    String bgBlue = "\u001B[44m";
    String bgPurple = "\u001B[45m";
    String bgCyan = "\u001B[46m";
    String bgWhite = "\u001B[47m";
}
