package com.noctil.test.noctiltest.Model;

import jakarta.xml.bind.annotation.XmlElement;

public class Recording {


    @XmlElement(name = "RECORDING-TITLE-COLLECTING-SOCIETY")
    private String title;

    @XmlElement(name = "MAIN-ARTISTS")
    private MainArtists mainArtists;

 

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MainArtists getMainArtists() {
        return mainArtists;
    }

    
}
