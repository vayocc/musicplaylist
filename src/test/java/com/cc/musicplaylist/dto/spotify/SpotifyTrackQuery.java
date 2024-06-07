package com.cc.musicplaylist.dto.spotify;

import java.util.List;


/**
 * https://developer.spotify.com/documentation/web-api/reference/search
 */
public class SpotifyTrackQuery {




    /**
     * tracks : {"href":"https://api.spotify.com/v1/search?query=%E7%A8%BB%E9%A6%99&type=track&locale=zh-CN%2Czh%3Bq%3D0.9&offset=0&limit=5","items":[{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"external_urls":{"spotify":"https://open.spotify.com/album/5akBJuVQvCggD0hCzjfeR3"},"href":"https://api.spotify.com/v1/albums/5akBJuVQvCggD0hCzjfeR3","id":"5akBJuVQvCggD0hCzjfeR3","images":[{"height":640,"url":"https://i.scdn.co/image/ab67616d0000b273bf53c80ff0b0099325818303","width":640},{"height":300,"url":"https://i.scdn.co/image/ab67616d00001e02bf53c80ff0b0099325818303","width":300},{"height":64,"url":"https://i.scdn.co/image/ab67616d00004851bf53c80ff0b0099325818303","width":64}],"name":"魔杰座","release_date":"2008-10-15","release_date_precision":"day","total_tracks":11,"type":"album","uri":"spotify:album:5akBJuVQvCggD0hCzjfeR3"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"disc_number":1,"duration_ms":223453,"explicit":false,"external_ids":{"isrc":"TWK970801511"},"external_urls":{"spotify":"https://open.spotify.com/track/69pyHCoBn4Ki0BzDJ2xPGI"},"href":"https://api.spotify.com/v1/tracks/69pyHCoBn4Ki0BzDJ2xPGI","id":"69pyHCoBn4Ki0BzDJ2xPGI","is_local":false,"name":"稻香","popularity":60,"preview_url":null,"track_number":11,"type":"track","uri":"spotify:track:69pyHCoBn4Ki0BzDJ2xPGI"},{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"external_urls":{"spotify":"https://open.spotify.com/album/6WdM1OfmVIPuQ56QPmaJIr"},"href":"https://api.spotify.com/v1/albums/6WdM1OfmVIPuQ56QPmaJIr","id":"6WdM1OfmVIPuQ56QPmaJIr","images":[{"height":640,"url":"https://i.scdn.co/image/ab67616d0000b273d6dbe22a1e76bce856461820","width":640},{"height":300,"url":"https://i.scdn.co/image/ab67616d00001e02d6dbe22a1e76bce856461820","width":300},{"height":64,"url":"https://i.scdn.co/image/ab67616d00004851d6dbe22a1e76bce856461820","width":64}],"name":"七里香","release_date":"2004-08-03","release_date_precision":"day","total_tracks":10,"type":"album","uri":"spotify:album:6WdM1OfmVIPuQ56QPmaJIr"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"disc_number":1,"duration_ms":297200,"explicit":false,"external_ids":{"isrc":"TWK970400702"},"external_urls":{"spotify":"https://open.spotify.com/track/57w29bSwdIZ6gr6xXOqwc1"},"href":"https://api.spotify.com/v1/tracks/57w29bSwdIZ6gr6xXOqwc1","id":"57w29bSwdIZ6gr6xXOqwc1","is_local":false,"name":"七里香","popularity":62,"preview_url":null,"track_number":2,"type":"track","uri":"spotify:track:57w29bSwdIZ6gr6xXOqwc1"},{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/53Aqa7pvPfyp2BL87sXChk"},"href":"https://api.spotify.com/v1/artists/53Aqa7pvPfyp2BL87sXChk","id":"53Aqa7pvPfyp2BL87sXChk","name":"紀鈞瀚 (Bryan Chi)","type":"artist","uri":"spotify:artist:53Aqa7pvPfyp2BL87sXChk"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TW","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","BY","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","PR","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"external_urls":{"spotify":"https://open.spotify.com/album/3gHiwmbfP2XMFAC8xIJgl8"},"href":"https://api.spotify.com/v1/albums/3gHiwmbfP2XMFAC8xIJgl8","id":"3gHiwmbfP2XMFAC8xIJgl8","images":[{"height":640,"url":"https://i.scdn.co/image/ab67616d0000b2736a8dff7b0a27092182dca53f","width":640},{"height":300,"url":"https://i.scdn.co/image/ab67616d00001e026a8dff7b0a27092182dca53f","width":300},{"height":64,"url":"https://i.scdn.co/image/ab67616d000048516a8dff7b0a27092182dca53f","width":64}],"name":"鋼琴放鬆輕聽 流行輕音樂 華語經典","release_date":"2022-05-11","release_date_precision":"day","total_tracks":20,"type":"album","uri":"spotify:album:3gHiwmbfP2XMFAC8xIJgl8"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/53Aqa7pvPfyp2BL87sXChk"},"href":"https://api.spotify.com/v1/artists/53Aqa7pvPfyp2BL87sXChk","id":"53Aqa7pvPfyp2BL87sXChk","name":"紀鈞瀚 (Bryan Chi)","type":"artist","uri":"spotify:artist:53Aqa7pvPfyp2BL87sXChk"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TW","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","BY","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","PR","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"disc_number":1,"duration_ms":196094,"explicit":false,"external_ids":{"isrc":"TWAA72200348"},"external_urls":{"spotify":"https://open.spotify.com/track/2ueFpCg3TNN9iwXuwnVhS2"},"href":"https://api.spotify.com/v1/tracks/2ueFpCg3TNN9iwXuwnVhS2","id":"2ueFpCg3TNN9iwXuwnVhS2","is_local":false,"name":"稻香 (鋼琴版) [原唱: 周杰倫]","popularity":35,"preview_url":"https://p.scdn.co/mp3-preview/c84d303c3899bdf7d674f352c89d583746ae02bc?cid=cfe923b2d660439caf2b557b21f31221","track_number":1,"type":"track","uri":"spotify:track:2ueFpCg3TNN9iwXuwnVhS2"},{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"external_urls":{"spotify":"https://open.spotify.com/album/7sydOexyOcfIdE9Pt4WR1H"},"href":"https://api.spotify.com/v1/albums/7sydOexyOcfIdE9Pt4WR1H","id":"7sydOexyOcfIdE9Pt4WR1H","images":[{"height":640,"url":"https://i.scdn.co/image/ab67616d0000b273d8e5c2ba79fbc0b700662a1c","width":640},{"height":300,"url":"https://i.scdn.co/image/ab67616d00001e02d8e5c2ba79fbc0b700662a1c","width":300},{"height":64,"url":"https://i.scdn.co/image/ab67616d00004851d8e5c2ba79fbc0b700662a1c","width":64}],"name":"周杰倫的床邊故事","release_date":"2016-06-24","release_date_precision":"day","total_tracks":10,"type":"album","uri":"spotify:album:7sydOexyOcfIdE9Pt4WR1H"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"disc_number":1,"duration_ms":215146,"explicit":false,"external_ids":{"isrc":"TWK971601308"},"external_urls":{"spotify":"https://open.spotify.com/track/2tqF9MPNdYdJU70U0ULO23"},"href":"https://api.spotify.com/v1/tracks/2tqF9MPNdYdJU70U0ULO23","id":"2tqF9MPNdYdJU70U0ULO23","is_local":false,"name":"告白氣球","popularity":64,"preview_url":null,"track_number":8,"type":"track","uri":"spotify:track:2tqF9MPNdYdJU70U0ULO23"},{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"external_urls":{"spotify":"https://open.spotify.com/album/7LjZLklNEA1qENUpfdBHGa"},"href":"https://api.spotify.com/v1/albums/7LjZLklNEA1qENUpfdBHGa","id":"7LjZLklNEA1qENUpfdBHGa","images":[{"height":640,"url":"https://i.scdn.co/image/ab67616d0000b273ccbde411b492bd7edd351383","width":640},{"height":300,"url":"https://i.scdn.co/image/ab67616d00001e02ccbde411b492bd7edd351383","width":300},{"height":64,"url":"https://i.scdn.co/image/ab67616d00004851ccbde411b492bd7edd351383","width":64}],"name":"周杰倫地表最強世界巡迴演唱會","release_date":"2019-11-11","release_date_precision":"day","total_tracks":25,"type":"album","uri":"spotify:album:7LjZLklNEA1qENUpfdBHGa"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"disc_number":1,"duration_ms":213280,"explicit":false,"external_ids":{"isrc":"TWK971901211"},"external_urls":{"spotify":"https://open.spotify.com/track/7uop9gHwEV5yUbmwkHLWFd"},"href":"https://api.spotify.com/v1/tracks/7uop9gHwEV5yUbmwkHLWFd","id":"7uop9gHwEV5yUbmwkHLWFd","is_local":false,"name":"稻香 - Live","popularity":29,"preview_url":null,"track_number":11,"type":"track","uri":"spotify:track:7uop9gHwEV5yUbmwkHLWFd"}],"limit":5,"next":"https://api.spotify.com/v1/search?query=%E7%A8%BB%E9%A6%99&type=track&locale=zh-CN%2Czh%3Bq%3D0.9&offset=5&limit=5","offset":0,"previous":null,"total":105}
     */

