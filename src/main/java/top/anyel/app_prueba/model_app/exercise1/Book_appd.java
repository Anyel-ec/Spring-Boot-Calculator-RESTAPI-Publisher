package top.anyel.app_prueba.model_app.exercise1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


@Data
@AllArgsConstructor

public class Book_appd {
    private Integer id_appd;
    private String isbn_appd;
    private String title_appd;
    private String total_pages_appd;

    private LocalDate publication_year_app;
}
