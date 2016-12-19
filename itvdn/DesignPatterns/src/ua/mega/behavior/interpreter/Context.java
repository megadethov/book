package ua.mega.behavior.interpreter;

public class Context {

// Контекст распознающей грамматики языка:
// V = {a}; L = V*;
// Правильные цепочки: а, аа, ааа, ...
// Неправильные цепочки: b, ab, aba, ...

    public String source;
    public char vocabulary;
    public boolean result;
    public int position;
}
