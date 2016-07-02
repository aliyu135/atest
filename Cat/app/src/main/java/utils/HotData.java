package utils;

import java.util.List;

public class  HotData{


    /**
     * expires : 1800
     */

    private ControlBean control;
    /**
     * control : {"expires":1800}
     * status : 0
     * data : {"hasNext":false,"movies":[{"cnms":0,"sn":0,"showInfo":"今天150家影院放映1463场","late":false,"img":"http://p1.meituan.net/165.220/movie/2e0b5b5c6c086cc93068fbc212f9f6b0142193.jpg","sc":8.6,"ver":"2D/3D/中国巨幕","rt":"2016-06-24上映","dur":126,"nm":"惊天魔盗团2","src":"","showDate":"","scm":"周董变魔术，敌人挡不住","imax":false,"snum":170424,"preSale":0,"vd":"","dir":"朱浩伟","star":"杰西·艾森伯格,马克·鲁法洛,伍迪·哈里森","cat":"动作,喜剧,惊悚","wish":513937,"3d":true,"pn":248,"time":"","id":246333},{"cnms":0,"sn":0,"showInfo":"今天95家影院放映100场","late":false,"img":"http://p1.meituan.net/165.220/movie/a375ebfcdc2a396423c368b943813b01179997.jpg","sc":0,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"本周六上映","dur":113,"nm":"忍者神龟2：破影而出","src":"","showDate":"","scm":"儿时忍者龟，犀牛也回归","imax":true,"snum":2431,"preSale":1,"vd":"","dir":"戴夫·格林","star":"梅根·福克斯,皮特·普劳泽克,阿伦·瑞奇森","cat":"动作,冒险,喜剧","wish":280204,"3d":true,"pn":314,"time":"","id":13511},{"cnms":0,"sn":0,"showInfo":"今天149家影院放映1240场","late":false,"img":"http://p1.meituan.net/165.220/movie/45f8587cb425a01c9a279082772a8bd0379497.jpg","sc":8.5,"ver":"2D/3D","rt":"本周五上映","dur":105,"nm":"赏金猎人","src":"","showDate":"","scm":"编外铁饭碗，收钱抓逃犯","imax":false,"snum":8146,"preSale":0,"vd":"","dir":"申太罗","star":"李敏镐,钟汉良,唐嫣","cat":"动作,喜剧,剧情,悬疑","wish":143463,"3d":true,"pn":212,"time":"","id":338506},{"cnms":0,"sn":0,"showInfo":"今天145家影院放映1220场","late":false,"img":"http://p1.meituan.net/165.220/movie/b408a9322cd0da51d4bdd3261ba3d1c0278866.jpg","sc":8.5,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-24上映","dur":120,"nm":"独立日：卷土重来","src":"","showDate":"","scm":"外星再入侵，地核将燃尽","imax":true,"snum":126617,"preSale":0,"vd":"","dir":"罗兰·艾默里奇","star":"利亚姆·海姆斯沃斯,杰夫·高布伦,杰西·厄舍","cat":"动作,冒险,科幻","wish":164747,"3d":true,"pn":227,"time":"","id":246375},{"cnms":0,"sn":0,"showInfo":"今天125家影院放映627场","late":false,"img":"http://p1.meituan.net/165.220/movie/79311d41bea3be8f1677c0b69a5868fa289298.jpg","sc":8.9,"ver":"2D","rt":"本周四上映","dur":99,"nm":"所以\u2026\u2026和黑粉结婚了","src":"","showDate":"","scm":"黑粉变新娘，这是闹哪样","imax":false,"snum":24950,"preSale":0,"vd":"","dir":"金帝荣","star":"朴灿烈,袁姗姗,姜潮","cat":"爱情,喜剧","wish":101609,"3d":false,"pn":161,"time":"","id":343379},{"cnms":0,"sn":0,"showInfo":"2016-07-08 下周五上映","late":false,"img":"http://p0.meituan.net/165.220/movie/37e7ed909843270f0880c325b6be7b60436509.jpg","sc":0,"ver":"2D","rt":"下周五上映","dur":98,"nm":"致青春·原来你还在这里","src":"","showDate":"","scm":"霸道男学霸，爱上女学渣","imax":false,"snum":6566,"preSale":1,"vd":"","dir":"周拓如","star":"吴亦凡,刘亦菲,金世佳","cat":"剧情,爱情","wish":230263,"3d":false,"pn":354,"time":"","id":246575},{"cnms":0,"sn":0,"showInfo":"2016-07-08 下周五上映","late":false,"img":"http://p0.meituan.net/165.220/movie/d196d1391e1dc1eff190275a57a60d6c261789.jpg","sc":0,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"下周五上映","dur":110,"nm":"寒战2","src":"","showDate":"","scm":"警队有黑幕，迷局层层铺","imax":true,"snum":1123,"preSale":1,"vd":"","dir":"梁乐民,陆剑青","star":"郭富城,梁家辉,杨采妮","cat":"动作,犯罪,悬疑","wish":151240,"3d":true,"pn":389,"time":"","id":341289},{"cnms":0,"sn":0,"showInfo":"今天111家影院放映378场","late":false,"img":"http://p0.meituan.net/165.220/movie/e5ff984a4bec976fb1ed429e7fe4f61c605233.jpg","sc":7.9,"ver":"2D/3D","rt":"本周五上映","dur":92,"nm":"魔轮","src":"","showDate":"","scm":"天涯号起航，失控大逃亡","imax":false,"snum":2214,"preSale":0,"vd":"","dir":"王早","star":"林心如,何润东,金世佳","cat":"悬疑,惊悚","wish":11188,"3d":true,"pn":67,"time":"","id":342741},{"cnms":0,"sn":0,"showInfo":"今天116家影院放映363场","late":false,"img":"http://p0.meituan.net/165.220/movie/4c20a91505854dcd0f9617069c5fec21843230.jpg","sc":8.7,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"2016-06-17上映","dur":97,"nm":"海底总动员2：多莉去哪儿","src":"","showDate":"","scm":"唠叨鱼多莉，上路找父母","imax":true,"snum":88213,"preSale":0,"vd":"","dir":"安德鲁·斯坦顿,安格斯·麦克莱恩","star":"艾伦·德詹尼丝,徐帆,艾伯特·布鲁克斯","cat":"动画,喜剧,冒险","wish":144949,"3d":true,"pn":123,"time":"","id":246366},{"cnms":0,"sn":0,"showInfo":"2016-07-08 下周五上映","late":false,"img":"http://p1.meituan.net/165.220/movie/a607ab45bcc9e8486328b39bff0132a4420994.jpg","sc":0,"ver":"3D","rt":"下周五上映","dur":105,"nm":"大鱼海棠","src":"","showDate":"","scm":"北冥有鱼鲲，海棠掌乾坤","imax":false,"snum":4370,"preSale":1,"vd":"","dir":"梁旋,张春","star":"季冠霖,苏尚卿,许魏洲","cat":"动画,奇幻","wish":157909,"3d":true,"pn":149,"time":"","id":246591},{"cnms":0,"sn":0,"showInfo":"今天81家影院放映218场","late":false,"img":"http://p1.meituan.net/165.220/movie/1c82df174422d9374f821482f445171b129671.jpg","sc":6.9,"ver":"2D","rt":"2016-06-24上映","dur":88,"nm":"三人行","src":"","showDate":"","scm":"悍匪有手段，中枪再作案","imax":false,"snum":60826,"preSale":0,"vd":"","dir":"杜琪峰","star":"赵薇,古天乐,钟汉良","cat":"动作,犯罪,悬疑","wish":72910,"3d":false,"pn":195,"time":"","id":246972},{"cnms":0,"sn":0,"showInfo":"今天70家影院放映151场","late":false,"img":"http://p0.meituan.net/165.220/movie/f94e67dcd5b48f034bd7adc892f1b20695854.jpeg","sc":9.2,"ver":"2D/3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-08上映","dur":124,"nm":"魔兽","src":"","showDate":"","scm":"怒拳为谁握，联盟斗部落","imax":true,"snum":796212,"preSale":0,"vd":"","dir":"邓肯·琼斯","star":"崔维斯·费米尔,宝拉·巴顿,本·福斯特","cat":"动作,冒险,奇幻","wish":479894,"3d":true,"pn":347,"time":"","id":78421},{"cnms":0,"sn":0,"showInfo":"2016-07-02 本周六上映","late":false,"img":"http://p0.meituan.net/165.220/movie/329d84307bf99e980c7cb5969dcade4f856773.png","sc":0,"ver":"2D","rt":"本周六上映","dur":81,"nm":"丑小鸭历险记","src":"","showDate":"","scm":"月球机器鸭，化身小飞鸭","imax":false,"snum":160,"preSale":1,"vd":"","dir":"郑义","star":"朱可可,阿飞,夏倚轩","cat":"动画,科幻,冒险","wish":4469,"3d":false,"pn":76,"time":"","id":368271},{"cnms":0,"sn":0,"showInfo":"今天41家影院放映69场","late":false,"img":"http://p1.meituan.net/165.220/movie/c8545c7bd1f6070f0d52a77bd0ddd8738720802.jpg","sc":0,"ver":"2D","rt":"本周一上映","dur":114,"nm":"大火种","src":"","showDate":"","scm":"誓死护宣言，智斗救火种","imax":false,"snum":175,"preSale":0,"vd":"","dir":"苗月","star":"白威,陈瑾,王柠","cat":"剧情,历史,战争","wish":458,"3d":false,"pn":4,"time":"","id":337438},{"cnms":0,"sn":0,"showInfo":"今天32家影院放映58场","late":false,"img":"http://p0.meituan.net/165.220/movie/4cbe0cc2f2b6e5abdaf950e7e3177d44331711.jpg","sc":0,"ver":"2D","rt":"本周五上映","dur":108,"nm":"终极胜利","src":"","showDate":"","scm":"辛德勒名单，推出中国版","imax":false,"snum":92,"preSale":0,"vd":"","dir":"冼杞然","star":"窦骁,约瑟夫·费因斯,娄宇健","cat":"剧情,战争,历史","wish":5103,"3d":false,"pn":141,"time":"","id":341123},{"cnms":0,"sn":0,"showInfo":"今天18家影院放映39场","late":false,"img":"http://p1.meituan.net/165.220/movie/ba2386a26648c1875e3fc780950f0ae0144875.jpg","sc":9.1,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-03上映","dur":144,"nm":"X战警：天启","src":"","showDate":"","scm":"天启当炮灰，千年洗剪吹","imax":true,"snum":482507,"preSale":0,"vd":"","dir":"布莱恩·辛格","star":"詹姆斯·麦卡沃伊,迈克尔·法斯宾德,詹妮弗·劳伦斯","cat":"动作,科幻,奇幻","wish":559919,"3d":true,"pn":692,"time":"","id":246177},{"cnms":0,"sn":0,"showInfo":"2016-07-15上映","late":false,"img":"http://p0.meituan.net/165.220/movie/6f0c9310b8e05681a19cc574d9d775b8833043.jpg","sc":0,"ver":"2D/中国巨幕","rt":"2016-07-15上映","dur":107,"nm":"陆垚知马俐","src":"","showDate":"","scm":"女神结又离，总之你没戏","imax":false,"snum":402,"preSale":1,"vd":"","dir":"文章","star":"包贝尔,宋佳,朱亚文","cat":"喜剧,爱情","wish":19494,"3d":false,"pn":149,"time":"","id":341603},{"cnms":0,"sn":0,"showInfo":"今天17家影院放映29场","late":false,"img":"http://p1.meituan.net/165.220/movie/f4b5d903571ec3c3fc952f86261b04fd227842.jpg","sc":0,"ver":"2D","rt":"2016-06-23上映","dur":98,"nm":"南口1937","src":"","showDate":"","scm":"南口抗日战，疆场洒血汗","imax":false,"snum":132,"preSale":0,"vd":"","dir":"朱丹","star":"孙看,孙洪涛,刘忠元","cat":"剧情,历史,战争","wish":2034,"3d":false,"pn":26,"time":"","id":368071},{"cnms":0,"sn":0,"showInfo":"2016-07-08 下周五上映","late":false,"img":"http://p1.meituan.net/165.220/movie/9d32c2703351b3e1cb456a05b207550e210596.jpg","sc":0,"ver":"2D/3D/中国巨幕","rt":"下周五上映","dur":93,"nm":"摇滚藏獒","src":"","showDate":"","scm":"郑钧写剧本，混搭玩摇滚","imax":false,"snum":208,"preSale":1,"vd":"","dir":"艾什·布兰农","star":"冯小刚,郭德纲,郭麒麟","cat":"动画,音乐","wish":15105,"3d":true,"pn":167,"time":"","id":247244},{"cnms":0,"sn":0,"showInfo":"今天17家影院放映24场","late":false,"img":"http://p0.meituan.net/165.220/movie/1dffa0a076e3514234f2029d6b29b3da157605.jpg","sc":0,"ver":"2D","rt":"本周五上映","dur":107,"nm":"党的女儿尹灵芝","src":"","showDate":"","scm":"定格十六岁，信仰诚可贵","imax":false,"snum":238,"preSale":0,"vd":"","dir":"卫晓茼","star":"郜耀平,张志宏,姚安濂","cat":"剧情,历史,战争","wish":871,"3d":false,"pn":18,"time":"","id":672123},{"cnms":0,"sn":0,"showInfo":"今天13家影院放映17场","late":false,"img":"http://p1.meituan.net/165.220/movie/09f8c875a24c9916e7150ff7d7068b15622397.jpg","sc":0,"ver":"2D","rt":"本周五上映","dur":92,"nm":"古田会议","src":"","showDate":"","scm":"古田开大会，确立新指挥","imax":false,"snum":65,"preSale":0,"vd":"","dir":"谭晓明","star":"许铂岑,王韦智,释小龙","cat":"剧情","wish":236,"3d":false,"pn":1,"time":"","id":367990},{"cnms":0,"sn":0,"showInfo":"2016-07-08 下周五上映","late":false,"img":"http://p1.meituan.net/165.220/movie/e03217d4f5dc75dac2361246af7e6703907531.jpg","sc":0,"ver":"2D","rt":"下周五上映","dur":113,"nm":"发条城市","src":"","showDate":"","scm":"无厘头谋杀，真相太复杂","imax":false,"snum":464,"preSale":1,"vd":"","dir":"江涛","star":"王宁,修睿,王自健","cat":"喜剧,冒险,犯罪","wish":6055,"3d":false,"pn":98,"time":"","id":345076},{"cnms":0,"sn":0,"showInfo":"今天8家影院放映9场","late":false,"img":"http://p0.meituan.net/165.220/movie/3be7ae83cc4070808c1041bfcb0c4690119016.jpg","sc":0,"ver":"2D","rt":"本周五上映","dur":95,"nm":"绝战","src":"","showDate":"","scm":"浴血突围战，凤凰重涅槃","imax":false,"snum":152,"preSale":0,"vd":"","dir":"许江华,林小鑫","star":"何育骏,王岚,高明升","cat":"动作,战争,剧情","wish":689,"3d":false,"pn":18,"time":"","id":361172},{"cnms":0,"sn":0,"showInfo":"今天6家影院放映7场","late":false,"img":"http://p1.meituan.net/165.220/movie/ef968fd382173c45b0c2d10572ca10b8354896.jpg","sc":9.2,"ver":"2D","rt":"2016-05-06上映","dur":108,"nm":"百鸟朝凤","src":"","showDate":"","scm":"两代手艺人，唢呐感情深","imax":false,"snum":111322,"preSale":0,"vd":"","dir":"吴天明","star":"陶泽如,郑伟,李岷城","cat":"历史,音乐,剧情","wish":3981,"3d":false,"pn":105,"time":"","id":248260},{"cnms":0,"sn":0,"showInfo":"2016-07-15上映","late":false,"img":"http://p0.meituan.net/165.220/movie/5657fd4203e62118deb28f16eac81271542768.jpg","sc":0,"ver":"2D","rt":"2016-07-15上映","dur":113,"nm":"路边野餐","src":"","showDate":"","scm":"离家把子寻，帮人带书信","imax":false,"snum":47,"preSale":1,"vd":"","dir":"毕赣","star":"陈永忠,郭月,谢理循","cat":"剧情,悬疑","wish":2575,"3d":false,"pn":44,"time":"","id":342073},{"cnms":0,"sn":0,"showInfo":"今天3家影院放映5场","late":false,"img":"http://p1.meituan.net/165.220/movie/a8dc71209614a071cbc56cfc193b9d9785810.jpg","sc":8.9,"ver":"3D/中国巨幕","rt":"2016-03-25上映","dur":122,"nm":"白毛女","src":"","showDate":"","scm":"欠了高利贷，卖女来抵债","imax":false,"snum":1205,"preSale":0,"vd":"","dir":"侯克明","star":"雷佳,张英席,高鹏","cat":"剧情","wish":1038,"3d":true,"pn":80,"time":"","id":345102},{"cnms":0,"sn":0,"showInfo":"今天3家影院放映3场","late":false,"img":"http://p0.meituan.net/165.220/movie/b721e73740601799c065affb619d837e151622.jpg","sc":8.9,"ver":"3D/中国巨幕","rt":"2016-05-20上映","dur":97,"nm":"愤怒的小鸟","src":"","showDate":"","scm":"绿猪来偷蛋，鸟儿群奋战","imax":false,"snum":332775,"preSale":0,"vd":"","dir":"费格尔·雷利,克莱·凯蒂","star":"杰森·苏戴奇斯,乔什·盖德,丹尼·麦克布耐德","cat":"动画,奇幻,冒险","wish":123045,"3d":true,"pn":132,"time":"","id":246188},{"cnms":0,"sn":0,"showInfo":"今天2家影院放映2场","late":false,"img":"http://p0.meituan.net/165.220/movie/70/612717.jpg","sc":8.5,"ver":"2D","rt":"2010-04-27上映","dur":108,"nm":"叶问2：宗师传奇","src":"","showDate":"","scm":"叶问搬香港，仇恨值渐长","imax":false,"snum":1045,"preSale":0,"vd":"","dir":"叶伟信","star":"甄子丹,洪金宝,熊黛林","cat":"动作,历史,传记","wish":211,"3d":false,"pn":63,"time":"","id":524},{"cnms":0,"sn":0,"showInfo":"今天2家影院放映2场","late":false,"img":"http://p0.meituan.net/165.220/movie/85f0d9a604e26be5523a848269346697296774.jpg","sc":4.7,"ver":"2D","rt":"2015-01-30上映","dur":88,"nm":"奔跑吧！兄弟","src":"","showDate":"","scm":"跑男再出发，集体游三亚","imax":false,"snum":361337,"preSale":0,"vd":"","dir":"胡笳,岑俊义","star":"杨颖,王宝强,李晨","cat":"喜剧,冒险,动作","wish":49025,"3d":false,"pn":118,"time":"","id":246316},{"cnms":0,"sn":0,"showInfo":"今天2家影院放映2场","late":false,"img":"http://p1.meituan.net/165.220/movie/fe80bc40822d0a5f3168b73089c47d71101133.jpg","sc":8.5,"ver":"2D/中国巨幕","rt":"2016-04-29上映","dur":132,"nm":"北京遇上西雅图之不二情书","src":"","showDate":"","scm":"异国心未远，书信寄情缘","imax":false,"snum":455168,"preSale":0,"vd":"","dir":"薛晓路","star":"汤唯,吴秀波,惠英红","cat":"爱情,剧情","wish":307383,"3d":false,"pn":547,"time":"","id":247575},{"cnms":0,"sn":0,"showInfo":"今天2家影院放映2场","late":false,"img":"http://p1.meituan.net/165.220/movie/31a325f0796cfebbab24776024eeec91100800.jpeg","sc":4.6,"ver":"2D","rt":"2016-06-17上映","dur":87,"nm":"筷仙","src":"","showDate":"","scm":"笔仙已玩坏，筷仙来作怪","imax":false,"snum":14421,"preSale":0,"vd":"","dir":"姬雨","star":"胡影怡,朱璇,周骏","cat":"恐怖,惊悚","wish":20373,"3d":false,"pn":32,"time":"","id":343597},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/ff2149eae4fb42edaea4c50a7621069f9076.jpg","sc":8.3,"ver":"2D","rt":"2005-12-01上映","dur":108,"nm":"如果·爱","src":"","showDate":"","scm":"北漂三角恋，歌舞最经典","imax":false,"snum":431,"preSale":0,"vd":"","dir":"陈可辛","star":"金城武,周迅,张学友","cat":"爱情,剧情,歌舞","wish":188,"3d":false,"pn":173,"time":"","id":143},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/34/227615.jpg","sc":5.7,"ver":"2D","rt":"2010-05-07上映","dur":96,"nm":"三笑之才子佳人","src":"","showDate":"","scm":"发福唐伯虎，少女齐拥簇","imax":false,"snum":206,"preSale":0,"vd":"","dir":"郭德纲,刘观伟","star":"郭德纲,姚笛,郭柯宇","cat":"喜剧,古装,爱情","wish":123,"3d":false,"pn":13,"time":"","id":410},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/89/817926.jpg","sc":6.3,"ver":"2D","rt":"2010-05-14上映","dur":87,"nm":"终极匹配","src":"","showDate":"","scm":"精英IT男，脚踏N条船","imax":false,"snum":50,"preSale":0,"vd":"","dir":"程珑","star":"陈晓东,吴佩慈,孟广美","cat":"爱情","wish":178,"3d":false,"pn":5,"time":"","id":357},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/25/9538941.jpg","sc":4.2,"ver":"2D","rt":"2011-03-10上映","dur":95,"nm":"歼十出击","src":"","showDate":"","scm":"记录中国空军","imax":false,"snum":19,"preSale":0,"vd":"","dir":"宁海强","star":"王斑,杨潇,张页川","cat":"剧情,动作","wish":0,"3d":false,"pn":108,"time":"","id":52305},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/28/668388.jpg","sc":4.2,"ver":"2D","rt":"2011-11-11上映","dur":100,"nm":"光棍终结者","src":"","showDate":"","scm":"光棍可团购，脱单快节奏","imax":false,"snum":40,"preSale":0,"vd":"","dir":"赵非","star":"李艾,周韦彤,周晓鸥","cat":"喜剧,爱情","wish":0,"3d":false,"pn":55,"time":"","id":947},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/29/274730.jpg","sc":6,"ver":"2D","rt":"2012-08-23上映","dur":95,"nm":"Hold住爱","src":"","showDate":"","scm":"假戏变真做，幂威秀爱火","imax":false,"snum":756,"preSale":0,"vd":"","dir":"张琦","star":"杨幂,刘恺威,周秀娜","cat":"喜剧,爱情,悬疑","wish":280,"3d":false,"pn":300,"time":"","id":729},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/__29561506__7176229.jpg","sc":8,"ver":"2D/IMAX 3D","rt":"2013-12-24上映","dur":108,"nm":"警察故事2013","src":"","showDate":"","scm":"女儿乱交友，老爹来出头","imax":true,"snum":19152,"preSale":0,"vd":"","dir":"丁晟","star":"刘烨,成龙,景甜","cat":"剧情,动作,犯罪","wish":14520,"3d":true,"pn":44,"time":"","id":77192},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p1.meituan.net/165.220/movie/1c941143ac74b89cf16a4884585131be164722.jpg","sc":9.5,"ver":"2D/3D","rt":"2014-10-01上映","dur":90,"nm":"魁拔Ⅲ战神崛起","src":"","showDate":"","scm":"蛮吉唤脉兽，决战不回头","imax":false,"snum":11072,"preSale":0,"vd":"","dir":"王川","star":"刘婧荦,姚姝,王宇腾","cat":"动画,奇幻,冒险","wish":14265,"3d":true,"pn":45,"time":"","id":78018},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/153d2a327b80b0e57ff6feb3e6aecebf585878.jpg","sc":8,"ver":"2D","rt":"2014-12-05上映","dur":119,"nm":"匆匆那年","src":"","showDate":"","scm":"纯情已不再，青春忙堕胎","imax":false,"snum":371319,"preSale":0,"vd":"","dir":"张一白","star":"彭于晏,倪妮,郑恺","cat":"剧情,爱情","wish":74203,"3d":false,"pn":378,"time":"","id":245980},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/f8c8ff13e5ba8a1dab7d6a5341701b0a175485.jpg","sc":7.6,"ver":"2D/3D","rt":"2015-01-01上映","dur":88,"nm":"闯堂兔2：疯狂马戏团","src":"","showDate":"","scm":"兔子砸了场，死敌来帮忙","imax":false,"snum":10289,"preSale":0,"vd":"","dir":"曾宪林","star":"小连杀,叮当,郝祥海","cat":"动画,喜剧,冒险","wish":3659,"3d":true,"pn":82,"time":"","id":246100},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p1.meituan.net/165.220/movie/9014cb2360cc64d64acb3abe18d33552131346.jpg","sc":7.7,"ver":"2D","rt":"2015-02-06上映","dur":120,"nm":"一路惊喜","src":"","showDate":"","scm":"除夕夜奇遇，转角有惊喜","imax":false,"snum":73973,"preSale":0,"vd":"","dir":"金依萌,潘安子,章家瑞,宋迪","star":"郭采洁,凤小岳,赵丽颖","cat":"爱情,家庭,喜剧","wish":15223,"3d":false,"pn":251,"time":"","id":246049},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/7e15953aa8bc5be4e7bff00913426a06920765.jpg","sc":5.5,"ver":"2D","rt":"2015-07-31上映","dur":85,"nm":"美人鱼之海盗来袭","src":"","showDate":"","scm":"国产美人鱼，俩海盗来袭","imax":false,"snum":22001,"preSale":0,"vd":"","dir":"邱浩强","star":"李思娴,郭亚维,宋磊","cat":"动画,喜剧,冒险","wish":27716,"3d":false,"pn":38,"time":"","id":248550},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p1.meituan.net/165.220/movie/aea9291ff4c41e074e2edc2a2d9b20f9500507.jpg","sc":8.4,"ver":"2D/IMAX 2D/中国巨幕/全景声","rt":"2015-09-25上映","dur":113,"nm":"港囧","src":"","showDate":"","scm":"宝宝换包包，笑点没变少","imax":true,"snum":1921544,"preSale":0,"vd":"","dir":"徐峥","star":"徐峥,赵薇,包贝尔","cat":"喜剧,爱情,动作","wish":617005,"3d":false,"pn":498,"time":"","id":246577},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/90422e83536df2153ecc57ff9703e99c1111187.jpg","sc":8.2,"ver":"2D","rt":"2015-10-23上映","dur":92,"nm":"既然青春留不住","src":"","showDate":"","scm":"校草撞菠菜，青春已不再","imax":false,"snum":84005,"preSale":0,"vd":"","dir":"田蒙","star":"张翰,陈乔恩,施予斐","cat":"喜剧,爱情","wish":78433,"3d":false,"pn":172,"time":"","id":246540},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p1.meituan.net/165.220/movie/d75604e123f8cdd8b52c069936f84f5b49504.jpg","sc":8.5,"ver":"2D","rt":"2015-10-30上映","dur":112,"nm":"我是证人","src":"","showDate":"","scm":"证词相矛盾，姐弟被围困","imax":false,"snum":237317,"preSale":0,"vd":"","dir":"安尚勋","star":"杨幂,鹿晗,王景春","cat":"悬疑,犯罪,惊悚","wish":139189,"3d":false,"pn":499,"time":"","id":247711},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p1.meituan.net/165.220/movie/a70da0aefb82886efbae696181e966ff620085.jpg","sc":7.1,"ver":"2D","rt":"2016-06-24上映","dur":103,"nm":"近在咫尺的爱恋","src":"","showDate":"","scm":"真爱在身旁，挥拳为理想","imax":false,"snum":1189,"preSale":0,"vd":"","dir":"程孝泽","star":"彭于晏,郭采洁,杨子姗","cat":"爱情,运动,剧情","wish":12564,"3d":false,"pn":49,"time":"","id":57217},{"cnms":0,"sn":0,"showInfo":"2016-07-08 下周五上映","late":false,"img":"http://p1.meituan.net/165.220/movie/d7cfe72fdd511e549c5f827e8646b945730590.jpg","sc":0,"ver":"2D","rt":"下周五上映","dur":87,"nm":"张震讲故事之合租屋","src":"","showDate":"","scm":"惊悚合租屋，噩梦一幕幕","imax":false,"snum":78,"preSale":1,"vd":"","dir":"战越","star":"卢杉,傅亨,吴谨西","cat":"惊悚,悬疑,爱情","wish":4848,"3d":false,"pn":29,"time":"","id":368116},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p0.meituan.net/165.220/movie/55/9200128.jpg","sc":5.5,"ver":"2D","rt":"1980-01-01上映","dur":90,"nm":"泰山屠龙","src":"","showDate":"","scm":"","imax":false,"snum":2,"preSale":0,"vd":"","dir":"许先,江汉","star":"朱虹,夏冰心,黎汉持","cat":"动作","wish":0,"3d":false,"pn":0,"time":"","id":50461},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p0.meituan.net/165.220/movie/__20594644__8575832.jpg","sc":8,"ver":"2D","rt":"2013-08-29上映","dur":111,"nm":"被偷走的那五年","src":"","showDate":"","scm":"车祸丢回忆，丈夫已离去","imax":false,"snum":6348,"preSale":0,"vd":"","dir":"黄真真","star":"白百何,张孝全,范玮琪","cat":"爱情","wish":8566,"3d":false,"pn":49,"time":"","id":78183},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p0.meituan.net/165.220/movie/__19886997__1938344.jpg","sc":8.9,"ver":"2D","rt":"2013-09-13上映","dur":119,"nm":"全民目击","src":"","showDate":"","scm":"孙红雷一男战四女的爱恨情仇","imax":false,"snum":9011,"preSale":0,"vd":"","dir":"非行","star":"孙红雷,郭富城,余男","cat":"悬疑,犯罪","wish":4916,"3d":false,"pn":87,"time":"","id":78171},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p0.meituan.net/165.220/movie/__40811615__5745234.jpg","sc":8.6,"ver":"2D","rt":"2014-04-25上映","dur":98,"nm":"同桌的你","src":"","showDate":"","scm":"初恋要结婚，回国忆青春","imax":false,"snum":73121,"preSale":0,"vd":"","dir":"郭帆","star":"周冬雨,林更新,隋凯","cat":"剧情,爱情","wish":24267,"3d":false,"pn":88,"time":"","id":78653},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p1.meituan.net/165.220/movie/0fec3a88133e569ca0067e12f7ad0b80987252.jpg","sc":9.3,"ver":"2D/3D/中国巨幕","rt":"2015-04-02上映","dur":90,"nm":"战狼","src":"","showDate":"","scm":"铁血特种兵，兄弟生死情","imax":false,"snum":603513,"preSale":0,"vd":"","dir":"吴京","star":"吴京,余男,倪大红","cat":"动作,战争","wish":67199,"3d":true,"pn":143,"time":"","id":78304},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p0.meituan.net/165.220/movie/8a7d763dd6909a59bc0de8b3399e21d7391271.jpg","sc":8.5,"ver":"2D","rt":"2015-07-17上映","dur":113,"nm":"煎饼侠","src":"","showDate":"","scm":"电影要做好，人缘少不了","imax":false,"snum":1162913,"preSale":0,"vd":"","dir":"董成鹏","star":"董成鹏,袁姗姗,柳岩","cat":"喜剧","wish":175432,"3d":false,"pn":203,"time":"","id":246330},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p1.meituan.net/165.220/movie/ea15948d63d527d092a70e39cbb74636357253.jpg","sc":6.9,"ver":"2D","rt":"2016-06-03上映","dur":94,"nm":"记忆碎片","src":"","showDate":"","scm":"宿醉陷疑案，奋力查嫌犯","imax":false,"snum":3067,"preSale":0,"vd":"","dir":"朴裕焕","star":"雷佳音,夏梓桐,李菁","cat":"悬疑,喜剧,犯罪","wish":4154,"3d":false,"pn":47,"time":"","id":345923},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p0.meituan.net/165.220/movie/73f6abbb90259d1fa8a88fa907ca3062587352.jpg","sc":7.7,"ver":"3D/中国巨幕","rt":"2016-06-17上映","dur":86,"nm":"我叫MT之山口山战记","src":"","showDate":"","scm":"贱萌牛头人，爆笑刷副本","imax":false,"snum":21740,"preSale":0,"vd":"","dir":"核桃","star":"奶茶,YOYO,CBI","cat":"动画,喜剧,冒险","wish":43480,"3d":true,"pn":40,"time":"","id":246045}]}
     */

