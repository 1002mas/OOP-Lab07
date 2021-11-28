package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
    private final List<T> list;

    public OneListAcceptable(List<T> elements) {
        this.list = elements;
    }

    @Override
    public Acceptor<T> acceptor() {
        return new Acceptor<T>() {
            private final Iterator<T> iterator = list.iterator();

            @Override
            public void accept(T newElement) throws ElementNotAcceptedException {
                if (!iterator.hasNext() || !newElement.equals(iterator.next())) {
                    throw new ElementNotAcceptedException(newElement);
                }
            }

            @Override
            public void end() throws EndNotAcceptedException {
                if (iterator.hasNext()) {
                    throw new EndNotAcceptedException();
                }
            }

        };
    }

}
