package full_guide.part_01.chapter_12._05_Enum_Answers;

import java.util.Random;

/**
 * Created by mega on 29.08.2016.
 */
public enum Answers {
    YES, MAYBE, NO
}

class Test {
    public static void main(String[] args) {
        Answers answers = generator();
        switch (answers) {
            case YES:
                System.out.println("30% say " + Answers.YES);
                break;
            case MAYBE:
                System.out.println("30% say " + Answers.MAYBE);
                break;
            case NO:
                System.out.println("30% say " + Answers.NO);
                break;
        }
    }

    public static Answers generator() {
        Random random = new Random();
        int gen = random.nextInt(100);
        if (gen < 30) {
            return Answers.YES;
        } else if (gen < 60) {
            return Answers.MAYBE;
        } else return Answers.NO;

    }
}
