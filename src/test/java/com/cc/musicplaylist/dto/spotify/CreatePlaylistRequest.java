package com.cc.musicplaylist.dto.spotify;

import com.google.gson.annotations.SerializedName;

/**
 * https://developer.spotify.com/documentation/web-api/reference/create-playlist
 */
public class CreatePlaylistRequest {


    /**
     * name : New Playlist
     * description : New playlist description
     * public : false
     */

    private String name;
    private String description;
    @SerializedName("public")
    private boolean publicX;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublicX() {
        return publicX;
    }

    public void setPublicX(boolean publicX) {
        this.publicX = publicX;
    }
}
