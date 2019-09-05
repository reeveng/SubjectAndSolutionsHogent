package domein;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Document {

    private final List<Page> pages;

    protected abstract List<Page> createPages();

    public Document() {
        pages = createPages();
    }

    public String print() {
        return pages.stream()
                .map(Page::print)
                .collect(Collectors.joining("\n"));
    }
}
