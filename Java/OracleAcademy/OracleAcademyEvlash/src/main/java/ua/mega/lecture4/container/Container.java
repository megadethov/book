package ua.mega.lecture4.container;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yefremov Yuriy
 */
// Примитивный ассоциативный контейнер, в к-ом элементы хранятся парами ключ-значение
// в отличии от большинства Map у нас допускаются дубликаты ключей
public class Container<K, V> {

    // inner class тоже типизирован
    // Node не нужен нигде кроме контейнера, а контейнер без Node не имеет смысла - поэтому он inner,
    // но после компиляции они будут в разных файлах
    private class Node<K, V> {
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    // Типизирующий тип может быть сам типизирован
    List<Node<K, V>> nodeList = new ArrayList<>(); // коллекция Node

    public boolean add(K key, V value) {
        return nodeList.add(new Node<>(key, value));
    }

    // Теперь сделаем геттер для Node, по индексу из коллекции Node
//    public Node<K, V> getNode(int index) {
//        return nodeList.get(index); // Вопрос куда сохранять это снаружи - Node явл. private и его не видно, поэтому перепишем
//    }

    // будем давать снаружи ключ и по нему получать значение
    // возвращает List значений(если таких ключей несколько)
    public List<V> getValue(K key) { // принимает на вход ключ
        List<V> values = new ArrayList<V>(); // создаем List для хранения найденных в коллекции Node значений
        // в цикле пробегаем по коллекции Node
        for (Node<K, V> n : nodeList) {
            // если ключ совпадает с заданным - кладем его значение в List values
            if (n.getKey().equals(key)) values.add(n.getValue());
        }
        return values;
    }
}
