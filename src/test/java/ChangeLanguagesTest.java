import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChangeLanguagesTest {
    private List<Book> bookList;
    private List<Book> resultList;

    @BeforeEach
    void init(){
        this.bookList = List.of(
                new Book("Harry Potter 1",
                        new HashSet<>(Set.of(Language.ENGLISH, Language.GERMAN, Language.SPANISH, Language.RUSSIAN))),
                new Book("Harry Potter 2",
                        new HashSet<>(Set.of(Language.GERMAN))),
                new Book("Harry Potter 3",
                        new HashSet<>(Set.of(Language.SPANISH))),
                new Book("Harry Potter 4",
                        new HashSet<>(Set.of(Language.RUSSIAN))),
                new Book("Art of war",
                        new HashSet<>(Set.of(Language.ENGLISH))),
                new Book("Dream of the Red Cha",
                        new HashSet<>(Set.of(Language.ENGLISH, Language.GERMAN, Language.SPANISH, Language.RUSSIAN))),
                new Book("The Alchemist",
                        new HashSet<>(Set.of(Language.ENGLISH, Language.GERMAN))),
                new Book("The Little Prince",
                        new HashSet<>(Set.of(Language.GERMAN, Language.RUSSIAN))),
                new Book("Art of war",
                        new HashSet<>(Set.of(Language.SPANISH, Language.RUSSIAN)))
        );

        this.resultList = new ArrayList<>();
    }

    @Test
    void test4() {
        //replace every instance of russian with chinese

        this.bookList.forEach(System.out::println);

        // то что мы пока придумали в созвоне:
        
//        this.resultList = this.bookList
//                .stream()
//                .peek(book -> book.setLanguages(
//                            book.getLanguages()
//                                    .stream()
//                                    .peek(language -> language == Language.RUSSIAN? language = Language.CHINESE : language)
//                        )
//                )


        System.out.println("-------------------------------------------");

        this.resultList.forEach(System.out::println);
    }

}
