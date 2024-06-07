package top.anyel.app_prueba.model_app.exercise1;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.print.Book;
import java.util.List;

@Data
@AllArgsConstructor
public class Publisher_appd {

    private Integer id_app;
    private String name_app;
    private List<Book_appd> book_app;
}