    private TracksBean tracks;

    public TracksBean getTracks() {
        return tracks;
    }

    public void setTracks(TracksBean tracks) {
        this.tracks = tracks;
    }

    public static class TracksBean {
        /**
         * href : https://api.spotify.com/v1/search?query=%E7%A8%BB%E9%A6%99&type=track&locale=zh-CN%2Czh%3Bq%3D0.9&offset=0&limit=5
         * items : [{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"external_urls":{"spotify":"https://open.spotify.com/album/5akBJuVQvCggD0hCzjfeR3"},"href":"https://api.spotify.com/v1/albums/5akBJuVQvCggD0hCzjfeR3","id":"5akBJuVQvCggD0hCzjfeR3","images":[{"height":640,"url":"https://i.scdn.co/image/ab67616d0000b273bf53c80ff0b0099325818303","width":640},{"height":300,"url":"https://i.scdn.co/image/ab67616d00001e02bf53c80ff0b0099325818303","width":300},{"height":64,"url":"https://i.scdn.co/image/ab67616d00004851bf53c80ff0b0099325818303","width":64}],"name":"魔杰座","release_date":"2008-10-15","release_date_precision":"day","total_tracks":11,"type":"album","uri":"spotify:album:5akBJuVQvCggD0hCzjfeR3"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"disc_number":1,"duration_ms":223453,"explicit":false,"external_ids":{"isrc":"TWK970801511"},"external_urls":{"spotify":"https://open.spotify.com/track/69pyHCoBn4Ki0BzDJ2xPGI"},"href":"https://api.spotify.com/v1/tracks/69pyHCoBn4Ki0BzDJ2xPGI","id":"69pyHCoBn4Ki0BzDJ2xPGI","is_local":false,"name":"稻香","popularity":60,"preview_url":null,"track_number":11,"type":"track","uri":"spotify:track:69pyHCoBn4Ki0BzDJ2xPGI"},{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"external_urls":{"spotify":"https://open.spotify.com/album/6WdM1OfmVIPuQ56QPmaJIr"},"href":"https://api.spotify.com/v1/albums/6WdM1OfmVIPuQ56QPmaJIr","id":"6WdM1OfmVIPuQ56QPmaJIr","images":[{"height":640,"url":"https://i.scdn.co/image/ab67616d0000b273d6dbe22a1e76bce856461820","width":640},{"height":300,"url":"https://i.scdn.co/image/ab67616d00001e02d6dbe22a1e76bce856461820","width":300},{"height":64,"url":"https://i.scdn.co/image/ab67616d00004851d6dbe22a1e76bce856461820","width":64}],"name":"七里香","release_date":"2004-08-03","release_date_precision":"day","total_tracks":10,"type":"album","uri":"spotify:album:6WdM1OfmVIPuQ56QPmaJIr"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"disc_number":1,"duration_ms":297200,"explicit":false,"external_ids":{"isrc":"TWK970400702"},"external_urls":{"spotify":"https://open.spotify.com/track/57w29bSwdIZ6gr6xXOqwc1"},"href":"https://api.spotify.com/v1/tracks/57w29bSwdIZ6gr6xXOqwc1","id":"57w29bSwdIZ6gr6xXOqwc1","is_local":false,"name":"七里香","popularity":62,"preview_url":null,"track_number":2,"type":"track","uri":"spotify:track:57w29bSwdIZ6gr6xXOqwc1"},{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/53Aqa7pvPfyp2BL87sXChk"},"href":"https://api.spotify.com/v1/artists/53Aqa7pvPfyp2BL87sXChk","id":"53Aqa7pvPfyp2BL87sXChk","name":"紀鈞瀚 (Bryan Chi)","type":"artist","uri":"spotify:artist:53Aqa7pvPfyp2BL87sXChk"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TW","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","BY","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","PR","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"external_urls":{"spotify":"https://open.spotify.com/album/3gHiwmbfP2XMFAC8xIJgl8"},"href":"https://api.spotify.com/v1/albums/3gHiwmbfP2XMFAC8xIJgl8","id":"3gHiwmbfP2XMFAC8xIJgl8","images":[{"height":640,"url":"https://i.scdn.co/image/ab67616d0000b2736a8dff7b0a27092182dca53f","width":640},{"height":300,"url":"https://i.scdn.co/image/ab67616d00001e026a8dff7b0a27092182dca53f","width":300},{"height":64,"url":"https://i.scdn.co/image/ab67616d000048516a8dff7b0a27092182dca53f","width":64}],"name":"鋼琴放鬆輕聽 流行輕音樂 華語經典","release_date":"2022-05-11","release_date_precision":"day","total_tracks":20,"type":"album","uri":"spotify:album:3gHiwmbfP2XMFAC8xIJgl8"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/53Aqa7pvPfyp2BL87sXChk"},"href":"https://api.spotify.com/v1/artists/53Aqa7pvPfyp2BL87sXChk","id":"53Aqa7pvPfyp2BL87sXChk","name":"紀鈞瀚 (Bryan Chi)","type":"artist","uri":"spotify:artist:53Aqa7pvPfyp2BL87sXChk"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TW","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","BY","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","PR","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"disc_number":1,"duration_ms":196094,"explicit":false,"external_ids":{"isrc":"TWAA72200348"},"external_urls":{"spotify":"https://open.spotify.com/track/2ueFpCg3TNN9iwXuwnVhS2"},"href":"https://api.spotify.com/v1/tracks/2ueFpCg3TNN9iwXuwnVhS2","id":"2ueFpCg3TNN9iwXuwnVhS2","is_local":false,"name":"稻香 (鋼琴版) [原唱: 周杰倫]","popularity":35,"preview_url":"https://p.scdn.co/mp3-preview/c84d303c3899bdf7d674f352c89d583746ae02bc?cid=cfe923b2d660439caf2b557b21f31221","track_number":1,"type":"track","uri":"spotify:track:2ueFpCg3TNN9iwXuwnVhS2"},{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"external_urls":{"spotify":"https://open.spotify.com/album/7sydOexyOcfIdE9Pt4WR1H"},"href":"https://api.spotify.com/v1/albums/7sydOexyOcfIdE9Pt4WR1H","id":"7sydOexyOcfIdE9Pt4WR1H","images":[{"height":640,"url":"https://i.scdn.co/image/ab67616d0000b273d8e5c2ba79fbc0b700662a1c","width":640},{"height":300,"url":"https://i.scdn.co/image/ab67616d00001e02d8e5c2ba79fbc0b700662a1c","width":300},{"height":64,"url":"https://i.scdn.co/image/ab67616d00004851d8e5c2ba79fbc0b700662a1c","width":64}],"name":"周杰倫的床邊故事","release_date":"2016-06-24","release_date_precision":"day","total_tracks":10,"type":"album","uri":"spotify:album:7sydOexyOcfIdE9Pt4WR1H"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"disc_number":1,"duration_ms":215146,"explicit":false,"external_ids":{"isrc":"TWK971601308"},"external_urls":{"spotify":"https://open.spotify.com/track/2tqF9MPNdYdJU70U0ULO23"},"href":"https://api.spotify.com/v1/tracks/2tqF9MPNdYdJU70U0ULO23","id":"2tqF9MPNdYdJU70U0ULO23","is_local":false,"name":"告白氣球","popularity":64,"preview_url":null,"track_number":8,"type":"track","uri":"spotify:track:2tqF9MPNdYdJU70U0ULO23"},{"album":{"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"external_urls":{"spotify":"https://open.spotify.com/album/7LjZLklNEA1qENUpfdBHGa"},"href":"https://api.spotify.com/v1/albums/7LjZLklNEA1qENUpfdBHGa","id":"7LjZLklNEA1qENUpfdBHGa","images":[{"height":640,"url":"https://i.scdn.co/image/ab67616d0000b273ccbde411b492bd7edd351383","width":640},{"height":300,"url":"https://i.scdn.co/image/ab67616d00001e02ccbde411b492bd7edd351383","width":300},{"height":64,"url":"https://i.scdn.co/image/ab67616d00004851ccbde411b492bd7edd351383","width":64}],"name":"周杰倫地表最強世界巡迴演唱會","release_date":"2019-11-11","release_date_precision":"day","total_tracks":25,"type":"album","uri":"spotify:album:7LjZLklNEA1qENUpfdBHGa"},"artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"disc_number":1,"duration_ms":213280,"explicit":false,"external_ids":{"isrc":"TWK971901211"},"external_urls":{"spotify":"https://open.spotify.com/track/7uop9gHwEV5yUbmwkHLWFd"},"href":"https://api.spotify.com/v1/tracks/7uop9gHwEV5yUbmwkHLWFd","id":"7uop9gHwEV5yUbmwkHLWFd","is_local":false,"name":"稻香 - Live","popularity":29,"preview_url":null,"track_number":11,"type":"track","uri":"spotify:track:7uop9gHwEV5yUbmwkHLWFd"}]
         * limit : 5
         * next : https://api.spotify.com/v1/search?query=%E7%A8%BB%E9%A6%99&type=track&locale=zh-CN%2Czh%3Bq%3D0.9&offset=5&limit=5
         * offset : 0
         * previous : null
         * total : 105
         */

