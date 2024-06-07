package com.cc.musicplaylist.dto.spotify;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * https://developer.spotify.com/documentation/web-api/reference/create-playlist
 */
public class CreatePlaylistResponse {


    /**
     * collaborative : false
     * description : string
     * external_urls : {"spotify":"string"}
     * followers : {"href":"string","total":0}
     * href : string
     * id : string
     * images : [{"url":"https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228","height":300,"width":300}]
     * name : string
     * owner : {"external_urls":{"spotify":"string"},"followers":{"href":"string","total":0},"href":"string","id":"string","type":"user","uri":"string","display_name":"string"}
     * public : false
     * snapshot_id : string
     * tracks : {"href":"https://api.spotify.com/v1/me/shows?offset=0&limit=20","limit":20,"next":"https://api.spotify.com/v1/me/shows?offset=1&limit=1","offset":0,"previous":"https://api.spotify.com/v1/me/shows?offset=1&limit=1","total":4,"items":[{"added_at":"string","added_by":{"external_urls":{"spotify":"string"},"followers":{"href":"string","total":0},"href":"string","id":"string","type":"user","uri":"string"},"is_local":false,"track":{"album":{"album_type":"compilation","total_tracks":9,"available_markets":["CA","BR","IT"],"external_urls":{"spotify":"string"},"href":"string","id":"2up3OPMp9Tb4dAKM2erWXQ","images":[{"url":"https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228","height":300,"width":300}],"name":"string","release_date":"1981-12","release_date_precision":"year","restrictions":{"reason":"market"},"type":"album","uri":"spotify:album:2up3OPMp9Tb4dAKM2erWXQ","artists":[{"external_urls":{"spotify":"string"},"href":"string","id":"string","name":"string","type":"artist","uri":"string"}]},"artists":[{"external_urls":{"spotify":"string"},"followers":{"href":"string","total":0},"genres":["Prog rock","Grunge"],"href":"string","id":"string","images":[{"url":"https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228","height":300,"width":300}],"name":"string","popularity":0,"type":"artist","uri":"string"}],"available_markets":["string"],"disc_number":0,"duration_ms":0,"explicit":false,"external_ids":{"isrc":"string","ean":"string","upc":"string"},"external_urls":{"spotify":"string"},"href":"string","id":"string","is_playable":false,"linked_from":{},"restrictions":{"reason":"string"},"name":"string","popularity":0,"preview_url":"string","track_number":0,"type":"track","uri":"string","is_local":false}}]}
     * type : string
     * uri : string
     */

    private boolean collaborative;
    private String description;
    private ExternalUrlsBean external_urls;
    private FollowersBean followers;
    private String href;
    private String id;
    private String name;
    private OwnerBean owner;
    @SerializedName("public")
    private boolean publicX;
    private String snapshot_id;
    private TracksBean tracks;
    private String type;
    private String uri;
    private List<ImagesBeanXX> images;

    public boolean isCollaborative() {
        return collaborative;
    }

