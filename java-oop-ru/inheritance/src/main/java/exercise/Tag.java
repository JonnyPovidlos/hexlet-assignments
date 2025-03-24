package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    protected final String name;
    protected final Map<String, String> attrs;

    public Tag(String name, Map<String, String> attrs) {
        this.name = name;
        this.attrs = attrs.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public String toString() {
        if (attrs.isEmpty()) {
            return String.format("<%s>", name);
        }

        String stringAttrs = attrs.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> String.format("%s=\"%s\"", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining(" "));

        return String.format("<%s %s>", name, stringAttrs);
    }
}
// END
