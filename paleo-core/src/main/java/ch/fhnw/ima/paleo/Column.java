package ch.fhnw.ima.paleo;

public interface Column<T extends ColumnId> {

    T getId();

    int getRowCount();

    interface Builder<T extends Column<?>> {
        T build();
    }

}