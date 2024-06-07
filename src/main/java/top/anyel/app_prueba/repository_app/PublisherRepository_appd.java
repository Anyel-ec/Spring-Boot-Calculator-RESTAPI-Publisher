package top.anyel.app_prueba.repository_app;

import org.springframework.stereotype.Repository;
import top.anyel.app_prueba.model_app.exercise1.Book_appd;
import top.anyel.app_prueba.model_app.exercise1.Publisher_appd;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PublisherRepository_appd {

    List<Publisher_appd> publisherAppds = new ArrayList<>();
    List<Book_appd> bookAppds = new ArrayList<>();

    public Publisher_appd save_appd (Publisher_appd publisherAppd){
        publisherAppds.add(publisherAppd);
        return publisherAppd;
    }

    public Publisher_appd updateById_appd(int id, Publisher_appd publisherAppd){
        for(int i = 0; i < publisherAppds.size(); i++){
            if(publisherAppds.get(i).getId_app() == id){
                publisherAppds.set(i, publisherAppd);
                return publisherAppd;
            }
        }
        return null;
    }

    public Book_appd updateBookById_appd(int id, Book_appd bookAppd){
        for(int i = 0; i < bookAppds.size(); i++){
            if(bookAppds.get(i).getId_appd() == id){
                bookAppds.set(i, bookAppd);
                return bookAppd;
            }
        }
        return null;
    }



    public String deleteBookById_appd(int id){
        for(int i = 0; i < bookAppds.size(); i++){
            if(bookAppds.get(i).getId_appd() == id){
                bookAppds.remove(i);
                return "Book with id " + id + " was deleted";
            }
        }
        return null;
    }




}
