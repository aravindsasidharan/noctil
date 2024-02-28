package com.noctil.test.noctiltest.Model;



import jakarta.xml.bind.annotation.XmlElement;


public class MainArtists {

    @XmlElement(name = "MAIN-ARTIST")
    private String mainArtistName;

   

    public String getMainArtistName() {
        return mainArtistName;
    }

    public void setMainArtistName(String mainArtistName) {
        this.mainArtistName = mainArtistName;
    }
}