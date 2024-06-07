package com.cc.musicplaylist.dto.spotify;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * https://developer.spotify.com/documentation/web-api/reference/get-a-list-of-current-users-playlists
 */
public class SpotifyGetCurrentUserPlaylistsResponse {


    /**
     * href : https://api.spotify.com/v1/users/31wt4jle5h6nycqckdqyhtc7636u/playlists?offset=0&limit=50&locale=zh-CN,zh;q%3D0.9
     * limit : 50
     * next : null
     * offset : 0
     * previous : null
     * total : 5
     * items : [{"collaborative":false,"description":"Playlist created by the tutorial on developer.spotify.com","external_urls":{"spotify":"https://open.spotify.com/playlist/1BBwVh4PhnTWzm3qx5B6Wi"},"href":"https://api.spotify.com/v1/playlists/1BBwVh4PhnTWzm3qx5B6Wi","id":"1BBwVh4PhnTWzm3qx5B6Wi","images":[{"height":640,"url":"https://mosaic.scdn.co/640/ab67616d00001e021f7b36c9952248078b95c1a7ab67616d00001e026b7460f18e7f596d57878830ab67616d00001e02d6dbe22a1e76bce856461820ab67616d00001e02df1bad7d6ac25de597640b60","width":640},{"height":300,"url":"https://mosaic.scdn.co/300/ab67616d00001e021f7b36c9952248078b95c1a7ab67616d00001e026b7460f18e7f596d57878830ab67616d00001e02d6dbe22a1e76bce856461820ab67616d00001e02df1bad7d6ac25de597640b60","width":300},{"height":60,"url":"https://mosaic.scdn.co/60/ab67616d00001e021f7b36c9952248078b95c1a7ab67616d00001e026b7460f18e7f596d57878830ab67616d00001e02d6dbe22a1e76bce856461820ab67616d00001e02df1bad7d6ac25de597640b60","width":60}],"name":"My recommendation playlist","owner":{"display_name":"VAYO (ITINO)","external_urls":{"spotify":"https://open.spotify.com/user/31wt4jle5h6nycqckdqyhtc7636u"},"href":"https://api.spotify.com/v1/users/31wt4jle5h6nycqckdqyhtc7636u","id":"31wt4jle5h6nycqckdqyhtc7636u","type":"user","uri":"spotify:user:31wt4jle5h6nycqckdqyhtc7636u"},"primary_color":null,"public":true,"snapshot_id":"AAAAAkfAaviHVv5VKasS992Y4Sw6s+Bc","tracks":{"href":"https://api.spotify.com/v1/playlists/1BBwVh4PhnTWzm3qx5B6Wi/tracks","total":10},"type":"playlist","uri":"spotify:playlist:1BBwVh4PhnTWzm3qx5B6Wi"},{"collaborative":false,"description":"","external_urls":{"spotify":"https://open.spotify.com/playlist/7inT2Hib6xK1YmOmuCkewi"},"href":"https://api.spotify.com/v1/playlists/7inT2Hib6xK1YmOmuCkewi","id":"7inT2Hib6xK1YmOmuCkewi","images":[{"height":640,"url":"https://mosaic.scdn.co/640/ab67616d00001e020f5c597bba60a1e0c5364baaab67616d00001e02721c8e646ea4ff5315215de9ab67616d00001e02ae076636e20888fb83bbc2b1ab67616d00001e02bc051de00f5d0631b8df4bcd","width":640},{"height":300,"url":"https://mosaic.scdn.co/300/ab67616d00001e020f5c597bba60a1e0c5364baaab67616d00001e02721c8e646ea4ff5315215de9ab67616d00001e02ae076636e20888fb83bbc2b1ab67616d00001e02bc051de00f5d0631b8df4bcd","width":300},{"height":60,"url":"https://mosaic.scdn.co/60/ab67616d00001e020f5c597bba60a1e0c5364baaab67616d00001e02721c8e646ea4ff5315215de9ab67616d00001e02ae076636e20888fb83bbc2b1ab67616d00001e02bc051de00f5d0631b8df4bcd","width":60}],"name":"孤單又燦爛的神-鬼怪 OST","owner":{"display_name":"curry09","external_urls":{"spotify":"https://open.spotify.com/user/curry09"},"href":"https://api.spotify.com/v1/users/curry09","id":"curry09","type":"user","uri":"spotify:user:curry09"},"primary_color":null,"public":true,"snapshot_id":"AAAAE/MG8zSsLQry4+j7owP06dcWUwnU","tracks":{"href":"https://api.spotify.com/v1/playlists/7inT2Hib6xK1YmOmuCkewi/tracks","total":15},"type":"playlist","uri":"spotify:playlist:7inT2Hib6xK1YmOmuCkewi"},{"collaborative":false,"description":"","external_urls":{"spotify":"https://open.spotify.com/playlist/3rOIvXYWWwrxkY52m124L9"},"href":"https://api.spotify.com/v1/playlists/3rOIvXYWWwrxkY52m124L9","id":"3rOIvXYWWwrxkY52m124L9","images":[{"height":null,"url":"https://i.scdn.co/image/ab67616d00001e02912cc8fe2e9a53d328757a41","width":null}],"name":"jazz hp","owner":{"display_name":"VAYO (ITINO)","external_urls":{"spotify":"https://open.spotify.com/user/31wt4jle5h6nycqckdqyhtc7636u"},"href":"https://api.spotify.com/v1/users/31wt4jle5h6nycqckdqyhtc7636u","id":"31wt4jle5h6nycqckdqyhtc7636u","type":"user","uri":"spotify:user:31wt4jle5h6nycqckdqyhtc7636u"},"primary_color":null,"public":true,"snapshot_id":"AAAAAzYaKtXaCG2Hr0K/Bi1cMgEiClat","tracks":{"href":"https://api.spotify.com/v1/playlists/3rOIvXYWWwrxkY52m124L9/tracks","total":2},"type":"playlist","uri":"spotify:playlist:3rOIvXYWWwrxkY52m124L9"},{"collaborative":false,"description":"","external_urls":{"spotify":"https://open.spotify.com/playlist/3cvGz0uID3FFLFbBJXJnSP"},"href":"https://api.spotify.com/v1/playlists/3cvGz0uID3FFLFbBJXJnSP","id":"3cvGz0uID3FFLFbBJXJnSP","images":[{"height":null,"url":"https://i.scdn.co/image/ab67616d00001e021f7077ae1018b5fbab08dfa8","width":null}],"name":"Queen","owner":{"display_name":"VAYO (ITINO)","external_urls":{"spotify":"https://open.spotify.com/user/31wt4jle5h6nycqckdqyhtc7636u"},"href":"https://api.spotify.com/v1/users/31wt4jle5h6nycqckdqyhtc7636u","id":"31wt4jle5h6nycqckdqyhtc7636u","type":"user","uri":"spotify:user:31wt4jle5h6nycqckdqyhtc7636u"},"primary_color":null,"public":true,"snapshot_id":"AAAAA4hDB30Jtp9xYO5BwBYnQkL6EuCV","tracks":{"href":"https://api.spotify.com/v1/playlists/3cvGz0uID3FFLFbBJXJnSP/tracks","total":1},"type":"playlist","uri":"spotify:playlist:3cvGz0uID3FFLFbBJXJnSP"},{"collaborative":false,"description":"","external_urls":{"spotify":"https://open.spotify.com/playlist/3DUHdMOOsZezrI2crNtjId"},"href":"https://api.spotify.com/v1/playlists/3DUHdMOOsZezrI2crNtjId","id":"3DUHdMOOsZezrI2crNtjId","images":null,"name":"Michael Jackson","owner":{"display_name":"VAYO (ITINO)","external_urls":{"spotify":"https://open.spotify.com/user/31wt4jle5h6nycqckdqyhtc7636u"},"href":"https://api.spotify.com/v1/users/31wt4jle5h6nycqckdqyhtc7636u","id":"31wt4jle5h6nycqckdqyhtc7636u","type":"user","uri":"spotify:user:31wt4jle5h6nycqckdqyhtc7636u"},"primary_color":null,"public":true,"snapshot_id":"AAAAAgYDHmiyCabY0db+8O3SI9mSNLE9","tracks":{"href":"https://api.spotify.com/v1/playlists/3DUHdMOOsZezrI2crNtjId/tracks","total":0},"type":"playlist","uri":"spotify:playlist:3DUHdMOOsZezrI2crNtjId"}]
     */

