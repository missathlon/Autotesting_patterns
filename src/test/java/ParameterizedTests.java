import org.example.example.Document;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertNotNull;

class ParameterizedTests {

    @ParameterizedTest
    @ValueSource(strings = {"Doc1", "Doc2", "Doc3"})
    void testDocumentCreation(String documentName) {
        Document document = new Document(documentName);
        Assertions.assertNotNull(document);
    }
}