    private int status;
    /**
     * hasNext : false
     * movies : [{"cnms":0,"sn":0,"showInfo":"今天150家影院放映1463场","late":false,"img":"http://p1.meituan.net/165.220/movie/2e0b5b5c6c086cc93068fbc212f9f6b0142193.jpg","sc":8.6,"ver":"2D/3D/中国巨幕","rt":"2016-06-24上映","dur":126,"nm":"惊天魔盗团2","src":"","showDate":"","scm":"周董变魔术，敌人挡不住","imax":false,"snum":170424,"preSale":0,"vd":"","dir":"朱浩伟","star":"杰西·艾森伯格,马克·鲁法洛,伍迪·哈里森","cat":"动作,喜剧,惊悚","wish":513937,"3d":true,"pn":248,"time":"","id":246333},{"cnms":0,"sn":0,"showInfo":"今天95家影院放映100场","late":false,"img":"http://p1.meituan.net/165.220/movie/a375ebfcdc2a396423c368b943813b01179997.jpg","sc":0,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"本周六上映","dur":113,"nm":"忍者神龟2：破影而出","src":"","showDate":"","scm":"儿时忍者龟，犀牛也回归","imax":true,"snum":2431,"preSale":1,"vd":"","dir":"戴夫·格林","star":"梅根·福克斯,皮特·普劳泽克,阿伦·瑞奇森","cat":"动作,冒险,喜剧","wish":280204,"3d":true,"pn":314,"time":"","id":13511},{"cnms":0,"sn":0,"showInfo":"今天149家影院放映1240场","late":false,"img":"http://p1.meituan.net/165.220/movie/45f8587cb425a01c9a279082772a8bd0379497.jpg","sc":8.5,"ver":"2D/3D","rt":"本周五上映","dur":105,"nm":"赏金猎人","src":"","showDate":"","scm":"编外铁饭碗，收钱抓逃犯","imax":false,"snum":8146,"preSale":0,"vd":"","dir":"申太罗","star":"李敏镐,钟汉良,唐嫣","cat":"动作,喜剧,剧情,悬疑","wish":143463,"3d":true,"pn":212,"time":"","id":338506},{"cnms":0,"sn":0,"showInfo":"今天145家影院放映1220场","late":false,"img":"http://p1.meituan.net/165.220/movie/b408a9322cd0da51d4bdd3261ba3d1c0278866.jpg","sc":8.5,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-24上映","dur":120,"nm":"独立日：卷土重来","src":"","showDate":"","scm":"外星再入侵，地核将燃尽","imax":true,"snum":126617,"preSale":0,"vd":"","dir":"罗兰·艾默里奇","star":"利亚姆·海姆斯沃斯,杰夫·高布伦,杰西·厄舍","cat":"动作,冒险,科幻","wish":164747,"3d":true,"pn":227,"time":"","id":246375},{"cnms":0,"sn":0,"showInfo":"今天125家影院放映627场","late":false,"img":"http://p1.meituan.net/165.220/movie/79311d41bea3be8f1677c0b69a5868fa289298.jpg","sc":8.9,"ver":"2D","rt":"本周四上映","dur":99,"nm":"所以\u2026\u2026和黑粉结婚了","src":"","showDate":"","scm":"黑粉变新娘，这是闹哪样","imax":false,"snum":24950,"preSale":0,"vd":"","dir":"金帝荣","star":"朴灿烈,袁姗姗,姜潮","cat":"爱情,喜剧","wish":101609,"3d":false,"pn":161,"time":"","id":343379},{"cnms":0,"sn":0,"showInfo":"2016-07-08 下周五上映","late":false,"img":"http://p0.meituan.net/165.220/movie/37e7ed909843270f0880c325b6be7b60436509.jpg","sc":0,"ver":"2D","rt":"下周五上映","dur":98,"nm":"致青春·原来你还在这里","src":"","showDate":"","scm":"霸道男学霸，爱上女学渣","imax":false,"snum":6566,"preSale":1,"vd":"","dir":"周拓如","star":"吴亦凡,刘亦菲,金世佳","cat":"剧情,爱情","wish":230263,"3d":false,"pn":354,"time":"","id":246575},{"cnms":0,"sn":0,"showInfo":"2016-07-08 下周五上映","late":false,"img":"http://p0.meituan.net/165.220/movie/d196d1391e1dc1eff190275a57a60d6c261789.jpg","sc":0,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"下周五上映","dur":110,"nm":"寒战2","src":"","showDate":"","scm":"警队有黑幕，迷局层层铺","imax":true,"snum":1123,"preSale":1,"vd":"","dir":"梁乐民,陆剑青","star":"郭富城,梁家辉,杨采妮","cat":"动作,犯罪,悬疑","wish":151240,"3d":true,"pn":389,"time":"","id":341289},{"cnms":0,"sn":0,"showInfo":"今天111家影院放映378场","late":false,"img":"http://p0.meituan.net/165.220/movie/e5ff984a4bec976fb1ed429e7fe4f61c605233.jpg","sc":7.9,"ver":"2D/3D","rt":"本周五上映","dur":92,"nm":"魔轮","src":"","showDate":"","scm":"天涯号起航，失控大逃亡","imax":false,"snum":2214,"preSale":0,"vd":"","dir":"王早","star":"林心如,何润东,金世佳","cat":"悬疑,惊悚","wish":11188,"3d":true,"pn":67,"time":"","id":342741},{"cnms":0,"sn":0,"showInfo":"今天116家影院放映363场","late":false,"img":"http://p0.meituan.net/165.220/movie/4c20a91505854dcd0f9617069c5fec21843230.jpg","sc":8.7,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"2016-06-17上映","dur":97,"nm":"海底总动员2：多莉去哪儿","src":"","showDate":"","scm":"唠叨鱼多莉，上路找父母","imax":true,"snum":88213,"preSale":0,"vd":"","dir":"安德鲁·斯坦顿,安格斯·麦克莱恩","star":"艾伦·德詹尼丝,徐帆,艾伯特·布鲁克斯","cat":"动画,喜剧,冒险","wish":144949,"3d":true,"pn":123,"time":"","id":246366},{"cnms":0,"sn":0,"showInfo":"2016-07-08 下周五上映","late":false,"img":"http://p1.meituan.net/165.220/movie/a607ab45bcc9e8486328b39bff0132a4420994.jpg","sc":0,"ver":"3D","rt":"下周五上映","dur":105,"nm":"大鱼海棠","src":"","showDate":"","scm":"北冥有鱼鲲，海棠掌乾坤","imax":false,"snum":4370,"preSale":1,"vd":"","dir":"梁旋,张春","star":"季冠霖,苏尚卿,许魏洲","cat":"动画,奇幻","wish":157909,"3d":true,"pn":149,"time":"","id":246591},{"cnms":0,"sn":0,"showInfo":"今天81家影院放映218场","late":false,"img":"http://p1.meituan.net/165.220/movie/1c82df174422d9374f821482f445171b129671.jpg","sc":6.9,"ver":"2D","rt":"2016-06-24上映","dur":88,"nm":"三人行","src":"","showDate":"","scm":"悍匪有手段，中枪再作案","imax":false,"snum":60826,"preSale":0,"vd":"","dir":"杜琪峰","star":"赵薇,古天乐,钟汉良","cat":"动作,犯罪,悬疑","wish":72910,"3d":false,"pn":195,"time":"","id":246972},{"cnms":0,"sn":0,"showInfo":"今天70家影院放映151场","late":false,"img":"http://p0.meituan.net/165.220/movie/f94e67dcd5b48f034bd7adc892f1b20695854.jpeg","sc":9.2,"ver":"2D/3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-08上映","dur":124,"nm":"魔兽","src":"","showDate":"","scm":"怒拳为谁握，联盟斗部落","imax":true,"snum":796212,"preSale":0,"vd":"","dir":"邓肯·琼斯","star":"崔维斯·费米尔,宝拉·巴顿,本·福斯特","cat":"动作,冒险,奇幻","wish":479894,"3d":true,"pn":347,"time":"","id":78421},{"cnms":0,"sn":0,"showInfo":"2016-07-02 本周六上映","late":false,"img":"http://p0.meituan.net/165.220/movie/329d84307bf99e980c7cb5969dcade4f856773.png","sc":0,"ver":"2D","rt":"本周六上映","dur":81,"nm":"丑小鸭历险记","src":"","showDate":"","scm":"月球机器鸭，化身小飞鸭","imax":false,"snum":160,"preSale":1,"vd":"","dir":"郑义","star":"朱可可,阿飞,夏倚轩","cat":"动画,科幻,冒险","wish":4469,"3d":false,"pn":76,"time":"","id":368271},{"cnms":0,"sn":0,"showInfo":"今天41家影院放映69场","late":false,"img":"http://p1.meituan.net/165.220/movie/c8545c7bd1f6070f0d52a77bd0ddd8738720802.jpg","sc":0,"ver":"2D","rt":"本周一上映","dur":114,"nm":"大火种","src":"","showDate":"","scm":"誓死护宣言，智斗救火种","imax":false,"snum":175,"preSale":0,"vd":"","dir":"苗月","star":"白威,陈瑾,王柠","cat":"剧情,历史,战争","wish":458,"3d":false,"pn":4,"time":"","id":337438},{"cnms":0,"sn":0,"showInfo":"今天32家影院放映58场","late":false,"img":"http://p0.meituan.net/165.220/movie/4cbe0cc2f2b6e5abdaf950e7e3177d44331711.jpg","sc":0,"ver":"2D","rt":"本周五上映","dur":108,"nm":"终极胜利","src":"","showDate":"","scm":"辛德勒名单，推出中国版","imax":false,"snum":92,"preSale":0,"vd":"","dir":"冼杞然","star":"窦骁,约瑟夫·费因斯,娄宇健","cat":"剧情,战争,历史","wish":5103,"3d":false,"pn":141,"time":"","id":341123},{"cnms":0,"sn":0,"showInfo":"今天18家影院放映39场","late":false,"img":"http://p1.meituan.net/165.220/movie/ba2386a26648c1875e3fc780950f0ae0144875.jpg","sc":9.1,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-03上映","dur":144,"nm":"X战警：天启","src":"","showDate":"","scm":"天启当炮灰，千年洗剪吹","imax":true,"snum":482507,"preSale":0,"vd":"","dir":"布莱恩·辛格","star":"詹姆斯·麦卡沃伊,迈克尔·法斯宾德,詹妮弗·劳伦斯","cat":"动作,科幻,奇幻","wish":559919,"3d":true,"pn":692,"time":"","id":246177},{"cnms":0,"sn":0,"showInfo":"2016-07-15上映","late":false,"img":"http://p0.meituan.net/165.220/movie/6f0c9310b8e05681a19cc574d9d775b8833043.jpg","sc":0,"ver":"2D/中国巨幕","rt":"2016-07-15上映","dur":107,"nm":"陆垚知马俐","src":"","showDate":"","scm":"女神结又离，总之你没戏","imax":false,"snum":402,"preSale":1,"vd":"","dir":"文章","star":"包贝尔,宋佳,朱亚文","cat":"喜剧,爱情","wish":19494,"3d":false,"pn":149,"time":"","id":341603},{"cnms":0,"sn":0,"showInfo":"今天17家影院放映29场","late":false,"img":"http://p1.meituan.net/165.220/movie/f4b5d903571ec3c3fc952f86261b04fd227842.jpg","sc":0,"ver":"2D","rt":"2016-06-23上映","dur":98,"nm":"南口1937","src":"","showDate":"","scm":"南口抗日战，疆场洒血汗","imax":false,"snum":132,"preSale":0,"vd":"","dir":"朱丹","star":"孙看,孙洪涛,刘忠元","cat":"剧情,历史,战争","wish":2034,"3d":false,"pn":26,"time":"","id":368071},{"cnms":0,"sn":0,"showInfo":"2016-07-08 下周五上映","late":false,"img":"http://p1.meituan.net/165.220/movie/9d32c2703351b3e1cb456a05b207550e210596.jpg","sc":0,"ver":"2D/3D/中国巨幕","rt":"下周五上映","dur":93,"nm":"摇滚藏獒","src":"","showDate":"","scm":"郑钧写剧本，混搭玩摇滚","imax":false,"snum":208,"preSale":1,"vd":"","dir":"艾什·布兰农","star":"冯小刚,郭德纲,郭麒麟","cat":"动画,音乐","wish":15105,"3d":true,"pn":167,"time":"","id":247244},{"cnms":0,"sn":0,"showInfo":"今天17家影院放映24场","late":false,"img":"http://p0.meituan.net/165.220/movie/1dffa0a076e3514234f2029d6b29b3da157605.jpg","sc":0,"ver":"2D","rt":"本周五上映","dur":107,"nm":"党的女儿尹灵芝","src":"","showDate":"","scm":"定格十六岁，信仰诚可贵","imax":false,"snum":238,"preSale":0,"vd":"","dir":"卫晓茼","star":"郜耀平,张志宏,姚安濂","cat":"剧情,历史,战争","wish":871,"3d":false,"pn":18,"time":"","id":672123},{"cnms":0,"sn":0,"showInfo":"今天13家影院放映17场","late":false,"img":"http://p1.meituan.net/165.220/movie/09f8c875a24c9916e7150ff7d7068b15622397.jpg","sc":0,"ver":"2D","rt":"本周五上映","dur":92,"nm":"古田会议","src":"","showDate":"","scm":"古田开大会，确立新指挥","imax":false,"snum":65,"preSale":0,"vd":"","dir":"谭晓明","star":"许铂岑,王韦智,释小龙","cat":"剧情","wish":236,"3d":false,"pn":1,"time":"","id":367990},{"cnms":0,"sn":0,"showInfo":"2016-07-08 下周五上映","late":false,"img":"http://p1.meituan.net/165.220/movie/e03217d4f5dc75dac2361246af7e6703907531.jpg","sc":0,"ver":"2D","rt":"下周五上映","dur":113,"nm":"发条城市","src":"","showDate":"","scm":"无厘头谋杀，真相太复杂","imax":false,"snum":464,"preSale":1,"vd":"","dir":"江涛","star":"王宁,修睿,王自健","cat":"喜剧,冒险,犯罪","wish":6055,"3d":false,"pn":98,"time":"","id":345076},{"cnms":0,"sn":0,"showInfo":"今天8家影院放映9场","late":false,"img":"http://p0.meituan.net/165.220/movie/3be7ae83cc4070808c1041bfcb0c4690119016.jpg","sc":0,"ver":"2D","rt":"本周五上映","dur":95,"nm":"绝战","src":"","showDate":"","scm":"浴血突围战，凤凰重涅槃","imax":false,"snum":152,"preSale":0,"vd":"","dir":"许江华,林小鑫","star":"何育骏,王岚,高明升","cat":"动作,战争,剧情","wish":689,"3d":false,"pn":18,"time":"","id":361172},{"cnms":0,"sn":0,"showInfo":"今天6家影院放映7场","late":false,"img":"http://p1.meituan.net/165.220/movie/ef968fd382173c45b0c2d10572ca10b8354896.jpg","sc":9.2,"ver":"2D","rt":"2016-05-06上映","dur":108,"nm":"百鸟朝凤","src":"","showDate":"","scm":"两代手艺人，唢呐感情深","imax":false,"snum":111322,"preSale":0,"vd":"","dir":"吴天明","star":"陶泽如,郑伟,李岷城","cat":"历史,音乐,剧情","wish":3981,"3d":false,"pn":105,"time":"","id":248260},{"cnms":0,"sn":0,"showInfo":"2016-07-15上映","late":false,"img":"http://p0.meituan.net/165.220/movie/5657fd4203e62118deb28f16eac81271542768.jpg","sc":0,"ver":"2D","rt":"2016-07-15上映","dur":113,"nm":"路边野餐","src":"","showDate":"","scm":"离家把子寻，帮人带书信","imax":false,"snum":47,"preSale":1,"vd":"","dir":"毕赣","star":"陈永忠,郭月,谢理循","cat":"剧情,悬疑","wish":2575,"3d":false,"pn":44,"time":"","id":342073},{"cnms":0,"sn":0,"showInfo":"今天3家影院放映5场","late":false,"img":"http://p1.meituan.net/165.220/movie/a8dc71209614a071cbc56cfc193b9d9785810.jpg","sc":8.9,"ver":"3D/中国巨幕","rt":"2016-03-25上映","dur":122,"nm":"白毛女","src":"","showDate":"","scm":"欠了高利贷，卖女来抵债","imax":false,"snum":1205,"preSale":0,"vd":"","dir":"侯克明","star":"雷佳,张英席,高鹏","cat":"剧情","wish":1038,"3d":true,"pn":80,"time":"","id":345102},{"cnms":0,"sn":0,"showInfo":"今天3家影院放映3场","late":false,"img":"http://p0.meituan.net/165.220/movie/b721e73740601799c065affb619d837e151622.jpg","sc":8.9,"ver":"3D/中国巨幕","rt":"2016-05-20上映","dur":97,"nm":"愤怒的小鸟","src":"","showDate":"","scm":"绿猪来偷蛋，鸟儿群奋战","imax":false,"snum":332775,"preSale":0,"vd":"","dir":"费格尔·雷利,克莱·凯蒂","star":"杰森·苏戴奇斯,乔什·盖德,丹尼·麦克布耐德","cat":"动画,奇幻,冒险","wish":123045,"3d":true,"pn":132,"time":"","id":246188},{"cnms":0,"sn":0,"showInfo":"今天2家影院放映2场","late":false,"img":"http://p0.meituan.net/165.220/movie/70/612717.jpg","sc":8.5,"ver":"2D","rt":"2010-04-27上映","dur":108,"nm":"叶问2：宗师传奇","src":"","showDate":"","scm":"叶问搬香港，仇恨值渐长","imax":false,"snum":1045,"preSale":0,"vd":"","dir":"叶伟信","star":"甄子丹,洪金宝,熊黛林","cat":"动作,历史,传记","wish":211,"3d":false,"pn":63,"time":"","id":524},{"cnms":0,"sn":0,"showInfo":"今天2家影院放映2场","late":false,"img":"http://p0.meituan.net/165.220/movie/85f0d9a604e26be5523a848269346697296774.jpg","sc":4.7,"ver":"2D","rt":"2015-01-30上映","dur":88,"nm":"奔跑吧！兄弟","src":"","showDate":"","scm":"跑男再出发，集体游三亚","imax":false,"snum":361337,"preSale":0,"vd":"","dir":"胡笳,岑俊义","star":"杨颖,王宝强,李晨","cat":"喜剧,冒险,动作","wish":49025,"3d":false,"pn":118,"time":"","id":246316},{"cnms":0,"sn":0,"showInfo":"今天2家影院放映2场","late":false,"img":"http://p1.meituan.net/165.220/movie/fe80bc40822d0a5f3168b73089c47d71101133.jpg","sc":8.5,"ver":"2D/中国巨幕","rt":"2016-04-29上映","dur":132,"nm":"北京遇上西雅图之不二情书","src":"","showDate":"","scm":"异国心未远，书信寄情缘","imax":false,"snum":455168,"preSale":0,"vd":"","dir":"薛晓路","star":"汤唯,吴秀波,惠英红","cat":"爱情,剧情","wish":307383,"3d":false,"pn":547,"time":"","id":247575},{"cnms":0,"sn":0,"showInfo":"今天2家影院放映2场","late":false,"img":"http://p1.meituan.net/165.220/movie/31a325f0796cfebbab24776024eeec91100800.jpeg","sc":4.6,"ver":"2D","rt":"2016-06-17上映","dur":87,"nm":"筷仙","src":"","showDate":"","scm":"笔仙已玩坏，筷仙来作怪","imax":false,"snum":14421,"preSale":0,"vd":"","dir":"姬雨","star":"胡影怡,朱璇,周骏","cat":"恐怖,惊悚","wish":20373,"3d":false,"pn":32,"time":"","id":343597},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/ff2149eae4fb42edaea4c50a7621069f9076.jpg","sc":8.3,"ver":"2D","rt":"2005-12-01上映","dur":108,"nm":"如果·爱","src":"","showDate":"","scm":"北漂三角恋，歌舞最经典","imax":false,"snum":431,"preSale":0,"vd":"","dir":"陈可辛","star":"金城武,周迅,张学友","cat":"爱情,剧情,歌舞","wish":188,"3d":false,"pn":173,"time":"","id":143},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/34/227615.jpg","sc":5.7,"ver":"2D","rt":"2010-05-07上映","dur":96,"nm":"三笑之才子佳人","src":"","showDate":"","scm":"发福唐伯虎，少女齐拥簇","imax":false,"snum":206,"preSale":0,"vd":"","dir":"郭德纲,刘观伟","star":"郭德纲,姚笛,郭柯宇","cat":"喜剧,古装,爱情","wish":123,"3d":false,"pn":13,"time":"","id":410},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/89/817926.jpg","sc":6.3,"ver":"2D","rt":"2010-05-14上映","dur":87,"nm":"终极匹配","src":"","showDate":"","scm":"精英IT男，脚踏N条船","imax":false,"snum":50,"preSale":0,"vd":"","dir":"程珑","star":"陈晓东,吴佩慈,孟广美","cat":"爱情","wish":178,"3d":false,"pn":5,"time":"","id":357},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/25/9538941.jpg","sc":4.2,"ver":"2D","rt":"2011-03-10上映","dur":95,"nm":"歼十出击","src":"","showDate":"","scm":"记录中国空军","imax":false,"snum":19,"preSale":0,"vd":"","dir":"宁海强","star":"王斑,杨潇,张页川","cat":"剧情,动作","wish":0,"3d":false,"pn":108,"time":"","id":52305},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/28/668388.jpg","sc":4.2,"ver":"2D","rt":"2011-11-11上映","dur":100,"nm":"光棍终结者","src":"","showDate":"","scm":"光棍可团购，脱单快节奏","imax":false,"snum":40,"preSale":0,"vd":"","dir":"赵非","star":"李艾,周韦彤,周晓鸥","cat":"喜剧,爱情","wish":0,"3d":false,"pn":55,"time":"","id":947},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/29/274730.jpg","sc":6,"ver":"2D","rt":"2012-08-23上映","dur":95,"nm":"Hold住爱","src":"","showDate":"","scm":"假戏变真做，幂威秀爱火","imax":false,"snum":756,"preSale":0,"vd":"","dir":"张琦","star":"杨幂,刘恺威,周秀娜","cat":"喜剧,爱情,悬疑","wish":280,"3d":false,"pn":300,"time":"","id":729},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/__29561506__7176229.jpg","sc":8,"ver":"2D/IMAX 3D","rt":"2013-12-24上映","dur":108,"nm":"警察故事2013","src":"","showDate":"","scm":"女儿乱交友，老爹来出头","imax":true,"snum":19152,"preSale":0,"vd":"","dir":"丁晟","star":"刘烨,成龙,景甜","cat":"剧情,动作,犯罪","wish":14520,"3d":true,"pn":44,"time":"","id":77192},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p1.meituan.net/165.220/movie/1c941143ac74b89cf16a4884585131be164722.jpg","sc":9.5,"ver":"2D/3D","rt":"2014-10-01上映","dur":90,"nm":"魁拔Ⅲ战神崛起","src":"","showDate":"","scm":"蛮吉唤脉兽，决战不回头","imax":false,"snum":11072,"preSale":0,"vd":"","dir":"王川","star":"刘婧荦,姚姝,王宇腾","cat":"动画,奇幻,冒险","wish":14265,"3d":true,"pn":45,"time":"","id":78018},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/153d2a327b80b0e57ff6feb3e6aecebf585878.jpg","sc":8,"ver":"2D","rt":"2014-12-05上映","dur":119,"nm":"匆匆那年","src":"","showDate":"","scm":"纯情已不再，青春忙堕胎","imax":false,"snum":371319,"preSale":0,"vd":"","dir":"张一白","star":"彭于晏,倪妮,郑恺","cat":"剧情,爱情","wish":74203,"3d":false,"pn":378,"time":"","id":245980},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/f8c8ff13e5ba8a1dab7d6a5341701b0a175485.jpg","sc":7.6,"ver":"2D/3D","rt":"2015-01-01上映","dur":88,"nm":"闯堂兔2：疯狂马戏团","src":"","showDate":"","scm":"兔子砸了场，死敌来帮忙","imax":false,"snum":10289,"preSale":0,"vd":"","dir":"曾宪林","star":"小连杀,叮当,郝祥海","cat":"动画,喜剧,冒险","wish":3659,"3d":true,"pn":82,"time":"","id":246100},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p1.meituan.net/165.220/movie/9014cb2360cc64d64acb3abe18d33552131346.jpg","sc":7.7,"ver":"2D","rt":"2015-02-06上映","dur":120,"nm":"一路惊喜","src":"","showDate":"","scm":"除夕夜奇遇，转角有惊喜","imax":false,"snum":73973,"preSale":0,"vd":"","dir":"金依萌,潘安子,章家瑞,宋迪","star":"郭采洁,凤小岳,赵丽颖","cat":"爱情,家庭,喜剧","wish":15223,"3d":false,"pn":251,"time":"","id":246049},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/7e15953aa8bc5be4e7bff00913426a06920765.jpg","sc":5.5,"ver":"2D","rt":"2015-07-31上映","dur":85,"nm":"美人鱼之海盗来袭","src":"","showDate":"","scm":"国产美人鱼，俩海盗来袭","imax":false,"snum":22001,"preSale":0,"vd":"","dir":"邱浩强","star":"李思娴,郭亚维,宋磊","cat":"动画,喜剧,冒险","wish":27716,"3d":false,"pn":38,"time":"","id":248550},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p1.meituan.net/165.220/movie/aea9291ff4c41e074e2edc2a2d9b20f9500507.jpg","sc":8.4,"ver":"2D/IMAX 2D/中国巨幕/全景声","rt":"2015-09-25上映","dur":113,"nm":"港囧","src":"","showDate":"","scm":"宝宝换包包，笑点没变少","imax":true,"snum":1921544,"preSale":0,"vd":"","dir":"徐峥","star":"徐峥,赵薇,包贝尔","cat":"喜剧,爱情,动作","wish":617005,"3d":false,"pn":498,"time":"","id":246577},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p0.meituan.net/165.220/movie/90422e83536df2153ecc57ff9703e99c1111187.jpg","sc":8.2,"ver":"2D","rt":"2015-10-23上映","dur":92,"nm":"既然青春留不住","src":"","showDate":"","scm":"校草撞菠菜，青春已不再","imax":false,"snum":84005,"preSale":0,"vd":"","dir":"田蒙","star":"张翰,陈乔恩,施予斐","cat":"喜剧,爱情","wish":78433,"3d":false,"pn":172,"time":"","id":246540},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p1.meituan.net/165.220/movie/d75604e123f8cdd8b52c069936f84f5b49504.jpg","sc":8.5,"ver":"2D","rt":"2015-10-30上映","dur":112,"nm":"我是证人","src":"","showDate":"","scm":"证词相矛盾，姐弟被围困","imax":false,"snum":237317,"preSale":0,"vd":"","dir":"安尚勋","star":"杨幂,鹿晗,王景春","cat":"悬疑,犯罪,惊悚","wish":139189,"3d":false,"pn":499,"time":"","id":247711},{"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","late":false,"img":"http://p1.meituan.net/165.220/movie/a70da0aefb82886efbae696181e966ff620085.jpg","sc":7.1,"ver":"2D","rt":"2016-06-24上映","dur":103,"nm":"近在咫尺的爱恋","src":"","showDate":"","scm":"真爱在身旁，挥拳为理想","imax":false,"snum":1189,"preSale":0,"vd":"","dir":"程孝泽","star":"彭于晏,郭采洁,杨子姗","cat":"爱情,运动,剧情","wish":12564,"3d":false,"pn":49,"time":"","id":57217},{"cnms":0,"sn":0,"showInfo":"2016-07-08 下周五上映","late":false,"img":"http://p1.meituan.net/165.220/movie/d7cfe72fdd511e549c5f827e8646b945730590.jpg","sc":0,"ver":"2D","rt":"下周五上映","dur":87,"nm":"张震讲故事之合租屋","src":"","showDate":"","scm":"惊悚合租屋，噩梦一幕幕","imax":false,"snum":78,"preSale":1,"vd":"","dir":"战越","star":"卢杉,傅亨,吴谨西","cat":"惊悚,悬疑,爱情","wish":4848,"3d":false,"pn":29,"time":"","id":368116},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p0.meituan.net/165.220/movie/55/9200128.jpg","sc":5.5,"ver":"2D","rt":"1980-01-01上映","dur":90,"nm":"泰山屠龙","src":"","showDate":"","scm":"","imax":false,"snum":2,"preSale":0,"vd":"","dir":"许先,江汉","star":"朱虹,夏冰心,黎汉持","cat":"动作","wish":0,"3d":false,"pn":0,"time":"","id":50461},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p0.meituan.net/165.220/movie/__20594644__8575832.jpg","sc":8,"ver":"2D","rt":"2013-08-29上映","dur":111,"nm":"被偷走的那五年","src":"","showDate":"","scm":"车祸丢回忆，丈夫已离去","imax":false,"snum":6348,"preSale":0,"vd":"","dir":"黄真真","star":"白百何,张孝全,范玮琪","cat":"爱情","wish":8566,"3d":false,"pn":49,"time":"","id":78183},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p0.meituan.net/165.220/movie/__19886997__1938344.jpg","sc":8.9,"ver":"2D","rt":"2013-09-13上映","dur":119,"nm":"全民目击","src":"","showDate":"","scm":"孙红雷一男战四女的爱恨情仇","imax":false,"snum":9011,"preSale":0,"vd":"","dir":"非行","star":"孙红雷,郭富城,余男","cat":"悬疑,犯罪","wish":4916,"3d":false,"pn":87,"time":"","id":78171},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p0.meituan.net/165.220/movie/__40811615__5745234.jpg","sc":8.6,"ver":"2D","rt":"2014-04-25上映","dur":98,"nm":"同桌的你","src":"","showDate":"","scm":"初恋要结婚，回国忆青春","imax":false,"snum":73121,"preSale":0,"vd":"","dir":"郭帆","star":"周冬雨,林更新,隋凯","cat":"剧情,爱情","wish":24267,"3d":false,"pn":88,"time":"","id":78653},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p1.meituan.net/165.220/movie/0fec3a88133e569ca0067e12f7ad0b80987252.jpg","sc":9.3,"ver":"2D/3D/中国巨幕","rt":"2015-04-02上映","dur":90,"nm":"战狼","src":"","showDate":"","scm":"铁血特种兵，兄弟生死情","imax":false,"snum":603513,"preSale":0,"vd":"","dir":"吴京","star":"吴京,余男,倪大红","cat":"动作,战争","wish":67199,"3d":true,"pn":143,"time":"","id":78304},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p0.meituan.net/165.220/movie/8a7d763dd6909a59bc0de8b3399e21d7391271.jpg","sc":8.5,"ver":"2D","rt":"2015-07-17上映","dur":113,"nm":"煎饼侠","src":"","showDate":"","scm":"电影要做好，人缘少不了","imax":false,"snum":1162913,"preSale":0,"vd":"","dir":"董成鹏","star":"董成鹏,袁姗姗,柳岩","cat":"喜剧","wish":175432,"3d":false,"pn":203,"time":"","id":246330},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p1.meituan.net/165.220/movie/ea15948d63d527d092a70e39cbb74636357253.jpg","sc":6.9,"ver":"2D","rt":"2016-06-03上映","dur":94,"nm":"记忆碎片","src":"","showDate":"","scm":"宿醉陷疑案，奋力查嫌犯","imax":false,"snum":3067,"preSale":0,"vd":"","dir":"朴裕焕","star":"雷佳音,夏梓桐,李菁","cat":"悬疑,喜剧,犯罪","wish":4154,"3d":false,"pn":47,"time":"","id":345923},{"cnms":0,"sn":0,"showInfo":"今天暂无场次","late":false,"img":"http://p0.meituan.net/165.220/movie/73f6abbb90259d1fa8a88fa907ca3062587352.jpg","sc":7.7,"ver":"3D/中国巨幕","rt":"2016-06-17上映","dur":86,"nm":"我叫MT之山口山战记","src":"","showDate":"","scm":"贱萌牛头人，爆笑刷副本","imax":false,"snum":21740,"preSale":0,"vd":"","dir":"核桃","star":"奶茶,YOYO,CBI","cat":"动画,喜剧,冒险","wish":43480,"3d":true,"pn":40,"time":"","id":246045}]
     */