        private String href;
        private int limit;
        private String next;
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
             * album : {"album_type":"album","artists":[{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}],"available_markets":["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"],"external_urls":{"spotify":"https://open.spotify.com/album/5akBJuVQvCggD0hCzjfeR3"},"href":"https://api.spotify.com/v1/albums/5akBJuVQvCggD0hCzjfeR3","id":"5akBJuVQvCggD0hCzjfeR3","images":[{"height":640,"url":"https://i.scdn.co/image/ab67616d0000b273bf53c80ff0b0099325818303","width":640},{"height":300,"url":"https://i.scdn.co/image/ab67616d00001e02bf53c80ff0b0099325818303","width":300},{"height":64,"url":"https://i.scdn.co/image/ab67616d00004851bf53c80ff0b0099325818303","width":64}],"name":"魔杰座","release_date":"2008-10-15","release_date_precision":"day","total_tracks":11,"type":"album","uri":"spotify:album:5akBJuVQvCggD0hCzjfeR3"}
             * artists : [{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}]
             * available_markets : ["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"]
             * disc_number : 1
             * duration_ms : 223453
             * explicit : false
             * external_ids : {"isrc":"TWK970801511"}
             * external_urls : {"spotify":"https://open.spotify.com/track/69pyHCoBn4Ki0BzDJ2xPGI"}
             * href : https://api.spotify.com/v1/tracks/69pyHCoBn4Ki0BzDJ2xPGI
             * id : 69pyHCoBn4Ki0BzDJ2xPGI
             * is_local : false
             * name : 稻香
             * popularity : 60
             * preview_url : null
             * track_number : 11
             * type : track
             * uri : spotify:track:69pyHCoBn4Ki0BzDJ2xPGI
             */

