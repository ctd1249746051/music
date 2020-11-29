package com.api.music.spider.processor;

import org.springframework.util.StringUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.api.music.spider.constants.JiuKuConstant.HOST;

public class JiuKuDLPageProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);
    private Page page = new Page();

    @Override
    public void process(Page page) {
        // 获取head标签内容
        String data = page.getHtml().getDocument().head().data();
        // 匹配mp3
        Pattern pattern = Pattern.compile("(?<=mp3:\")(.*)(?=\"})");
        Matcher matcher = pattern.matcher(data);
        String mp3;

        while(matcher.find()){
            mp3 = matcher.group(1);
            this.page.putField("mp3",mp3);
        }

        // 歌词
        this.page.putField("lyrics",page.getHtml().$("#lrc_content","text"));
        this.page.putField("pic",page.getHtml().$("#jp_container_1").$(".playerAlbum").$("img","src"));
    }

    @Override
    public Site getSite() {
        return site;
    }

    public Page getPage() {
        return page;
    }

//    public static void main(String[] args) {
//        JiuKuDLPageProcessor processor = new JiuKuDLPageProcessor();
//        Spider.create(processor).addUrl("http://m.9ku.com/play/91161.htm").thread(1).run();
//        Page page = processor.getPage();
//        String mp3 = page.getResultItems().get("mp3");
//        System.out.println(mp3);
//    }
}
