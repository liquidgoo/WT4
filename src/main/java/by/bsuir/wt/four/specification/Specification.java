package by.bsuir.wt.four.specification;

import java.util.List;

public interface Specification {
    String toSql();

    List<Object> getParameters();
}
