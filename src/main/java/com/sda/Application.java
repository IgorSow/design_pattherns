package com.sda;

import com.sda.model.Document;

import javax.xml.parsers.DocumentBuilder;
import java.time.Instant;
import java.util.Arrays;

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


    }
}
