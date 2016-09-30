package com.papus.los.carbookapp.models;

/**
 * Created by usuario on 29/09/2016.
 */

public class Ad {
    private String title;
    private String description;
    private String pictureUri;
    private String client; // Momentaneo hasta tener la clase cliente xq un cliente tiene muchos anuncios

    public Ad(String title, String description, String pictureUri, String client){
        this.setClient(client);
        this.setTitle(title);
        this.setDescription(description);
        this.setPictureUri(pictureUri);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUri() {
        return pictureUri;
    }

    public void setPictureUri(String pictureUri) {
        this.pictureUri = pictureUri;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
