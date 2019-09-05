package domein;

import java.util.ArrayList;
import java.util.List;

public class Report extends Document {

    public Report() {
        
    }

    @Override
    protected List<Page> createPages() {
        List<Page> li = new ArrayList<>();
        li.add(new IntroductionPage());
        li.add(new ConclusionPage());
        li.add(new SummaryPage());
        li.add(new BibliographyPage());
        return li;
    }

}
