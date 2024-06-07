package com.cc.musicplaylist.str;

import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;

public class StrTest {

    @Test
    void set(){
        String str = "起源于上世纪80年代后期和90年代早期，是一种将嘻哈音乐和爵士音乐融合的音乐形式，歌词通常乐观向上，具有良知，甚至是非洲中心起源思想。就节奏来说，爵士说唱的音乐还是更为嘻哈一点，不过歌曲旋律中会加上许多爵士乐中的乐器比如小号，低音提琴等等。\n" +
                "代表艺人：Gang Starr，Stetsasonic，Jungle Brothers，A Tribe Called Quest，De La Soul，Digable Planets，J Rawls，88 Keys，Crown City Rockers，Kero One，Nujabes，Asheru，Fat Jon，Herbaliser等\n" +
                "\n" +
                "Jazz-Hip hop是一种非常合适在行进、驾驶、运动期间听的音乐，是一种刚柔并济的音乐。\n" +
                "\n" +
                "既不如硬核Hip Hop那般强硬冲撞，亦不如纯器乐那样悄然柔软，也不会像部分后摇让人压抑。\n" +
                "\n" +
                "这种音乐往往用Rap词给人力量，用旋律给人温柔。\n" +
                "该风格起源于二十世纪八十年代末期(1980s)，当时大众对硬核嘻哈(Hard Core Hip Hop)有：「表达私欲」、「投掷情绪」、「侮辱他人」的质疑，而Jazz-Hip Hop的出现正是一种理性与中和。Jazz-Hip Hop保留嘻哈的节奏与说唱，使音乐始终轻快律动；又将爵士的旋律引入其中，大大降低了Hip Hop的敌意与冲撞。是一种更易入口、更中和的音乐";
        System.out.println(str);
        // 清理str里面的换行符
        String result = str.replaceAll("\\r|\\n", "");
        String s = ReUtil.replaceAll(str, "\\r|\\n", "");
        System.out.println(result);
        System.out.println(s);
        System.out.println(StrUtil.subPreGbk(s, 300, false));
    }
}
