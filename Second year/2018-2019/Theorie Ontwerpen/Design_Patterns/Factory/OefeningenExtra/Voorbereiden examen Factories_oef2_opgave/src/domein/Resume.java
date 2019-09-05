package domein;

import java.util.ArrayList;
import java.util.List;

public class Resume extends Document {

    public Resume() {
    }

    @Override
    protected List<Page> createPages() {
        List<Page> li = new ArrayList<>();
        li.add(new SkillsPage());
        li.add(new EducationPage());
        li.add(new ExperiencePage());
        return li;
    }

}
