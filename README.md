[![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg)](https://github.com/996icu/996.ICU/blob/master/LICENSE)
## 一个不幸的消息：
 
### 原作者legend（真名：祝远辉）（酷安@可爱的人一直都是你）于2020年2月14日下午14点因车祸抢救无效去世，此模块项目永久停更，本项目只作为原项目的备份，不会对此模块软件做出任何修改，如修改的话，本人会新开一个项目作为此软件的新维护者来继续维护。
### 愿祝远辉一路走好，R.I.P.
 
# 声明

## 强调一下，本模块并没有看H漫的操作，本模块仅仅用于显示大妈之家那些因版权而屏蔽掉的漫画，如果你想看H漫而使用本模块，不好意思你走错地方了。本模块谢绝智友论坛"一个人的冬季"搬运，请你就此打住，不要再玷污我和我的模块！

## 我做这个模块不是为了断大妈的财路，仅仅是为了能看到被隐藏的漫画，毕竟在个人订阅里都看不到了，想看还挺麻烦的，而且一不小心换个手机后，基本上找不到被隐藏的漫画了。也希望大妈能够坚挺下去，多赚点钱，然后多买几个土豆吧。

## 本模块完全免费，也不允许任何的收费行为，包括但不限于捐助，赞助，打赏，购买以及商业用途，本人也不会因为本模块以任何名义收取任何人一分钱，有钱给我还不如捐给山区里的孩子。

# release

隐藏在大妈土豆服务器里的神秘漫画啊，请在我面前显示你真正的力量，与你定下约定的模块命令你——release！

# 下载地址

[release](https://repo.xposed.info/module/com.app.legend.dms)

[百度网盘提取码: 1234](https://pan.baidu.com/s/1aAZEAWfjQp1LfSmZVzzx5w)



# 更新记录

## 0.23-ψ （普西）

- 适配2.7.023版本，不用此版本大妈请不要使用本版！！！大妈用了360加固，以后的适配只怕会越来越难，且行且珍惜。
- 有兴趣可以看看源码是怎么对付360加固的

## 0.18-π （派）

- 适配2.7.0.18版本，不用该版本大妈请不要升级本版。
- 其余功能照旧，大妈还是没修复保存图片FC的bug

## 0.17-ο（奥密克戎）

- 修复-->官方保存已下载漫画图片FC——没想到我真的会给官方修复这个bug，但这个bug确实由来已久，官方一直不修复，我索性帮它修复了。如果哪天官方修复了这个bug，我会把这个功能撤掉的（捂脸哭）
- 偏移看漫画页面底部手机信息，一些曲面屏手机会无法看完整，所以偏移。长按可恢复，再次长按可偏移
- 另外，不想看大妈广告的可以手动关闭大妈的位置权限以及电话权限，如此一来大妈便清净了。这不是我干的，官方用的广告SDK必须要权限才能投放广告，不给权限那就自然没广告了。
- 去除UI，完全模块化

## 0.17-ξ（柯西）

- 移除强制升级
- 适配2.7.013以上的版本，包括013、014、016、017

## 0.13-ν（纽）

- 删除章节上传功能
- 适配2.7.013以上的版本，包括013、014、016、017

## 0.11-κ （卡帕）

- 适配且仅适配2.7.011版，仅仅适配，如果不用2.7.011版本的大妈，请不要使用本版
- 恢复2.7.011版本大妈下架漫画的下载按钮，某些未被删除资源的漫画可以正常下载
- 去除2.7.011版本大妈下架漫画阅读弹窗，改为正常阅读，但仅针对未被删除资源的漫画，如果该漫画已被删除资源，则无法观看

## 0.1-ι （约塔）

- 修复zip导出无后缀bug
- 修复下载漫画不在下载列表显示bug

## 0.1-θ （西塔）

- 修复上个版本无法显示所有章节的bug
- 收集更多信息，显示更多信息

## 0.1-η （艾塔）

- 增加章节上传功能，用于显示被下架的漫画，上传请点击漫画封面。被下架的漫画如果有过阅读记录，可以断网后进入，之后恢复联网就能上传了。
- 显示被下架的漫画，仅仅显示已被收录的漫画，如果没被收录，那也不能显示
- 增加漫画导出功能，用于导出下载的漫画到sd卡上。具体入口在 我的-漫画下载-管理-导出。导出之前需要勾选需要导出的漫画，默认路径sdcard/release。
- 修复若干bug，提升稳定性
- 增加优先使用本地记录功能，如果在本地找到了浏览记录，就会优先使用本地的记录，如果没有才会去寻找收录。
- 有缘再会

## 0.1-ζ （戴塔）

- 修复若干bug
- 增加漫画本数提示
- 未完待续

## 0.1-ε （伊普西龙）

- 支持太极
- 修改首页指向

## 0.1-δ （德尔塔）

- 固定搜索框位置，修复搜索框消失bug
- 更改漫画源，做到秒刷新。另外，旧源并未放弃，旧版本依旧可以使用，只是速度不尽人意。
- 退出APP后自动隐藏图标
- 没了，祝玩得开心，不对，看得开心。

## 0.1-γ （伽马）

- 添加漫画许愿功能
- 恢复游戏图标，恢复首页广告（我也提到过了不想断大妈财路，之前的版本去掉了首页上的游戏图标以及进入大妈时的广告，现在都恢复了，因为大妈能活到现在不容易，我个人心里还是非常希望大妈能够一直走下去的。之前做这个功能主要是因为调试的时候一直要看这5秒的广告，很浪费时间，才写了个去除的操作，之后上架也忘了去掉这个功能了。）
- 修复搜索框消失bug

 **关于漫画许愿：**

入口在"我的"页面，底部有"点击许愿漫画"字样。
此功能仅仅用于请求某些找不到的漫画，如果你找不到某一本漫画了，又没有阅读记录，则可以通过此功能查找该漫画是否存在，如果存在，则下次的周期更新将会更新该漫画，如果不存在，则表示大妈的土豆里已经删除了该漫画的数据库信息，我也无能为力了。



## 0.1-β （贝塔）
- 添加搜索功能
- 更换默认封面

## 0.1-α （阿尔法）
- 完成隐藏漫画的显示

# 原理

没什么好说的，感谢大妈。

# 共享计划

本模块仅仅收录了一小部分被隐藏的漫画，尚且有一些大头漫画没被收录。不过没关系，我在模块内置了上传功能，如果你发现了某一本被隐藏的漫画，请你在漫画页面点击它的封面，就可以向服务器上传该漫画的一些信息，之后这些漫画就可以在封印页面看到了。
我称之为共享计划，意在让更多被隐藏的漫画被发掘出来，让更多人看到。也不需要那么辛苦地去寻找它们。当然，本功能并没有任何依据可以判断漫画是否被隐藏，所以还请不要随意上传没被隐藏的漫画，一来会对隐藏漫画的筛选带来一定困扰，二来也会影响个人阅览。

# 无法收录的隐藏漫画

- 恋姐倾心
- 源君物语
- 监狱学园
- 出包王女Darkness
- 魔物娘的(相伴)日常
- 女子中学生×人妻
- 漫画家与助手们
- 你是我的荡漾女王
- 放学后的游戏
- 猛兽性少年少女
- 偷窥小孔
- 出包王女
- <S>魔王勇者女魔法使外传</S>
- 天真无邪的乐园
- 修女与吸血鬼	15991
- 异世界精灵的日常喜剧
- 异界魔王与召唤少女的隶属魔术
- <S>恶魔人</S>
- <S>坏孩子也可以吗</S>
- <S>Lost -It’s My Life-</S>
- <S>母娘</S>


以上漫画由于各种原因现已无法在大妈上查看，也无法通过漫画许愿功能找到，或许会有遗漏，或许也有出错，如果有人有幸看到了他们，那就说明是我统计出错了。

# 更新时间

每周的周一会更新一波请求的隐藏漫画，直到没有人请求为之。如果遇到特别多的情况下，也会缩短这个周期。当然到后期只剩下一小部分尚未找到的时候，也会缩短更新时间，避免等待的时间过长。

## 给个窍门，找到喜欢的漫画后请尽量下载观看，毕竟大妈的土豆你懂的~


最后补两张图

![](https://ws1.sinaimg.cn/large/c13993a9ly1g1jst2g16xj20u01o0e14.jpg)
![](https://ws1.sinaimg.cn/large/c13993a9ly1g1jstmro1hj20u01o0x1e.jpg)
