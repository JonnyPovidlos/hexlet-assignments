package exercise;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Stream;

public class Validator {
    public static List<String> validate(Address addr) {
        return Stream.of(Address.class.getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(NotNull.class))
                .filter(field -> {
                    Object value;
                    try {
                        field.setAccessible(true);
                        value = field.get(addr);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return value == null;
                })
                .map(Field::getName)
                .toList();
    }
}
// END