    private String href;
    private int limit;
    private Object next;
    private int offset;
    private Object previous;
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

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
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
         * collaborative : false
         * description : Playlist created by the tutorial on developer.spotify.com
         * external_urls : {"spotify":"https://open.spotify.com/playlist/1BBwVh4PhnTWzm3qx5B6Wi"}
         * href : https://api.spotify.com/v1/playlists/1BBwVh4PhnTWzm3qx5B6Wi
         * id : 1BBwVh4PhnTWzm3qx5B6Wi
         * images : [{"height":640,"url":"https://mosaic.scdn.co/640/ab67616d00001e021f7b36c9952248078b95c1a7ab67616d00001e026b7460f18e7f596d57878830ab67616d00001e02d6dbe22a1e76bce856461820ab67616d00001e02df1bad7d6ac25de597640b60","width":640},{"height":300,"url":"https://mosaic.scdn.co/300/ab67616d00001e021f7b36c9952248078b95c1a7ab67616d00001e026b7460f18e7f596d57878830ab67616d00001e02d6dbe22a1e76bce856461820ab67616d00001e02df1bad7d6ac25de597640b60","width":300},{"height":60,"url":"https://mosaic.scdn.co/60/ab67616d00001e021f7b36c9952248078b95c1a7ab67616d00001e026b7460f18e7f596d57878830ab67616d00001e02d6dbe22a1e76bce856461820ab67616d00001e02df1bad7d6ac25de597640b60","width":60}]
         * name : My recommendation playlist
         * owner : {"display_name":"VAYO (ITINO)","external_urls":{"spotify":"https://open.spotify.com/user/31wt4jle5h6nycqckdqyhtc7636u"},"href":"https://api.spotify.com/v1/users/31wt4jle5h6nycqckdqyhtc7636u","id":"31wt4jle5h6nycqckdqyhtc7636u","type":"user","uri":"spotify:user:31wt4jle5h6nycqckdqyhtc7636u"}
         * primary_color : null
         * public : true
         * snapshot_id : AAAAAkfAaviHVv5VKasS992Y4Sw6s+Bc
         * tracks : {"href":"https://api.spotify.com/v1/playlists/1BBwVh4PhnTWzm3qx5B6Wi/tracks","total":10}
         * type : playlist
         * uri : spotify:playlist:1BBwVh4PhnTWzm3qx5B6Wi
         */

