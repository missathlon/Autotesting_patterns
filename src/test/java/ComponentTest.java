import org.example.example.Document;
import org.example.example.Folder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComponentTest {
    private Document document;
    private Folder folder;

    @BeforeEach
    void setUp() {
        document = new Document("Test Document");
        folder = new Folder("Test Folder");
    }

    @Test
    void testDisplayDocument() {
        // Позитивный тест для отображения документа
        document.display();  // Ожидаем, что этот метод не выбросит исключение
    }

    @Test
    void testDisplayFolder() {
        // Позитивный тест для отображения папки
        folder.display();  // Ожидаем, что этот метод не выбросит исключение
    }

    @Test
    void testRemoveNonExistentComponentFromFolder() {
        // Негативный тест: Удаление несуществующего компонента из папки
        Document anotherDocument = new Document("Another Document");

        assertDoesNotThrow(() -> {
            folder.removeComponent(anotherDocument);
        });
    }

    @Test
    void testDisplayEmptyFolder() {
        // Негативный тест: Отображение пустой папки
        assertDoesNotThrow(() -> {
            folder.display();
        });
    }

    @Test
    void testDisplayFolderWithNullComponent() {
        // Негативный тест: Если в папку добавить компонент с null значением
        folder.addComponent(null);
        assertThrows(NullPointerException.class, () -> {
            folder.display();  // Ожидаем, что это приведет к ошибке
        });
    }
}