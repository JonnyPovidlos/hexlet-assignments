package exercise;

// BEGIN
public class LabelTag implements TagInterface {

    private final TagInterface tag;
    private final String value;

    public LabelTag(String value, TagInterface tag) {
        this.tag = tag;
        this.value = value;
    }

    public String render() {
        return String.format("<label>%s%s</label>", value, tag.render());
    }
}
// END
