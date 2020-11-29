package com.api.music.spider.processor;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.api.music.spider.constants.JiuKuConstant.HOST;

public class JiuKuSearchPageProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);
    private Page page = new Page();

    @Override
    public void process(Page page) {
        List<String> musicList = page.getHtml().$(".musicList").$(".clearfix").all();
        List<Map<String,Object>> music_list = new ArrayList<>();
        for (String music:
             musicList) {
            Html html = Html.create(music);
            music_list.add(new HashMap<String,Object>() {
                {
                    put("song_url",HOST + html.$(".t-song","href"));
                    put("song_name",html.$(".t-song","text"));
                    put("singer_url",HOST + html.$(".t-singer","href"));
                    put("singer_name",html.$(".t-singer","text"));
                }
            });
        }

        this.page.putField("music_list",music_list);
    }

    @Override
    public Site getSite() {
        return site;
    }

    public Page getPage() {
        return page;
    }

//    public static void main(String[] args) {
//        JiuKuPageProcessor processor = new JiuKuPageProcessor();
//        Spider.create(processor).addUrl("http://m.9ku.com/search/?key=%E5%AD%99%E7%87%95%E5%A7%BF").thread(1).run();
//        Page page = processor.getPage();
//        List<Map<String,Object>> music_list = page.getResultItems().get("music_list");
//        System.out.println(music_list);
//    }
}
