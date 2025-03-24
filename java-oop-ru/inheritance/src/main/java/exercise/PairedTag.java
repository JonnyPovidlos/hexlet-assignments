package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {

    private final String body;
    private final List<Tag> child;

    public PairedTag(String name, Map<String, String> attrs, String body, List<Tag> child) {
        super(name, attrs);
        this.body = body;
        this.child = child.stream().toList();
    }

    public String toString() {
        if (child.isEmpty()) {
            return String.format("%s%s</%s>", super.toString(), body, name);
        }

        var childString = child.stream().map(Tag::toString).collect(Collectors.joining());
        return String.format("%s%s%s</%s>", super.toString(), childString, body, name);
    }
}
// END
