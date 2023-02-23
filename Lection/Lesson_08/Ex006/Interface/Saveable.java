package Lection.Lesson_08.Ex006.Interface;

import Lection.Lesson_08.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
