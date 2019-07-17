package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.bridge;

/**
 * @ClassName: FilmStar
 * @date: 2019/7/16  14:03
 * @author: guohao
 * @Description:
 */
public class FilmStar extends AbsStar{

    public FilmStar() {
        super(new ActFilm());
    }

    public FilmStar(AbsAction absAction) {
        super(absAction);
    }

    @Override
    public void doJob() {
        System.out.println("演员的工作");
        super.doJob();
    }
}