    public void setCollaborative(boolean collaborative) {
        this.collaborative = collaborative;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExternalUrlsBean getExternal_urls() {
        return external_urls;
    }

    public void setExternal_urls(ExternalUrlsBean external_urls) {
        this.external_urls = external_urls;
    }

    public FollowersBean getFollowers() {
        return followers;
    }

    public void setFollowers(FollowersBean followers) {
        this.followers = followers;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OwnerBean getOwner() {
        return owner;
    }

    public void setOwner(OwnerBean owner) {
        this.owner = owner;
    }

    public boolean isPublicX() {
        return publicX;
    }

    public void setPublicX(boolean publicX) {
        this.publicX = publicX;
    }

    public String getSnapshot_id() {
        return snapshot_id;
    }

    public void setSnapshot_id(String snapshot_id) {
        this.snapshot_id = snapshot_id;
    }

    public TracksBean getTracks() {
        return tracks;
    }

    public void setTracks(TracksBean tracks) {
        this.tracks = tracks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<ImagesBeanXX> getImages() {
        return images;
    }

    public void setImages(List<ImagesBeanXX> images) {
        this.images = images;
    }

    public static class ExternalUrlsBean {
        /**
         * spotify : string
         */

        private String spotify;

        public String getSpotify() {
            return spotify;
        }

        public void setSpotify(String spotify) {
            this.spotify = spotify;
        }
    }

    public static class FollowersBean {
        /**
         * href : string
         * total : 0
         */

        private String href;
        private int total;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }

    public static class OwnerBean {
        /**
         * external_urls : {"spotify":"string"}
         * followers : {"href":"string","total":0}
         * href : string
         * id : string
         * type : user
         * uri : string
         * display_name : string
         */

        private ExternalUrlsBeanX external_urls;
        private FollowersBeanX followers;
        private String href;
        private String id;
        private String type;
        private String uri;
        private String display_name;

        public ExternalUrlsBeanX getExternal_urls() {
            return external_urls;
        }

        public void setExternal_urls(ExternalUrlsBeanX external_urls) {
            this.external_urls = external_urls;
        }

        public FollowersBeanX getFollowers() {
            return followers;
        }

        public void setFollowers(FollowersBeanX followers) {
            this.followers = followers;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public String getDisplay_name() {
            return display_name;
        }

        public void setDisplay_name(String display_name) {
            this.display_name = display_name;
        }

        public static class ExternalUrlsBeanX {
            /**
             * spotify : string
             */

            private String spotify;

            public String getSpotify() {
                return spotify;
            }

            public void setSpotify(String spotify) {
                this.spotify = spotify;
            }
        }

        public static class FollowersBeanX {
            /**
             * href : string
             * total : 0
             */

            private String href;
            private int total;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }
        }
    }

    public static class TracksBean {
        /**
         * href : https://api.spotify.com/v1/me/shows?offset=0&limit=20
         * limit : 20
         * next : https://api.spotify.com/v1/me/shows?offset=1&limit=1
         * offset : 0
         * previous : https://api.spotify.com/v1/me/shows?offset=1&limit=1
         * total : 4
         * items : [{"added_at":"string","added_by":{"external_urls":{"spotify":"string"},"followers":{"href":"string","total":0},"href":"string","id":"string","type":"user","uri":"string"},"is_local":false,"track":{"album":{"album_type":"compilation","total_tracks":9,"available_markets":["CA","BR","IT"],"external_urls":{"spotify":"string"},"href":"string","id":"2up3OPMp9Tb4dAKM2erWXQ","images":[{"url":"https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228","height":300,"width":300}],"name":"string","release_date":"1981-12","release_date_precision":"year","restrictions":{"reason":"market"},"type":"album","uri":"spotify:album:2up3OPMp9Tb4dAKM2erWXQ","artists":[{"external_urls":{"spotify":"string"},"href":"string","id":"string","name":"string","type":"artist","uri":"string"}]},"artists":[{"external_urls":{"spotify":"string"},"followers":{"href":"string","total":0},"genres":["Prog rock","Grunge"],"href":"string","id":"string","images":[{"url":"https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228","height":300,"width":300}],"name":"string","popularity":0,"type":"artist","uri":"string"}],"available_markets":["string"],"disc_number":0,"duration_ms":0,"explicit":false,"external_ids":{"isrc":"string","ean":"string","upc":"string"},"external_urls":{"spotify":"string"},"href":"string","id":"string","is_playable":false,"linked_from":{},"restrictions":{"reason":"string"},"name":"string","popularity":0,"preview_url":"string","track_number":0,"type":"track","uri":"string","is_local":false}}]
         */

        private String href;
        private int limit;
        private String next;
        private int offset;
        private String previous;
        private int total;
        private List<ItemsBean> items;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public String getPrevious() {
            return previous;
        }

        public void setPrevious(String previous) {
            this.previous = previous;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * added_at : string
             * added_by : {"external_urls":{"spotify":"string"},"followers":{"href":"string","total":0},"href":"string","id":"string","type":"user","uri":"string"}
             * is_local : false
             * track : {"album":{"album_type":"compilation","total_tracks":9,"available_markets":["CA","BR","IT"],"external_urls":{"spotify":"string"},"href":"string","id":"2up3OPMp9Tb4dAKM2erWXQ","images":[{"url":"https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228","height":300,"width":300}],"name":"string","release_date":"1981-12","release_date_precision":"year","restrictions":{"reason":"market"},"type":"album","uri":"spotify:album:2up3OPMp9Tb4dAKM2erWXQ","artists":[{"external_urls":{"spotify":"string"},"href":"string","id":"string","name":"string","type":"artist","uri":"string"}]},"artists":[{"external_urls":{"spotify":"string"},"followers":{"href":"string","total":0},"genres":["Prog rock","Grunge"],"href":"string","id":"string","images":[{"url":"https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228","height":300,"width":300}],"name":"string","popularity":0,"type":"artist","uri":"string"}],"available_markets":["string"],"disc_number":0,"duration_ms":0,"explicit":false,"external_ids":{"isrc":"string","ean":"string","upc":"string"},"external_urls":{"spotify":"string"},"href":"string","id":"string","is_playable":false,"linked_from":{},"restrictions":{"reason":"string"},"name":"string","popularity":0,"preview_url":"string","track_number":0,"type":"track","uri":"string","is_local":false}
             */

            private String added_at;
            private AddedByBean added_by;
            private boolean is_local;
            private TrackBean track;

            public String getAdded_at() {
                return added_at;
            }

            public void setAdded_at(String added_at) {
                this.added_at = added_at;
            }

            public AddedByBean getAdded_by() {
                return added_by;
            }

            public void setAdded_by(AddedByBean added_by) {
                this.added_by = added_by;
            }

            public boolean isIs_local() {
                return is_local;
            }

            public void setIs_local(boolean is_local) {
                this.is_local = is_local;
            }

            public TrackBean getTrack() {
                return track;
            }

            public void setTrack(TrackBean track) {
                this.track = track;
            }

            public static class AddedByBean {
                /**
                 * external_urls : {"spotify":"string"}
                 * followers : {"href":"string","total":0}
                 * href : string
                 * id : string
                 * type : user
                 * uri : string
                 */

                private ExternalUrlsBeanXX external_urls;
                private FollowersBeanXX followers;
                private String href;
                private String id;
                private String type;
                private String uri;

                public ExternalUrlsBeanXX getExternal_urls() {
                    return external_urls;
                }

                public void setExternal_urls(ExternalUrlsBeanXX external_urls) {
                    this.external_urls = external_urls;
                }

                public FollowersBeanXX getFollowers() {
                    return followers;
                }

                public void setFollowers(FollowersBeanXX followers) {
                    this.followers = followers;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public static class ExternalUrlsBeanXX {
                    /**
                     * spotify : string
                     */

                    private String spotify;

                    public String getSpotify() {
                        return spotify;
                    }

                    public void setSpotify(String spotify) {
                        this.spotify = spotify;
                    }
                }

                public static class FollowersBeanXX {
                    /**
                     * href : string
                     * total : 0
                     */

                    private String href;
                    private int total;

                    public String getHref() {
                        return href;
                    }

                    public void setHref(String href) {
                        this.href = href;
                    }

                    public int getTotal() {
                        return total;
                    }

                    public void setTotal(int total) {
                        this.total = total;
                    }
                }
            }

            public static class TrackBean {
                /**
                 * album : {"album_type":"compilation","total_tracks":9,"available_markets":["CA","BR","IT"],"external_urls":{"spotify":"string"},"href":"string","id":"2up3OPMp9Tb4dAKM2erWXQ","images":[{"url":"https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228","height":300,"width":300}],"name":"string","release_date":"1981-12","release_date_precision":"year","restrictions":{"reason":"market"},"type":"album","uri":"spotify:album:2up3OPMp9Tb4dAKM2erWXQ","artists":[{"external_urls":{"spotify":"string"},"href":"string","id":"string","name":"string","type":"artist","uri":"string"}]}
                 * artists : [{"external_urls":{"spotify":"string"},"followers":{"href":"string","total":0},"genres":["Prog rock","Grunge"],"href":"string","id":"string","images":[{"url":"https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228","height":300,"width":300}],"name":"string","popularity":0,"type":"artist","uri":"string"}]
                 * available_markets : ["string"]
                 * disc_number : 0
                 * duration_ms : 0
                 * explicit : false
                 * external_ids : {"isrc":"string","ean":"string","upc":"string"}
                 * external_urls : {"spotify":"string"}
                 * href : string
                 * id : string
                 * is_playable : false
                 * linked_from : {}
                 * restrictions : {"reason":"string"}
                 * name : string
                 * popularity : 0
                 * preview_url : string
                 * track_number : 0
                 * type : track
                 * uri : string
                 * is_local : false
                 */

                private AlbumBean album;
                private int disc_number;
                private int duration_ms;
                private boolean explicit;
                private ExternalIdsBean external_ids;
                private ExternalUrlsBeanXXXXX external_urls;
                private String href;
                private String id;
                private boolean is_playable;
                private LinkedFromBean linked_from;
                private RestrictionsBeanX restrictions;
                private String name;
                private int popularity;
                private String preview_url;
                private int track_number;
                private String type;
                private String uri;
                private boolean is_local;
                private List<ArtistsBeanX> artists;
                private List<String> available_markets;

                public AlbumBean getAlbum() {
                    return album;
                }

                public void setAlbum(AlbumBean album) {
                    this.album = album;
                }

                public int getDisc_number() {
                    return disc_number;
                }

                public void setDisc_number(int disc_number) {
                    this.disc_number = disc_number;
                }

                public int getDuration_ms() {
                    return duration_ms;
                }

                public void setDuration_ms(int duration_ms) {
                    this.duration_ms = duration_ms;
                }

                public boolean isExplicit() {
                    return explicit;
                }

                public void setExplicit(boolean explicit) {
                    this.explicit = explicit;
                }

                public ExternalIdsBean getExternal_ids() {
                    return external_ids;
                }

                public void setExternal_ids(ExternalIdsBean external_ids) {
                    this.external_ids = external_ids;
                }

                public ExternalUrlsBeanXXXXX getExternal_urls() {
                    return external_urls;
                }

                public void setExternal_urls(ExternalUrlsBeanXXXXX external_urls) {
                    this.external_urls = external_urls;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isIs_playable() {
                    return is_playable;
                }

                public void setIs_playable(boolean is_playable) {
                    this.is_playable = is_playable;
                }

                public LinkedFromBean getLinked_from() {
                    return linked_from;
                }

                public void setLinked_from(LinkedFromBean linked_from) {
                    this.linked_from = linked_from;
                }

                public RestrictionsBeanX getRestrictions() {
                    return restrictions;
                }

                public void setRestrictions(RestrictionsBeanX restrictions) {
                    this.restrictions = restrictions;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getPopularity() {
                    return popularity;
                }

                public void setPopularity(int popularity) {
                    this.popularity = popularity;
                }

                public String getPreview_url() {
                    return preview_url;
                }

                public void setPreview_url(String preview_url) {
                    this.preview_url = preview_url;
                }

                public int getTrack_number() {
                    return track_number;
                }

                public void setTrack_number(int track_number) {
                    this.track_number = track_number;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public boolean isIs_local() {
                    return is_local;
                }

                public void setIs_local(boolean is_local) {
                    this.is_local = is_local;
                }

                public List<ArtistsBeanX> getArtists() {
                    return artists;
                }

                public void setArtists(List<ArtistsBeanX> artists) {
                    this.artists = artists;
                }

                public List<String> getAvailable_markets() {
                    return available_markets;
                }

                public void setAvailable_markets(List<String> available_markets) {
                    this.available_markets = available_markets;
                }

                public static class AlbumBean {
                    /**
                     * album_type : compilation
                     * total_tracks : 9
                     * available_markets : ["CA","BR","IT"]
                     * external_urls : {"spotify":"string"}
                     * href : string
                     * id : 2up3OPMp9Tb4dAKM2erWXQ
                     * images : [{"url":"https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228","height":300,"width":300}]
                     * name : string
                     * release_date : 1981-12
                     * release_date_precision : year
                     * restrictions : {"reason":"market"}
                     * type : album
                     * uri : spotify:album:2up3OPMp9Tb4dAKM2erWXQ
                     * artists : [{"external_urls":{"spotify":"string"},"href":"string","id":"string","name":"string","type":"artist","uri":"string"}]
                     */

                    private String album_type;
                    private int total_tracks;
                    private ExternalUrlsBeanXXX external_urls;
                    private String href;
                    private String id;
                    private String name;
                    private String release_date;
                    private String release_date_precision;
                    private RestrictionsBean restrictions;
                    private String type;
                    private String uri;
                    private List<String> available_markets;
                    private List<ImagesBean> images;
                    private List<ArtistsBean> artists;

                    public String getAlbum_type() {
                        return album_type;
                    }

                    public void setAlbum_type(String album_type) {
                        this.album_type = album_type;
                    }

                    public int getTotal_tracks() {
                        return total_tracks;
                    }

                    public void setTotal_tracks(int total_tracks) {
                        this.total_tracks = total_tracks;
                    }

                    public ExternalUrlsBeanXXX getExternal_urls() {
                        return external_urls;
                    }

                    public void setExternal_urls(ExternalUrlsBeanXXX external_urls) {
                        this.external_urls = external_urls;
                    }

                    public String getHref() {
                        return href;
                    }

                    public void setHref(String href) {
                        this.href = href;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getRelease_date() {
                        return release_date;
                    }

                    public void setRelease_date(String release_date) {
                        this.release_date = release_date;
                    }

                    public String getRelease_date_precision() {
                        return release_date_precision;
                    }

                    public void setRelease_date_precision(String release_date_precision) {
                        this.release_date_precision = release_date_precision;
                    }

                    public RestrictionsBean getRestrictions() {
                        return restrictions;
                    }

                    public void setRestrictions(RestrictionsBean restrictions) {
                        this.restrictions = restrictions;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getAvailable_markets() {
                        return available_markets;
                    }

                    public void setAvailable_markets(List<String> available_markets) {
                        this.available_markets = available_markets;
                    }

                    public List<ImagesBean> getImages() {
                        return images;
                    }

                    public void setImages(List<ImagesBean> images) {
                        this.images = images;
                    }

                    public List<ArtistsBean> getArtists() {
                        return artists;
                    }

                    public void setArtists(List<ArtistsBean> artists) {
                        this.artists = artists;
                    }

                    public static class ExternalUrlsBeanXXX {
                        /**
                         * spotify : string
                         */

                        private String spotify;

                        public String getSpotify() {
                            return spotify;
                        }

                        public void setSpotify(String spotify) {
                            this.spotify = spotify;
                        }
                    }

                    public static class RestrictionsBean {
                        /**
                         * reason : market
                         */

                        private String reason;

                        public String getReason() {
                            return reason;
                        }

                        public void setReason(String reason) {
                            this.reason = reason;
                        }
                    }

                    public static class ImagesBean {
                        /**
                         * url : https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228
                         * height : 300
                         * width : 300
                         */

                        private String url;
                        private int height;
                        private int width;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }
                    }

                    public static class ArtistsBean {
                        /**
                         * external_urls : {"spotify":"string"}
                         * href : string
                         * id : string
                         * name : string
                         * type : artist
                         * uri : string
                         */

                        private ExternalUrlsBeanXXXX external_urls;
                        private String href;
                        private String id;
                        private String name;
                        private String type;
                        private String uri;

                        public ExternalUrlsBeanXXXX getExternal_urls() {
                            return external_urls;
                        }

                        public void setExternal_urls(ExternalUrlsBeanXXXX external_urls) {
                            this.external_urls = external_urls;
                        }

                        public String getHref() {
                            return href;
                        }

                        public void setHref(String href) {
                            this.href = href;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUri() {
                            return uri;
                        }

                        public void setUri(String uri) {
                            this.uri = uri;
                        }

                        public static class ExternalUrlsBeanXXXX {
                            /**
                             * spotify : string
                             */

                            private String spotify;

                            public String getSpotify() {
                                return spotify;
                            }

                            public void setSpotify(String spotify) {
                                this.spotify = spotify;
                            }
                        }
                    }
                }

                public static class ExternalIdsBean {
                    /**
                     * isrc : string
                     * ean : string
                     * upc : string
                     */

                    private String isrc;
                    private String ean;
                    private String upc;

                    public String getIsrc() {
                        return isrc;
                    }

                    public void setIsrc(String isrc) {
                        this.isrc = isrc;
                    }

                    public String getEan() {
                        return ean;
                    }

                    public void setEan(String ean) {
                        this.ean = ean;
                    }

                    public String getUpc() {
                        return upc;
                    }

                    public void setUpc(String upc) {
                        this.upc = upc;
                    }
                }

                public static class ExternalUrlsBeanXXXXX {
                    /**
                     * spotify : string
                     */

                    private String spotify;

                    public String getSpotify() {
                        return spotify;
                    }

                    public void setSpotify(String spotify) {
                        this.spotify = spotify;
                    }
                }

                public static class LinkedFromBean {
                }

                public static class RestrictionsBeanX {
                    /**
                     * reason : string
                     */

                    private String reason;

                    public String getReason() {
                        return reason;
                    }

                    public void setReason(String reason) {
                        this.reason = reason;
                    }
                }

                public static class ArtistsBeanX {
                    /**
                     * external_urls : {"spotify":"string"}
                     * followers : {"href":"string","total":0}
                     * genres : ["Prog rock","Grunge"]
                     * href : string
                     * id : string
                     * images : [{"url":"https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228","height":300,"width":300}]
                     * name : string
                     * popularity : 0
                     * type : artist
                     * uri : string
                     */

                    private ExternalUrlsBeanXXXXXX external_urls;
                    private FollowersBeanXXX followers;
                    private String href;
                    private String id;
                    private String name;
                    private int popularity;
                    private String type;
                    private String uri;
                    private List<String> genres;
                    private List<ImagesBeanX> images;

                    public ExternalUrlsBeanXXXXXX getExternal_urls() {
                        return external_urls;
                    }

                    public void setExternal_urls(ExternalUrlsBeanXXXXXX external_urls) {
                        this.external_urls = external_urls;
                    }

                    public FollowersBeanXXX getFollowers() {
                        return followers;
                    }

                    public void setFollowers(FollowersBeanXXX followers) {
                        this.followers = followers;
                    }

                    public String getHref() {
                        return href;
                    }

                    public void setHref(String href) {
                        this.href = href;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getPopularity() {
                        return popularity;
                    }

                    public void setPopularity(int popularity) {
                        this.popularity = popularity;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<String> getGenres() {
                        return genres;
                    }

                    public void setGenres(List<String> genres) {
                        this.genres = genres;
                    }

                    public List<ImagesBeanX> getImages() {
                        return images;
                    }

                    public void setImages(List<ImagesBeanX> images) {
                        this.images = images;
                    }

                    public static class ExternalUrlsBeanXXXXXX {
                        /**
                         * spotify : string
                         */

                        private String spotify;

                        public String getSpotify() {
                            return spotify;
                        }

                        public void setSpotify(String spotify) {
                            this.spotify = spotify;
                        }
                    }

                    public static class FollowersBeanXXX {
                        /**
                         * href : string
                         * total : 0
                         */

                        private String href;
                        private int total;

                        public String getHref() {
                            return href;
                        }

                        public void setHref(String href) {
                            this.href = href;
                        }

                        public int getTotal() {
                            return total;
                        }

                        public void setTotal(int total) {
                            this.total = total;
                        }
                    }

                    public static class ImagesBeanX {
                        /**
                         * url : https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228
                         * height : 300
                         * width : 300
                         */

                        private String url;
                        private int height;
                        private int width;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }
                    }
                }
            }
        }
    }

    public static class ImagesBeanXX {
        /**
         * url : https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228
         * height : 300
         * width : 300
         */

        private String url;
        private int height;
        private int width;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }
}
