package full_guide.part_01.chapter_03._08_ScopeErr;

/**
 * Created by mega on 21.08.2016.
 */
// Скомпилировать эту программу нельзя
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        { // создается новая область действия
//            int bar = 2; // variable is already defined in the scope
        }

    }
}
