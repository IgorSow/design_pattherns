package com.sda.builder;

import com.sda.builder.model.Document;
import com.sda.builder.model.DocumentLombok;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Document documentByConstructor = new Document(
                "Plan Dnia",
                "Opis dnia szkoleniowego",
                Instant.now(),
                "Igor",
                Arrays.asList("długopis", "zeszyt", "laptop")
        );

        // setters
        Document documentBySetters = new Document();

        documentBySetters.setTitle("Plan tygodnia");
        documentBySetters.setDescription("Tutaj jest plan tygodnia");
        documentBySetters.setAuthor("Igor Sowinski");
        documentBySetters.setCreationDate(Instant.now());
        documentBySetters.setItems(Arrays.asList("długopis", "zeszyt", "laptop"));

        System.out.println("Hello Word");

        Document document2 = new Document();



        //builder

        Document documentByBuilder = Document.builder()
                .title("Nowy plan")
                .author("Jarek")
                .items(Arrays.asList("długopis", "zeszyt", "laptop"))
                .creationDate(Instant.now())
                .description("Tutaj opis")
                .item("DODANE POZNIEJ")
                .build();

        new Document(documentByBuilder.getTitle(), documentByBuilder.getDescription(),
                documentByBuilder.getCreationDate(), "Jan Kowalski", documentByBuilder.getItems());

        Document jan_kowalski = Document.builder(documentByBuilder)
                .author("Jan Kowalski")
                .build();


        DocumentLombok build = DocumentLombok.builder()
                .author("Igor")
                .description("OPIS")
                .build();


        //STRING BUILDER

        List<String> items = Arrays.asList("Ala", "ma", "kota");
        String result = "";

        for (String item : items) {
            result += item + ' ';
        }
        System.out.println(result);


        //tak robic -- omija problem konkatynacji (sklejanie stringow)

        StringBuilder stringBuilder = new StringBuilder();

        for (String item : items) {
            stringBuilder.append(item).append(" ");

        }
        String s = stringBuilder.toString();
        System.out.println(s);
    }
}
