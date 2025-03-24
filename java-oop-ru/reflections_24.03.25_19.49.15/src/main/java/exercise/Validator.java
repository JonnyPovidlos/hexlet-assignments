package exercise;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    public static List<String> validate(Address addr) {
        var declaredFields = Address.class.getDeclaredFields();
        var errors = new ArrayList<String>();

        for (var field : declaredFields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                try {
                    var value = field.get(addr);
                    if (value == null) {
                        errors.add(field.getName());
                    }
                } catch (Exception ignored) {

                }
            }
        }
        return errors;
    }
}
// END