        private boolean collaborative;
        private String description;
        private ExternalUrlsBean external_urls;
        private String href;
        private String id;
        private String name;
        private OwnerBean owner;
        private Object primary_color;
        // @SerializedName("public")
        @JsonProperty("public")
        private boolean publicX;
        private String snapshot_id;
        private TracksBean tracks;
        private String type;
        private String uri;
        private List<ImagesBean> images;

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

        public Object getPrimary_color() {
            return primary_color;
        }

        public void setPrimary_color(Object primary_color) {
            this.primary_color = primary_color;
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

        public List<ImagesBean> getImages() {
            return images;
        }

        public void setImages(List<ImagesBean> images) {
            this.images = images;
        }

        public static class ExternalUrlsBean {
            /**
             * spotify : https://open.spotify.com/playlist/1BBwVh4PhnTWzm3qx5B6Wi
             */

            private String spotify;

            public String getSpotify() {
                return spotify;
            }

            public void setSpotify(String spotify) {
                this.spotify = spotify;
            }
        }

        public static class OwnerBean {
            /**
             * display_name : VAYO (ITINO)
             * external_urls : {"spotify":"https://open.spotify.com/user/31wt4jle5h6nycqckdqyhtc7636u"}
             * href : https://api.spotify.com/v1/users/31wt4jle5h6nycqckdqyhtc7636u
             * id : 31wt4jle5h6nycqckdqyhtc7636u
             * type : user
             * uri : spotify:user:31wt4jle5h6nycqckdqyhtc7636u
             */

            private String display_name;
            private ExternalUrlsBeanX external_urls;
            private String href;
            private String id;
            private String type;
            private String uri;

            public String getDisplay_name() {
                return display_name;
            }

            public void setDisplay_name(String display_name) {
                this.display_name = display_name;
            }

            public ExternalUrlsBeanX getExternal_urls() {
                return external_urls;
            }

            public void setExternal_urls(ExternalUrlsBeanX external_urls) {
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

            public static class ExternalUrlsBeanX {
                /**
                 * spotify : https://open.spotify.com/user/31wt4jle5h6nycqckdqyhtc7636u
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

        public static class TracksBean {
            /**
             * href : https://api.spotify.com/v1/playlists/1BBwVh4PhnTWzm3qx5B6Wi/tracks
             * total : 10
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

        public static class ImagesBean {
            /**
             * height : 640
             * url : https://mosaic.scdn.co/640/ab67616d00001e021f7b36c9952248078b95c1a7ab67616d00001e026b7460f18e7f596d57878830ab67616d00001e02d6dbe22a1e76bce856461820ab67616d00001e02df1bad7d6ac25de597640b60
             * width : 640
             */

            private int height;
            private String url;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
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
