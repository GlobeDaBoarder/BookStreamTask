import java.util.Set;

public class Book {
    private static int id_counter = 0;

    private final int id;
    private String name;
    private Set<Language> languages;

    public Book(String name, Set<Language> list) {
        this.id = id_counter++;
        this.name = name;
        this.languages = list;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", languages=" + languages;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }

}
