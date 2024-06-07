package top.anyel.app_prueba.service_app;

import org.springframework.stereotype.Service;
import top.anyel.app_prueba.model_app.exercise1.Book_appd;
import top.anyel.app_prueba.model_app.exercise1.Publisher_appd;
import top.anyel.app_prueba.repository_app.PublisherRepository_appd;

@Service
public class PublisherService_appd {

    private final PublisherRepository_appd publisherRepositoryAppd;

    public PublisherService_appd(PublisherRepository_appd publisherRepositoryAppd) {
        this.publisherRepositoryAppd = publisherRepositoryAppd;
    }

    public Publisher_appd save(Publisher_appd publisherAppd) {
        return publisherRepositoryAppd.save_appd(publisherAppd);
    }

    public Publisher_appd updatePublisherById_appd(int id, Publisher_appd publisherAppd) {
        return publisherRepositoryAppd.updateById_appd(id, publisherAppd);
    }

    public Book_appd updateBookById_appd(int id, Book_appd bookAppd) {
        return publisherRepositoryAppd.updateBookById_appd(id, bookAppd);
    }

    public String deleteBookById_appd(int id) {
        return publisherRepositoryAppd.deleteBookById_appd(id);
    }
}
