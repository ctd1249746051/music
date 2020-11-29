package com.api.music.spider.utils;

import com.api.music.spider.processor.JiuKuDLPageProcessor;
import com.api.music.spider.processor.JiuKuSearchPageProcessor;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Spider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.api.music.spider.constants.JiuKuConstant.HOST;

public class JiuKuUtil {

    public static Object search(String key) {
        JiuKuSearchPageProcessor processor = new JiuKuSearchPageProcessor();
        Spider.create(processor).addUrl(HOST + "/search/?key="+key).thread(1).run();
        Page page = processor.getPage();

        return page.getResultItems().
                <List<Map<String, Object>>>get("music_list");
    }

    public static HashMap<String,Object> getMusic(String url) {
        JiuKuDLPageProcessor processor = new JiuKuDLPageProcessor();
        Spider.create(processor).addUrl(url).thread(1).run();

        return new HashMap<String, Object>() {
            {
                put("mp3",processor.getPage().getResultItems().get("mp3"));
                put("lyrics",processor.getPage().getResultItems().get("lyrics"));
                put("pic",processor.getPage().getResultItems().get("pic"));
            }
        };
    }
    public static void main(String[] args) {
        List<Map<String,Object>> musicList = (List<Map<String, Object>>) search("孙燕姿");
        for (Map<String,Object> music:
             musicList) {
            HashMap<String, Object> song = getMusic((String) music.get("song_url"));
            System.out.println(music.get("song_name"));
            System.out.println(song.get("mp3"));
            System.out.println(song.get("lyrics"));
        }
    }
}
