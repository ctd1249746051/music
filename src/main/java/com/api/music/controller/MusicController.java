package com.api.music.controller;

import com.api.music.spider.utils.JiuKuUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.api.music.utils.result.*;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping
public class MusicController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private ResultInfo info;

    @ModelAttribute
    void init() {
        info = new ResultInfo();
        logger.info("MusicController");
    }

    @GetMapping
    String index() {
        return "index";
    }

    @GetMapping("/search")
    @ResponseBody
    @ApiOperation("根据关键字搜索音乐")   //用于Swagger展示
    @ApiParam("关键字")
    ResultInfo search(String name) {
        logger.info("MusicController|search");
        try {
            Object search = JiuKuUtil.search(name);
            info.setData(new HashMap<String,Object>() {
                {
                    put("music_list",search);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("音乐查询失败");
            info.setCode(Code.UNKOWNERR);
        }

        return info;
    }

    @GetMapping("/get_music")
    @ResponseBody
    @ApiOperation("根据链接搜索音乐mp3")   //用于Swagger展示
    @ApiParam("链接")
    ResultInfo getMusic(String url) {
        logger.info("MusicController|search");
        try {
            Object search = JiuKuUtil.getMusic(url);
            info.setData(new HashMap<String,Object>() {
                {
                    put("music",search);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("音乐链接获取失败");
            info.setCode(Code.UNKOWNERR);
        }

        return info;
    }
}