    private DataBean data;

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {
        private boolean hasNext;
        /**
         * cnms : 0
         * sn : 0
         * showInfo : 今天150家影院放映1463场
         * late : false
         * img : http://p1.meituan.net/165.220/movie/2e0b5b5c6c086cc93068fbc212f9f6b0142193.jpg
         * sc : 8.6
         * ver : 2D/3D/中国巨幕
         * rt : 2016-06-24上映
         * dur : 126
         * nm : 惊天魔盗团2
         * src :
         * showDate :
         * scm : 周董变魔术，敌人挡不住
         * imax : false
         * snum : 170424
         * preSale : 0
         * vd :
         * dir : 朱浩伟
         * star : 杰西·艾森伯格,马克·鲁法洛,伍迪·哈里森
         * cat : 动作,喜剧,惊悚
         * wish : 513937
         * 3d : true
         * pn : 248
         * time :
         * id : 246333
         */

        private List<MoviesBean> movies;

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public static class MoviesBean {
            private int cnms;
            private int sn;
            private String showInfo;
            private boolean late;
            private String img;
            private double sc;
            private String ver;
            private String rt;
            private int dur;
            private String nm;
            private String src;
            private String showDate;
            private String scm;
            private boolean imax;
            private int snum;
            private int preSale;
            private String vd;
            private String dir;
            private String star;
            private String cat;
            private int wish;
//            @com.google.gson.annotations.SerializedName("3d")
            private boolean value3d;
            private int pn;
            private String time;
            private int id;

            public int getCnms() {
                return cnms;
            }

            public void setCnms(int cnms) {
                this.cnms = cnms;
            }

            public int getSn() {
                return sn;
            }

            public void setSn(int sn) {
                this.sn = sn;
            }

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public String getShowDate() {
                return showDate;
            }

            public void setShowDate(String showDate) {
                this.showDate = showDate;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public boolean isImax() {
                return imax;
            }

            public void setImax(boolean imax) {
                this.imax = imax;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public int getPreSale() {
                return preSale;
            }

            public void setPreSale(int preSale) {
                this.preSale = preSale;
            }

            public String getVd() {
                return vd;
            }

            public void setVd(String vd) {
                this.vd = vd;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public boolean isValue3d() {
                return value3d;
            }

            public void setValue3d(boolean value3d) {
                this.value3d = value3d;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}