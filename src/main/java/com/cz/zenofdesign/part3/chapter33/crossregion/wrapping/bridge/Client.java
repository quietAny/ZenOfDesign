package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.bridge;

/**
 * @ClassName: Client
 * @date: 2019/7/16  14:06
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        AbsStar filmStar = new FilmStar();
        AbsStar singStar = new SingStar();
        filmStar.doJob();
        singStar.doJob();
        filmStar = new FilmStar(new Sing());
        filmStar.doJob();
        singStar = new SingStar(new ActFilm());
        singStar.doJob();
    }
}
