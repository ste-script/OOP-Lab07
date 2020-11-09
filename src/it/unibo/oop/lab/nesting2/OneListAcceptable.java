package it.unibo.oop.lab.nesting2;

import java.util.ArrayList;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
    
    private final List<T> list;
    private final List<T> elementList = new ArrayList<>();
    public OneListAcceptable(final List<T> l) {
        this.list = l;
    }

    @Override
    public Acceptor<T> acceptor() {
        return new Acceptor<T>(){

            @Override
            public void accept(T newElement) throws ElementNotAcceptedException {
                if (!list.contains(newElement)) {
                    throw new ElementNotAcceptedException(newElement);
                }
                elementList.add(newElement);
            }

            @Override
            public void end() throws EndNotAcceptedException {
                if (!elementList.containsAll(list)) {
                    throw new EndNotAcceptedException();
                }
                
            }
            
        };
    }

}
