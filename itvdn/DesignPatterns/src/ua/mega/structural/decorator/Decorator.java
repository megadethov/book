package ua.mega.structural.decorator;

public abstract class Decorator implements Component {
    Component component; // компонент, к-ый необходимо декорировать

    @Override
    public void operation() {
        if (component != null) { // проверка, что компонент для декора существует
            component.operation(); // компонент для декора выполняет свою функциональность
        }
    }
}
