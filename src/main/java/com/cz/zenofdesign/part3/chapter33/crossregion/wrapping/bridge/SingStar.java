package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.bridge;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * @ClassName: SingStar
 * @date: 2019/7/16  14:03
 * @author: guohao
 * @Description:
 */
public class SingStar extends AbsStar{

    public SingStar(){
        super(new Sing());
    }

    public SingStar(AbsAction absAction) {
        super(absAction);
    }

    @Override
    public void doJob() {
        System.out.println("歌星的工作：");
        super.doJob();
    }
}
