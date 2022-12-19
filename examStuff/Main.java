import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String somestuff = "Здесь условие должно быть любым булевым выражением. Тело цикла будет выполняться до тех пор, пока условное выражение истинно. Когда условие становится ложным, управление передаётся строке кода, которая идёт после цикла. Если в цикле используется только один оператор, то фигурные скобки можно опустить (но лучше так не делать).";
        Article stih = new Article(somestuff);
        stih.setTitle("PUSHKIN");
        stih.setRowLength(10);
        stih.setColor(Color.Black);
        stih.setBackgroundColor(Color.Cyan);
        stih.print();
        Nickname me = new Nickname("omen");
        me.setStyle(Style.register);
        me.setColor(Color.Yellow);
        me.reset();
        me.print();
    }
}