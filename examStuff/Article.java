public class Article extends Text {

    public Article(String text) {
        this.textContent = text;
        this.defaultTextContent = text;
    }

    private int maxLength;

    public void setTitle(String Title) {
        this.title = Title;
    }

    public void setRowLength(int length) {
        this.maxLength = length;
    }


    @Override
    public void print() {
        if (title != null) {
            System.out.println("");
            System.out.println(Bold + title + None);
            System.out.println("");
            String[] arr = textContent.split(" ");
            String ss = bgColor + textColor + "";
            int a = 0;
            int i = 0;
            while (i < arr.length) {
                if (a < maxLength) {
                    ss += arr[i] + " ";
                } else {
                    System.out.println(ss + None);
                    ss = bgColor + textColor + "" + arr[i] + " ";
                    a = 0;
                }
                a++;
                i++;
            }
            System.out.println(ss + None);
            System.out.println("");
        }
    }
}
