package task.service;

import task.model.Example;


public interface Operation<T> {
    T sum(Example<T> example);

    T divide(Example<T> example);

    T difference(Example<T> example);

    T multiply(Example<T> example);
}