            private AlbumBean album;
            private int disc_number;
            private int duration_ms;
            private boolean explicit;
            private ExternalIdsBean external_ids;
            private ExternalUrlsBeanXX external_urls;
            private String href;
            private String id;
            private boolean is_local;
            private String name;
            private int popularity;
            private Object preview_url;
            private int track_number;
            private String type;
            private String uri;
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

            public ExternalUrlsBeanXX getExternal_urls() {
                return external_urls;
            }

            public void setExternal_urls(ExternalUrlsBeanXX external_urls) {
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

            public boolean isIs_local() {
                return is_local;
            }

            public void setIs_local(boolean is_local) {
                this.is_local = is_local;
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

            public Object getPreview_url() {
                return preview_url;
            }

            public void setPreview_url(Object preview_url) {
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
                 * album_type : album
                 * artists : [{"external_urls":{"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"},"href":"https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql","id":"2elBjNSdBE2Y3f0j1mjrql","name":"周杰倫","type":"artist","uri":"spotify:artist:2elBjNSdBE2Y3f0j1mjrql"}]
                 * available_markets : ["AR","AU","AT","BE","BO","BR","BG","CA","CL","CO","CR","CY","CZ","DK","DO","DE","EC","EE","SV","FI","FR","GR","GT","HN","HK","HU","IS","IE","IT","LV","LT","LU","MY","MT","MX","NL","NZ","NI","NO","PA","PY","PE","PH","PL","PT","SG","SK","ES","SE","CH","TR","UY","US","GB","AD","LI","MC","ID","JP","TH","VN","RO","IL","ZA","SA","AE","BH","QA","OM","KW","EG","MA","DZ","TN","LB","JO","PS","IN","KZ","MD","UA","AL","BA","HR","ME","MK","RS","SI","KR","BD","PK","LK","GH","KE","NG","TZ","UG","AG","AM","BS","BB","BZ","BT","BW","BF","CV","CW","DM","FJ","GM","GE","GD","GW","GY","HT","JM","KI","LS","LR","MW","MV","ML","MH","FM","NA","NR","NE","PW","PG","WS","SM","ST","SN","SC","SL","SB","KN","LC","VC","SR","TL","TO","TT","TV","VU","AZ","BN","BI","KH","CM","TD","KM","GQ","SZ","GA","GN","KG","LA","MO","MR","MN","NP","RW","TG","UZ","ZW","BJ","MG","MU","MZ","AO","CI","DJ","ZM","CD","CG","IQ","LY","TJ","VE","ET","XK"]
                 * external_urls : {"spotify":"https://open.spotify.com/album/5akBJuVQvCggD0hCzjfeR3"}
                 * href : https://api.spotify.com/v1/albums/5akBJuVQvCggD0hCzjfeR3
                 * id : 5akBJuVQvCggD0hCzjfeR3
                 * images : [{"height":640,"url":"https://i.scdn.co/image/ab67616d0000b273bf53c80ff0b0099325818303","width":640},{"height":300,"url":"https://i.scdn.co/image/ab67616d00001e02bf53c80ff0b0099325818303","width":300},{"height":64,"url":"https://i.scdn.co/image/ab67616d00004851bf53c80ff0b0099325818303","width":64}]
                 * name : 魔杰座
                 * release_date : 2008-10-15
                 * release_date_precision : day
                 * total_tracks : 11
                 * type : album
                 * uri : spotify:album:5akBJuVQvCggD0hCzjfeR3
                 */

                private String album_type;
                private ExternalUrlsBean external_urls;
                private String href;
                private String id;
                private String name;
                private String release_date;
                private String release_date_precision;
                private int total_tracks;
                private String type;
                private String uri;
                private List<ArtistsBean> artists;
                private List<String> available_markets;
                private List<ImagesBean> images;

                public String getAlbum_type() {
                    return album_type;
                }

                public void setAlbum_type(String album_type) {
                    this.album_type = album_type;
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

                public int getTotal_tracks() {
                    return total_tracks;
                }

                public void setTotal_tracks(int total_tracks) {
                    this.total_tracks = total_tracks;
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

                public List<ArtistsBean> getArtists() {
                    return artists;
                }

                public void setArtists(List<ArtistsBean> artists) {
                    this.artists = artists;
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

                public static class ExternalUrlsBean {
                    /**
                     * spotify : https://open.spotify.com/album/5akBJuVQvCggD0hCzjfeR3
                     */

                    private String spotify;

                    public String getSpotify() {
                        return spotify;
                    }

                    public void setSpotify(String spotify) {
                        this.spotify = spotify;
                    }
                }

                public static class ArtistsBean {
                    /**
                     * external_urls : {"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"}
                     * href : https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql
                     * id : 2elBjNSdBE2Y3f0j1mjrql
                     * name : 周杰倫
                     * type : artist
                     * uri : spotify:artist:2elBjNSdBE2Y3f0j1mjrql
                     */

                    private ExternalUrlsBeanX external_urls;
                    private String href;
                    private String id;
                    private String name;
                    private String type;
                    private String uri;

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

                    public static class ExternalUrlsBeanX {
                        /**
                         * spotify : https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql
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

                public static class ImagesBean {
                    /**
                     * height : 640
                     * url : https://i.scdn.co/image/ab67616d0000b273bf53c80ff0b0099325818303
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

            public static class ExternalIdsBean {
                /**
                 * isrc : TWK970801511
                 */

                private String isrc;

                public String getIsrc() {
                    return isrc;
                }

                public void setIsrc(String isrc) {
                    this.isrc = isrc;
                }
            }

            public static class ExternalUrlsBeanXX {
                /**
                 * spotify : https://open.spotify.com/track/69pyHCoBn4Ki0BzDJ2xPGI
                 */

                private String spotify;

                public String getSpotify() {
                    return spotify;
                }

                public void setSpotify(String spotify) {
                    this.spotify = spotify;
                }
            }

            public static class ArtistsBeanX {
                /**
                 * external_urls : {"spotify":"https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql"}
                 * href : https://api.spotify.com/v1/artists/2elBjNSdBE2Y3f0j1mjrql
                 * id : 2elBjNSdBE2Y3f0j1mjrql
                 * name : 周杰倫
                 * type : artist
                 * uri : spotify:artist:2elBjNSdBE2Y3f0j1mjrql
                 */

                private ExternalUrlsBeanXXX external_urls;
                private String href;
                private String id;
                private String name;
                private String type;
                private String uri;

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

                public static class ExternalUrlsBeanXXX {
                    /**
                     * spotify : https://open.spotify.com/artist/2elBjNSdBE2Y3f0j1mjrql
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
    }
}
