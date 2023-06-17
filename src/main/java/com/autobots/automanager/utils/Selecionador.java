package com.autobots.automanager.utils;

import java.util.List;

public interface Selecionador<T, ID> {
    public T selecionar(List<T> lista, ID id);
}
