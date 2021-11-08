package it.unibo.oop.lab.nesting2;

import java.util.ArrayList;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
    private final List<T> list;

    public OneListAcceptable(List<T> elements) {
	list = new ArrayList<>();
	for(T elem:elements) {
	    list.add(elem);
	}
    }

    @Override
    public Acceptor<T> acceptor() {
	return new Acceptor<T>() {
	    private final List<T> erasableLista= list;
	    private final List<T> lista = List.copyOf(erasableLista);

	    @Override
	    public void accept(T newElement) throws ElementNotAcceptedException {
		if (!lista.contains(newElement)) {
		    throw new ElementNotAcceptedException(newElement);
		}
		erasableLista.remove(newElement);
	    }

	    @Override
	    public void end() throws EndNotAcceptedException {
		if (!erasableLista.isEmpty()) {
		    throw new EndNotAcceptedException();
		}
	    }

	};
    }

}
