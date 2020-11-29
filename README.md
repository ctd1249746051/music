## 项目介绍

免费私人音乐播放器，可在线听付费音乐，可同时在PC端和手机端播放。



## 注意

重要的事说三次：**禁止商用！禁止商用！禁止商用！**

本项目仅供学习参考，请尊重原作版权，违者自负。



## 技术

Spring Boot框架

WebMagic爬虫框架

Swagger接口可视化框架

Thymeleaf模板框架

播放器模板：感谢 [[MKOnlineMusicPlayer](https://github.com/mengkunsoft/MKOnlineMusicPlayer)]()提供的模板。

播放器模板改进：添加删除音乐的功能



## 接口

接口：/search

描述：搜索音乐

| 参数 | 描述                   |
| ---- | ---------------------- |
| name | 关键词（歌手、音乐名） |

| 返回值      | 描述     |
| ----------- | -------- |
| singer_url  | 歌手链接 |
| singer_name | 歌手     |
| song_name   | 音乐     |
| song_url    | 音乐链接 |

返回值示例：

```
{
  "code": "0",
  "msg": "成功",
  "data": {
    "music_list": [
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "遇见"
        },
        "song_url": "http://m.9ku.com/play/42702.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "绿光"
        },
        "song_url": "http://m.9ku.com/play/2724.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "时光小偷"
        },
        "song_url": "http://m.9ku.com/play/410664.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "我怀念的"
        },
        "song_url": "http://m.9ku.com/play/82491.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "开始懂了"
        },
        "song_url": "http://m.9ku.com/play/23563.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "遇见（钢琴）"
        },
        "song_url": "http://m.9ku.com/play/454120.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "天黑黑"
        },
        "song_url": "http://m.9ku.com/play/23568.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "眼泪成诗"
        },
        "song_url": "http://m.9ku.com/play/70600.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "我的爱"
        },
        "song_url": "http://m.9ku.com/play/61688.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "奔"
        },
        "song_url": "http://m.9ku.com/play/61687.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "雨天"
        },
        "song_url": "http://m.9ku.com/play/78401.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/3621.htm",
        "singer_name": {
          "firstSourceText": "华人群星"
        },
        "song_name": {
          "firstSourceText": "站起来 - 成龙/王力宏/孙燕姿/韩红"
        },
        "song_url": "http://m.9ku.com/play/96146.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "我也很想他"
        },
        "song_url": "http://m.9ku.com/play/61690.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "逆光"
        },
        "song_url": "http://m.9ku.com/play/82050.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "直来直往"
        },
        "song_url": "http://m.9ku.com/play/12457.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "木兰情（完整版）"
        },
        "song_url": "http://m.9ku.com/play/434182.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "第一天"
        },
        "song_url": "http://m.9ku.com/play/70603.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "我不难过"
        },
        "song_url": "http://m.9ku.com/play/33824.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "完美的一天"
        },
        "song_url": "http://m.9ku.com/play/70599.htm"
      },
      {
        "singer_url": "http://m.9ku.com/geshou/527.htm",
        "singer_name": {
          "firstSourceText": "孙燕姿"
        },
        "song_name": {
          "firstSourceText": "神奇"
        },
        "song_url": "http://m.9ku.com/play/28292.htm"
      }
    ]
  }
}
```



接口：/get_music

描述：获取音乐mp3

| 参数 | 描述     |
| ---- | -------- |
| url  | 音乐链接 |

| 返回值 | 描述    |
| ------ | ------- |
| mp3    | 音乐mp3 |
| pic    | 封面    |
| lyrics | 歌词    |

返回值示例：

```
{
  "code": "0",
  "msg": "成功",
  "data": {
    "music": {
      "mp3": "http://mp3.9ku.com/hot/2004/07-17/33824.mp3",
      "pic": {
        "firstSourceText": "http://aliyunimg.9ku.com/pic/zjpic/1/1652.jpg?x-oss-process=image/resize,m_fill,w_150,h_150,limit_0/auto-orient,0"
      },
      "lyrics": {
        "firstSourceText": "[ti:我不难过] [ar:孙燕姿] [al:未完成] [by:xubaolei] [offset:500] [00:31.85]又站在你家的门口我们重复沉默 [00:38.03]这样子单方面的守候 [00:41.98]还能多久 [02:16.15][00:47.10]终于你开口向我述说他有多温柔 [02:22.12][00:53.38]虽然你还握著我的手 [02:16.06][00:57.20]但我已不在你心中 [02:30.48][01:02.02]我真的懂 你不是喜新厌旧 [04:00.57][02:37.75][01:09.33]是我 没有 [04:03.71][02:40.71][01:12.41]陪在你身边当你寂寞时候 [04:09.14][02:46.14][01:17.75]别再看著我说著你爱过 别太伤痛 [04:15.49][02:52.48][01:24.10]我不难过 这不算什么 [04:18.97][02:55.89][01:27.50]只是为什么眼泪会流我也不懂 [03:00.09][01:31.82]就让我走 让我开始享受自由 [03:07.79][01:39.27]回忆很多 你的影子也会充满我生活 [03:16.06][01:47.54]我并不懦弱 你比谁都懂 [03:21.01][01:52.46]虽然寂寞 这会是我 最后的宽容 [03:30.83]抱紧我 再抱紧我 [03:34.23]这一份感动 就请你让我留在胸口 [03:38.13]别再说 是你的错 [03:41.71]爱到了尽头 是非对错 [03:44.49]就让它随风 忘了所有 过的比你快活 [03:53.35]真的懂 你不是喜新厌旧 [04:23.30]不要再说 或许这是最好的结果 [04:30.43]现在分手 总好过你不爱我一拖再拖 [04:39.12]松开你的手 离开你左右 [04:44.03]我向前走 这会是我真正的解脱"
      }
    }
  }
}
```



## 在线接口测试

接口：/swagger-ui.html

示例：

![image-20201129142650813](images\image-20201129142650813.png)

![image-20201129142740154](images\image-20201129142740154.png)

![image-20201129142817842](images\image-20201129142817842.png)



## PC端项目演示

![image-20201129143247654](images\image-20201129143247654.png)

![image-20201129143310324](images\image-20201129143310324.png)

![image-20201129143403654](images\image-20201129143403654.png)

搜索歌手可能会不全，推荐搜索歌名。



## 手机端项目演示

首先确保电脑的项目正常运行，并且手机和电脑在同一个WIFI。

查看本地内网ip（win+R，输入cmd，再输入ipconfig）

![image-20201129143621053](images\image-20201129143621053.png)

![image-20201129143700689](images\image-20201129143700689.png)

手机访问，内网ip:项目端口（默认8080）

（推荐使用手机浏览器，微信自带浏览器可能播放不了。）

![image-20201129144212939](images\image-20201129144212939.png)

![image-20201129144242784](images\image-20201129144242784.png)

![image-20201129144311341](images\image-20201129144311341.png)



## 作者

普通大学生一枚。

其他个人作品：

[小R资源](https://www.tomyres.com/)



## 公众号

微信公众号：编程服务生活

微信号：codeFL

![image-20201129144637187](images\image-20201129144637187.png)

微信公众号：小R资源

微信号：yoursXiaoR

![image-20201129144946390](images\image-20201129144946390.png)

## 交流群

QQ群：Python交流分享群

群号：812653899

![Python交流分享群群聊二维码](images\Python交流分享群群聊二维码.png)

